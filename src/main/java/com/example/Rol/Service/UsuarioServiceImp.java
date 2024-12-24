package com.example.Rol.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.Rol.Entity.Usuario;
import com.example.Rol.Repository.IUsuarioRepositorio;



@Service
public class UsuarioServiceImp implements IusaurioService {

	@Autowired
	IUsuarioRepositorio dao;

	@Override
	public List<Usuario> listar() {
		return dao.findAll(Sort.by(Sort.Direction.ASC, "id"));
	}

	@Override
	public void guardar(Usuario usuario) {
		dao.save(usuario);
		
	}

	@Override
	public Usuario buscar(int usuario) {
		return dao.findById(usuario).orElse(null);
	}

	@Override
	public void editar(Usuario usuario) {
		dao.save(usuario);
		
	}

	@Override
	public void eliminar(int usuario) {
		dao.deleteById(usuario);
		
	}
	
	
	

}
