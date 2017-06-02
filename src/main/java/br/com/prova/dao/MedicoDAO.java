package br.com.prova.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.prova.modelo.Medico;

/**
 * @author Lucas Rocha
 * 
 * */

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
		em.remove( em.merge(medico) );
	}
	
	public void update ( Medico medico){
		em.merge(medico);
	}
	
	public void saveOrUpdate ( Medico medico){
		/** codigo vazio */
		if( medico.getCodigo() == 0 ){
			save(medico);//novo
			return;
		 }
		 update(medico);//atualizar
	}

}
 
	
		
