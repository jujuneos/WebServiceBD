package com.deezefy.deezefy.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario", schema = "deezefy")
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private String email;
    private String senha;
    private Date data_nascimento;

    public Usuario() {
    }

    public Usuario(String email, String senha, Date data_nascimento) {
        super();
        this.email = email;
        this.senha = senha;
        this.data_nascimento = data_nascimento;
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
   
}
