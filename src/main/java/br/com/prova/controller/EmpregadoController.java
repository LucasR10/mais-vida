package br.com.prova.controller;

import java.util.ArrayList;
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

import br.com.prova.dao.EmpregadoDAO;
import br.com.prova.modelo.Empregado;
import br.com.prova.modelo.Telefone;


/**
 * @author Lucas Rocha
 * 
 * */

@Controller
@RequestMapping(value="/empregado")
public class EmpregadoController {
  
	@Autowired
	private EmpregadoDAO  dao;
	
	@RequestMapping(value="/buscar/{codigo}",method=RequestMethod.GET , produces = "application/json" )
	@ResponseBody
	public Empregado buscar(@PathVariable Integer codigo){
		try{
		  return dao.findtMedicoById(codigo);
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping(value="/listar",method=RequestMethod.GET , produces = "application/json" )
	@ResponseBody
	public List<Empregado>	 listar(){
	   return dao.findAll();
	}
	@RequestMapping(value="adicionar",method=RequestMethod.POST , consumes="application/json")
	@ResponseStatus(value = HttpStatus.OK) 
	public  void adicionar(@RequestBody Empregado emp ){
		 dao.save(emp);
	} 
	
	@RequestMapping(value="excluir/{codigo}",method=RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.OK) 	
	public  void remover(@PathVariable int codigo ){	
		if( codigo  < 0 ) return; //codigo invalido.
		  dao.remove( dao.findtMedicoById( codigo) );
	} 
	
	//testa salvar
	
	@RequestMapping(value="/test",method=RequestMethod.GET , produces = "application/json" )
	@ResponseBody
	public String	 test(){
		List<Telefone> telefones = new ArrayList<>();
		Empregado emp = new Empregado(); 
		
		emp.setNome("EMP 1");
		emp.setSalario(1000D);
		
		
		telefones.add( new Telefone("home1",345,"3333-45321" , emp )  );
		telefones.add( new Telefone("home2",345,"3333-45312", emp ) );
		
		 emp.setTelefones(telefones);
		
		 
		dao.save(emp);
		return "Dasdos cadastrado !!";
	}
}
