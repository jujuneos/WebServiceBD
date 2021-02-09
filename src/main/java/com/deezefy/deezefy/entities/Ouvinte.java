package com.deezefy.deezefy.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "usuario", schema = "deezefy")
public class Ouvinte extends Usuario {
	
	private static final long serialVersionUID = 1L;

    private String telefone[];
    private String primeiro_nome;
    private String sobrenome;

    public Ouvinte() {
    }

    public Ouvinte(String[] telefone, String primeiro_nome, String sobrenome) {
        super();
        this.telefone = telefone;
        this.primeiro_nome = primeiro_nome;
        this.sobrenome = sobrenome;
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
