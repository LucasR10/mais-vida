package br.com.prova.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.prova.dao.MedicoDAO;
import br.com.prova.modelo.Medico;

@Controller
@RequestMapping(value="/medico")
public class MedicoController {

	@RequestMapping(value="/buscar",method=RequestMethod.GET , produces = "application/json" )
	@ResponseBody
	public Medico buscar(){
		  System.out.println(" Buscando  !!");
		return new MedicoDAO().findById(1);
	}
	
	@RequestMapping(value="/listar",method=RequestMethod.GET , produces = "application/json" )
	@ResponseBody
	public List<Medico>	 listar(){
		  System.out.println(" Listando !!");
		return new MedicoDAO().findAll();
	}
}
