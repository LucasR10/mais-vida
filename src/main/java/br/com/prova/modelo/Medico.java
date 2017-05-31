package br.com.prova.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

		/**
		 * @author Lucas Rocha
		 * @since 31/05/2017
		 * */
@Entity
public class Medico implements Serializable {

	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int codigo ;
	private String primeiroNome;
	private String ultimoNome;
	private String email;
	private boolean  ativo;
	private boolean ocupado;
	
	public Medico() {

	}
	
	public Medico(String primeiroNome, String ultimoNome, String email, boolean ativo, boolean ocupado) {
		super();
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.email = email;
		this.ativo = ativo;
		this.ocupado = ocupado;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public String getUltimoNome() {
		return ultimoNome;
	}
	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
