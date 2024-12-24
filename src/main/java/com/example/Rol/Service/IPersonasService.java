package com.example.Rol.Service;

import java.util.List;

import com.example.Rol.Entity.Personas;


public interface IPersonasService {

	public List<Personas> listar();
	
	public void guardar(Personas personas);
	
	public Personas buscar(int personas);
	
	public void editar(Personas personas);
	
	public void eliminar(int personas);
}
