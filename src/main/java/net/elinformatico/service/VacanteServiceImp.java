package net.elinformatico.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import net.elinformatico.model.Vacante;

public class VacanteServiceImp implements IVacantes {

	private List<Vacante> vacantes = null;
	
	public VacanteServiceImp() {
		
		vacantes = new LinkedList<Vacante>();
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
	}
	
	public List<Vacante> buscarTodas() {
		return vacantes;
	}

}
