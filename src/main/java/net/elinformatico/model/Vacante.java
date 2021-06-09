package net.elinformatico.model;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class Vacante {

	private Integer id;
	private String nombre;
	private String descripcion;
	private Date fecha;
	private Boolean status;
	private Double salario;
	
	public Integer getId() {
		return id;
	}
	
	public Vacante() { }
	
	public Vacante(String nombre, String descripcion, Date fecha, Boolean status, Double salario) {
		super();
		this.id = ThreadLocalRandom.current().nextInt(1, 100 + 1);
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.status = status;
		this.salario = salario;
	}
	
	public Vacante(Integer id, String nombre, String descripcion, Date fecha, Boolean status, Double salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.status = status;
		this.salario = salario;
	}
	
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Vacante [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha=" + fecha
				+ ", status=" + status + ", salario=" + salario + "]";
	}
}
