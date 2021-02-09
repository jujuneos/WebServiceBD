package com.deezefy.deezefy.Controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.deezefy.deezefy.Services.OuvinteService;
import com.deezefy.deezefy.dto.OuvinteDTO;

@RestController
@RequestMapping(value = "/listeners")
public class OuvinteController {

	@Autowired
	private OuvinteService service;
	
	@GetMapping
    public ResponseEntity<List<OuvinteDTO>> findAll() {
        List<OuvinteDTO> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<OuvinteDTO> insere(@RequestBody OuvinteDTO dto) {
        dto = service.insere(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{sobrenome}")
                .buildAndExpand(dto.getSobrenome()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }
}
