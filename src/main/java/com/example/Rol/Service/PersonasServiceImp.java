package com.example.Rol.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.Rol.Entity.Personas;
import com.example.Rol.Repository.IPersonasRepositorio;


@Service
public class PersonasServiceImp implements IPersonasService{

	@Autowired
	IPersonasRepositorio dao;

	@Override
	public List<Personas> listar() {
		return dao.findAll(Sort.by(Sort.Direction.ASC, "id"));
	}

	@Override
	public void guardar(Personas personas) {
		dao.save(personas);
		
	}

	@Override
	public Personas buscar(int personas) {
		return dao.findById(personas).orElse(null);
	}

	@Override
	public void editar(Personas personas) {
		dao.save(personas);
		
	}

	@Override
	public void eliminar(int personas) {
		dao.deleteById(personas);
		
	}


}
