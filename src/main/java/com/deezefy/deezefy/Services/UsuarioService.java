package com.deezefy.deezefy.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.deezefy.deezefy.Repositories.UsuarioRepository;
import com.deezefy.deezefy.dto.UsuarioDTO;
import com.deezefy.deezefy.entities.Usuario;

@Service
public class UsuarioService {
	 
	@Autowired
    private UsuarioRepository repo;

    @Transactional(readOnly = true)
    public List<UsuarioDTO> findAll() {
        List<Usuario> list = repo.findAll();
        return list.stream().map(x -> new UsuarioDTO(x)).collect(Collectors.toList());
    }

    @Transactional
    public UsuarioDTO insert(UsuarioDTO dto){
        Usuario usuario = new Usuario(dto.getEmail(), dto.getSenha(), dto.getData_nascimento());
        usuario = repo.save(usuario);
        return new UsuarioDTO(usuario);
    }
}
