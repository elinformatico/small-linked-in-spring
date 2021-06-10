package net.elinformatico.service;

import java.util.List;

import net.elinformatico.model.Vacante;

public interface IVacantes {
	public List<Vacante> buscarTodas();
	public Vacante buscarVacante(int idVacante, List<Vacante> vacantes);
}
