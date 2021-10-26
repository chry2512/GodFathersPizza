package it.epicode.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import it.epicode.config.MenuConfig;
import it.epicode.model.GestioneOrdine;
import it.epicode.model.Ordine;
import it.epicode.model.Menu;

@Controller
public class MyController {
	private AnnotationConfigApplicationContext myContext= new AnnotationConfigApplicationContext(MenuConfig.class);
	
	
	@GetMapping("/menu")
	public ModelAndView Menu() {
		//View da visualizzare
		ModelAndView myView= new ModelAndView("menu");
		//Istanza della classe da passare alla view
		Menu menu= (Menu) myContext.getBean("menu");
		//aggiunge la classe alla view
		myView.addObject("menu", menu);
		return myView;
	}
	
	@GetMapping("/ordini")
	public ModelAndView myOrder()  {
		ModelAndView myView = new ModelAndView("ordini");
		GestioneOrdine go= (GestioneOrdine) myContext.getBean("listaOrd");
		myView.addObject("ordini", go);
		return myView;
	}
	
	@GetMapping("/orderlist/{id}")
	public ModelAndView myListOrder(@PathVariable int id) {
		ModelAndView myView= new ModelAndView("orderlist");
		GestioneOrdine go= (GestioneOrdine) myContext.getBean("listaOrd");
		Ordine or= go.getById(id);
		myView.addObject("ordine", or);
		return myView;


	}
	
	


}
