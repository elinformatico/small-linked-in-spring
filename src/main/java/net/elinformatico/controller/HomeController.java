package net.elinformatico.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String getHome(Model model) 
	{	
		model.addAttribute("title", "Pagina Principal Empleos");
		model.addAttribute("message", "Bienvenido a la Pagina Principal para Buscar Empleos");
		model.addAttribute("date", new Date());
		return "home/home";
	}
}
