package com.deezefy.deezefy.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deezefy.deezefy.Repositories.UsuarioRepository;
import com.deezefy.deezefy.Services.UsuarioService;
import com.deezefy.deezefy.dto.UsuarioDTO;
import com.deezefy.deezefy.entities.Usuario;

@RestController
@RequestMapping(value = "/")
public class UsuarioController {

	@Autowired
	private UsuarioService service;
	@Autowired
	private UsuarioRepository repo;
	
	@GetMapping(value = "users")
	public ResponseEntity<List<UsuarioDTO>> findAll() {
		List<UsuarioDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "insert")
	public UsuarioDTO insert(UsuarioDTO dto){
        Usuario usuario = new Usuario(dto.getEmail(), dto.getSenha(), dto.getData_nascimento());
        usuario = repo.save(usuario);
        return new UsuarioDTO(usuario);
    }
}
