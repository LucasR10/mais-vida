package br.com.prova.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.prova.modelo.Medico;

@Repository
@Transactional
public class MedicoDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public Medico findtMedicoById ( Integer id){
		return  em.find(Medico.class, id);
	}
	public List<Medico> findAll (){
		return em.createNamedQuery(Medico.FIND_ALL_MEDICOS, Medico.class).getResultList();
	}
	public void save ( Medico medico){
		em.persist(medico);
	}
	public void remove ( Medico medico){
		em.remove(medico);
	}
	
	public void update ( Medico medico){
		em.merge(medico);
	}
	
	public void saveOrUpdate ( Medico medico){
		/** codigo vazio */
		if(  0 == medico.getCodigo() ){
			save(medico);//novo
			return;
		 }
		 update(medico);//atualizar
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
