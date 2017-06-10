package br.com.prova.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.prova.modelo.Empregado;

/**
 * @author Lucas Rocha
 * 
 * */

@Repository
@Transactional
public class EmpregadoDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	
	public Empregado findtMedicoById ( Integer id){
		return  em.find(Empregado.class, id);
	}
	public List<Empregado> findAll (){
		return em.createQuery("SELECT e FROM Empregado e ", Empregado.class).getResultList();
	}
	public void save ( Empregado obj){
		em.persist(obj);
	}
	public void remove ( Empregado obj){
		em.remove( em.merge(obj) );
	}
	
	public void update ( Empregado obj){
		em.merge(obj);
	}
	

}
 
	
		
