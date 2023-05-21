package com.controle.gestaofesta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Convidado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	

	private String nome;
	
	private int quantidadeAcompanhantes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidadeAcompanhantes() {
		return quantidadeAcompanhantes;
	}

	public void setQuantidadeAcompanhantes(int quantidadeAcompanhantes) {
		this.quantidadeAcompanhantes = quantidadeAcompanhantes;
	}
	
	

}
