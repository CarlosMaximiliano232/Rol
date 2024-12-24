package com.example.Rol.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.Rol.Entity.UsuarioRol;
import com.example.Rol.Repository.IUsuariorRolRepositorio;



@Service
public class UsuarioRolServiceImp implements IUsuarioRolService{

	@Autowired
	IUsuariorRolRepositorio dao;

	
	@Override
	public List<UsuarioRol> listar() {
		return dao.findAll(Sort.by(Sort.Direction.ASC, "id"));
	}

	@Override
	public void guardar(UsuarioRol usuariorol) {
		dao.save(usuariorol);
		
	}

	@Override
	public UsuarioRol buscar(int usuariorol) {
		return dao.findById(usuariorol).orElse(null);
	}

	@Override
	public void editar(UsuarioRol usuariorol) {
		dao.save(usuariorol);
		
	}

	@Override
	public void eliminar(int usuariorol) {
		dao.deleteById(usuariorol);
		
	}


}
