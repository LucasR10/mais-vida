package br.com.prova.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Entity;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.prova.modelo.Medico;

@Repository
@Transactional
public class MedicoDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public Medico findtMedicoById ( Integer id){
		return Facede.getMedicos().get(id);
	}
	public List<Medico> findAll (){
		return Facede.getMedicos();
	}
	public void save ( Medico medico){
		///
	}
	public void remove ( Medico medico){
		///
	}
	
	public void update ( Medico medico){
		///
	}

}
 
class Facede{
	
	private static List<Medico> medicos = new ArrayList<>();
	
	static{
		medicos.add(new Medico("John", "Boo", "jonh@gmail.com", false, false));
		medicos.add(new Medico("Mary", "Brown", "mary@gmail.com", false, true));
		medicos.add(new Medico("James", "Moary", "james@gmail.com", true, false));
	}
	
	public static List<Medico> getMedicos() {
		return medicos;
	}
}
