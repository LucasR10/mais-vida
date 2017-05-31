package br.com.prova.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.prova.modelo.Medico;

@Repository
public class MedicoDAO {
	
	public Medico findById ( int id){
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
