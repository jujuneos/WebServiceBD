package com.deezefy.deezefy.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deezefy.deezefy.Services.UsuarioService;
import com.deezefy.deezefy.dto.UsuarioDTO;

@RestController
@RequestMapping(value = "/users")
public class UsuarioController {

	@Autowired
	private UsuarioService service;
	
	@GetMapping
	public ResponseEntity<List<UsuarioDTO>> findAll() {
		List<UsuarioDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
