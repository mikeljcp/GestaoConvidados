package com.controle.gestaofesta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.controle.gestaofesta.model.Convidado;
import com.controle.gestaofesta.repository.Convidados;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {
	
	
	//Injection dos convidados e metodos CRUD
	@Autowired
	private Convidados convidados;
	
	
	//Realiza uma requisição do tipo GET solicitando a lista dos convidados
	@GetMapping
	public ModelAndView listar() {
		// Chama o HTMl no endereço ListaConvidados.html
		ModelAndView modelAndView = new ModelAndView("ListaConvidados");
		
		//Adiciona objetos na view para apresentar
		modelAndView.addObject("convidados", convidados.findAll());
		modelAndView.addObject(new Convidado());
		return modelAndView;
	}

	//Reliza uma requisição do tipo POST para salvar um dos convidados no BD
	@PostMapping
	public String salvar(Convidado convidado) {
		this.convidados.save(convidado);
		//atualiza a página para verificar alterações
		return "redirect:/convidados";
	}
	


}
