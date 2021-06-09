package net.elinformatico.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.elinformatico.model.Vacante;

@Controller
public class HomeController {

	@GetMapping("/mostrar-vacante")
	public String mostrarVacante(Model model) {
		
		Vacante vacante = new Vacante();
		vacante.setId(1);
		vacante.setNombre("Full Stack Developer");
		vacante.setDescripcion("HCL is looking for a Full Stack Developer");
		vacante.setFecha(new Date());
		vacante.setStatus(true);
		vacante.setSalario(30000.0);
		
		model.addAttribute("vacante", vacante);
		
		return "mostrar-vacante";
	}
	
	@GetMapping("/listado-empleos")
	public String getListado(Model model) {
		
		//listadoEmpleos.add("DBA Administrator");
		model.addAttribute("title", "Listado de Vacantes");
		model.addAttribute("vacantes", getVacantes());
		
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
	
	private List<Vacante> getVacantes() {
		
		List<Vacante> vacantes = new LinkedList<Vacante>();
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			vacantes.add(new Vacante(1, "Ingeniero en Sistemas", 
					"Encargado de Sistemas", formato.parse("08-06-2021"), true, 15000.0, true));
			vacantes.add(new Vacante(2, "Java Developer", 
					"Desarrollador con Experiencia en Java", formato.parse("08-06-2021"), true, 20000.0, false));
			vacantes.add(new Vacante(3, "Software Enginner", 
					"Conocer muchas areas de Desarrollo y Tecnologias", formato.parse("08-06-2021"), false, 25000.0, false));
			vacantes.add(new Vacante(4, "Full Stack Developer", 
					"Dominar la mayoria de las tecnologias", formato.parse("08-06-2021"), false, 40000.0, true));
			vacantes.add(new Vacante(5, "DBA Administrator", 
					"Conocer SQL y NO-SQL", formato.parse("08-06-2021"), true, 20000.0, true));
			vacantes.add(new Vacante(6, "Front-End Developer", 
					"Conocer ReactJS y Angular", formato.parse("08-06-2021"), true, 25000.0, false));
		
		} catch (ParseException e) {
			System.out.println("Error en Fecha: " + e.getMessage());
		}
		return vacantes;
	}
}
