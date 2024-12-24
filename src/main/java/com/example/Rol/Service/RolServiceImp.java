package com.example.Rol.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.Rol.Entity.Rol;
import com.example.Rol.Repository.IRolRepositorio;

@Service
public class RolServiceImp implements IRolService{

	@Autowired
	IRolRepositorio dao;
	
	@Override
	public List<Rol> listar() {
		return dao.findAll(Sort.by(Sort.Direction.ASC, "id"));
	}

	@Override
	public void guardar(Rol rol) {
		dao.save(rol);
		
	}

	@Override
	public Rol buscar(int rol) {
		return dao.findById(rol).orElse(null);
	}

	@Override
	public void editar(Rol rol) {
		dao.save(rol);
		
	}

	@Override
	public void eliminar(int rol) {
		dao.deleteById(rol);
		
	}

	
}
