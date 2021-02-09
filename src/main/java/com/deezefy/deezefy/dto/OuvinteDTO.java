package com.deezefy.deezefy.dto;

import java.io.Serializable;

import com.deezefy.deezefy.entities.Ouvinte;

public class OuvinteDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String telefone[];
    private String primeiro_nome;
    private String sobrenome;
	
	public OuvinteDTO() {
	}

	public OuvinteDTO(String[] telefone, String primeiro_nome, String sobrenome) {
        super();
        this.telefone = telefone;
        this.primeiro_nome = primeiro_nome;
        this.sobrenome = sobrenome;
    }
	
	public OuvinteDTO(Ouvinte entity) {
        telefone = entity.getTelefone();
        primeiro_nome = entity.getPrimeiro_nome();
        sobrenome = entity.getSobrenome();
	}

	public String[] getTelefone() {
		return telefone;
	}

	public void setTelefone(String[] telefone) {
		this.telefone = telefone;
	}

	public String getPrimeiro_nome() {
		return primeiro_nome;
	}

	public void setPrimeiro_nome(String primeiro_nome) {
		this.primeiro_nome = primeiro_nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}
