package com.example.Rol.Service;

import java.util.List;

import com.example.Rol.Entity.Usuario;



public interface IusaurioService {

	public List<Usuario> listar();
	
	public void guardar(Usuario usuario);
	
	public Usuario buscar(int usuario);
	
	public void editar(Usuario usuario);
	
	public void eliminar(int usuario);
}
