package net.elinformatico.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/listado-empleos")
	public String getListado(Model model) {
		
		List<String> listadoEmpleos = new LinkedList<>();
		
		listadoEmpleos.add("Ingeniero de Sistemas");
		listadoEmpleos.add("Java Developer Junio");
		listadoEmpleos.add("Java Developer Senior");
		listadoEmpleos.add("Software Enginner");
		listadoEmpleos.add("Full Stack Developer");
		listadoEmpleos.add("DBA Administrator");
		
		model.addAttribute("title", "Listado de Vacantes");
		model.addAttribute("vacantes", listadoEmpleos);
		
		return "listado";
	}
	
	@GetMapping("/")
	public String getHome(Model model) 
	{	
		model.addAttribute("title", "Pagina Principal Empleos");
		model.addAttribute("message", "Bienvenido a la Pagina Principal para Buscar Empleos");
		model.addAttribute("date", new Date());
		return "home";
	}
}
