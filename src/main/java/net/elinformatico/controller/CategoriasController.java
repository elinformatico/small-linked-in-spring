package net.elinformatico.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = {"/categorias"})
public class CategoriasController {

	// @GetMapping("/index")
	@RequestMapping(path = "/index", method = RequestMethod.GET)
	public String mostrarIndexx() {
		return "categorias/listCategorias";
	}
	
	// @GetMapping("/create")
	@RequestMapping(path = "/create", method = RequestMethod.GET)
	public String crear() {
		return "categorias/formCategoria";
	}
	
	// @PostMapping("/save")
	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public String save() {
		return "categorias/listCategorias";
	}
}
