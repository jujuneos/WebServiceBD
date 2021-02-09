package com.deezefy.deezefy.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.deezefy.deezefy.Repositories.OuvinteRepository;
import com.deezefy.deezefy.dto.OuvinteDTO;
import com.deezefy.deezefy.entities.Ouvinte;

@Service
public class OuvinteService {
    
    @Autowired
    private OuvinteRepository repo;

    @Transactional(readOnly = true)
    public List<OuvinteDTO> findAll() {
        List<Ouvinte> list = repo.findAll();
        return list.stream().map(x -> new OuvinteDTO(x)).collect(Collectors.toList());
    }

    @Transactional
    public OuvinteDTO insere(OuvinteDTO dto) {
        Ouvinte ouvinte = new Ouvinte(dto.getTelefone(), dto.getPrimeiro_nome(), dto.getSobrenome());
        ouvinte = repo.save(ouvinte);
        return new OuvinteDTO(ouvinte);
    }
}
