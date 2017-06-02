package br.com.prova.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.prova.dao.MedicoDAO;
import br.com.prova.modelo.Medico;


/**
 * @author Lucas Rocha
 * 
 * */

@Controller
@RequestMapping(value="/medico")
public class MedicoController {
  
	@Autowired
	private MedicoDAO dao;
	
	@RequestMapping(value="/buscar/{codigo}",method=RequestMethod.GET , produces = "application/json" )
	@ResponseBody
	public Medico buscar(@PathVariable Integer codigo){
		return dao.findtMedicoById(codigo);
	}
	
	@RequestMapping(value="/listar",method=RequestMethod.GET , produces = "application/json" )
	@ResponseBody
	public List<Medico>	 listar(){
		return dao.findAll();
	}
	@RequestMapping(value="adicionar",method=RequestMethod.POST , consumes="application/json")
	@ResponseStatus(value = HttpStatus.OK) 
	public  void adicionar(@RequestBody Medico medico ){
		 dao.saveOrUpdate(medico);
	} 
	@RequestMapping(value="excluir/{codigo}",method=RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.OK) 	
	public  void remover(@PathVariable int codigo ){	
		if( codigo  < 0 ) return; //codigo invalido.
		  dao.remove( dao.findtMedicoById( codigo) );
	} 
}
