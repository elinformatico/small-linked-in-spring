package net.elinformatico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.elinformatico.service.IVacantes;

@Controller
@RequestMapping(path = "/vacantes")
public class VacantesController {
	
	@Autowired
	private IVacantes vacantesService;

	// @GetMapping("/view/{id}")
	@RequestMapping(path = {"/view/{id}", "/ver/{id}", "/consultar/{id}"}, method = RequestMethod.GET)
	public String mostrarVacante(
			@PathVariable("id") int idVacante, 
			@RequestParam(name = "prop", required = false) String value, 
			Model model
	){	
		// System.out.println("engine: " + engine);
		model.addAttribute("title", "Mostrar Vacante # " +  idVacante);
		model.addAttribute("idVacante", idVacante);
		model.addAttribute("prop", value);
		return "vacantes/detalle";
	}
	
	//@GetMapping("/list")
	@RequestMapping(path = {"/list", "/lista", "/listado"}, method = RequestMethod.GET)
	public String getListado(Model model) {
		
		//listadoEmpleos.add("DBA Administrator");
		model.addAttribute("title", "Listado de Vacantes");
		model.addAttribute("vacantes", vacantesService.buscarTodas());
		
		return "vacantes/listado";
	}
	
	@GetMapping("/delete")
	public String eliminarVacante(
			@RequestParam("id") int idVacante,
			Model model
	){
		model.addAttribute("id", idVacante);
		return "vacantes/mensaje-eliminar";
	}
	
	@PostMapping("/registrar")
	public String registrarVacante(
			@RequestParam(name = "nombre", required = true) String nombre,
			@RequestParam(name = "edad", required = true) int edad,
			Model model
	){
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		
		model.addAttribute("nombre", nombre);
		model.addAttribute("edad", edad);
		
		return "vacantes/registrar-vacante";
	}
}
