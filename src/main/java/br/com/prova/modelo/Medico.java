package br.com.prova.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

		/**
		 * @author Lucas Rocha
		 * 
		 * */
@Entity
@NamedQueries( @NamedQuery(name=Medico.FIND_ALL_MEDICOS , query="SELECT medico FROM Medico medico"))
public class Medico implements Serializable {

     /** NamedQuery */
	public final static String  FIND_ALL_MEDICOS = "medico.findAllMedicos";
	
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int codigo ;
	private String primeiroNome;
	private String ultimoNome;
	private String email;
	private String estado ;
	private String cidade;
	private String especialidade;
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	
	
}
