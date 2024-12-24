package com.example.Rol.Service;

import java.util.List;

import com.example.Rol.Entity.Rol;


public interface IRolService {

	public List<Rol> listar();
	
	public void guardar(Rol rol);
	
	public Rol buscar(int rol);
	
	public void editar(Rol rol);
	
	public void eliminar(int rol);
}
