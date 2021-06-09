package net.elinformatico.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.elinformatico.model.Vacante;

@Controller
@RequestMapping(path = "/vacantes")
public class VacantesController {

	// @GetMapping("/view/{id}")
	@RequestMapping(path = {"/view/{id}", "/ver/{id}", "/consultar/{id}"}, method = RequestMethod.GET)
	public String mostrarVacante(@PathVariable("id") int idVacante, Model model) 
	{	
		model.addAttribute("title", "Mostrar Vacante # " +  idVacante);
		model.addAttribute("idVacante", idVacante);
		return "vacantes/detalle";
	}
	
	//@GetMapping("/list")
	@RequestMapping(path = {"/list", "/lista", "/listado"}, method = RequestMethod.GET)
	public String getListado(Model model) {
		
		//listadoEmpleos.add("DBA Administrator");
		model.addAttribute("title", "Listado de Vacantes");
		model.addAttribute("vacantes", getVacantes());
		
		return "vacantes/listado";
	}
	
	private List<Vacante> getVacantes() {
		
		List<Vacante> vacantes = new LinkedList<Vacante>();
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			vacantes.add(new Vacante(1, "Ingeniero en Sistemas", 
					"Encargado de Sistemas", formato.parse("08-06-2021"), true, 15000.0, true, null));
			vacantes.add(new Vacante(2, "Java Developer", 
					"Desarrollador con Experiencia en Java", formato.parse("08-06-2021"), true, 20000.0, false, "oracle.png"));
			vacantes.add(new Vacante(3, "Software Enginner", 
					"Conocer muchas areas de Desarrollo y Tecnologias", formato.parse("08-06-2021"), false, 25000.0, false, "hcl.png"));
			vacantes.add(new Vacante(4, "Full Stack Developer", 
					"Dominar la mayoria de las tecnologias", formato.parse("08-06-2021"), false, 40000.0, true, "google.png"));
			vacantes.add(new Vacante(5, "DBA Administrator", 
					"Conocer SQL y NO-SQL", formato.parse("08-06-2021"), true, 20000.0, true, null));
			vacantes.add(new Vacante(6, "Front-End Developer", 
					"Conocer ReactJS y Angular", formato.parse("08-06-2021"), true, 25000.0, false, "hcl.png"));
			
			Vacante v6 = new Vacante();
			v6.setId(6);
			v6.setNombre("DevOps");
			v6.setDescripcion("DevOps Engineer with experience in CI/CD");
			v6.setFecha(formato.parse("08-06-2021"));
			v6.setSalario(35000.0);
			v6.setStatus(true);
			v6.setDestacado(true);
			v6.setLogo("hcl.png");
			
			vacantes.add(v6);
		
		} catch (ParseException e) {
			System.out.println("Error en Fecha: " + e.getMessage());
		}
		return vacantes;
	}
	
	private Vacante buscarVacante(int idVacante, List<Vacante> vacantes) {
		
		// TODO Buscar informacion en la Base de Datos
		
		Vacante vacanteFound = new Vacante();
		return vacanteFound;
	}
}
