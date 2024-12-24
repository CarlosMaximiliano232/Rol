package com.example.Rol.Service;

import java.util.List;

import com.example.Rol.Entity.UsuarioRol;


public interface IUsuarioRolService {


	public List<UsuarioRol> listar();
	
	public void guardar(UsuarioRol usuariorol);
	
	public UsuarioRol buscar(int usuariorol);
	
	public void editar(UsuarioRol usuariorol);
	
	public void eliminar(int usuariorol);
}
