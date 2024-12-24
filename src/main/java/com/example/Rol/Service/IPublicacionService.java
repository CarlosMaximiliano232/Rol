package com.example.Rol.Service;

import java.util.List;

import com.example.Rol.Entity.Publicacion;


public interface IPublicacionService {

public List<Publicacion> listar();
	
	public void guardar(Publicacion publicacion);
	
	public Publicacion buscar(int publicacion);
	
	public void editar(Publicacion publicacion);
	
	public void eliminar(int publicacion);
}
