package br.com.prova.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Empregado implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String nome;
	private Double salario;
	
	//@JsonBackReferenc
	//@JsonIgnore
	@JsonBackReference
	@OneToMany(cascade=CascadeType.ALL , mappedBy="empregado",fetch= FetchType.LAZY )
	private List<Telefone> telefones;
	
	public Empregado() {
	}

	
	public Empregado(Integer id, String nome, Double salario, List<Telefone> telefones) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		this.telefones = telefones;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	//@JsonIgnore
	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	private static final long serialVersionUID = 1L;

	;

}