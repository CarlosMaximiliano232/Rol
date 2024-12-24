package com.example.Rol.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.Rol.Entity.Publicacion;
import com.example.Rol.Repository.IPublicacionRepositorio;



@Service
public class PublicacionServiceImp implements IPublicacionService{

	@Autowired
	IPublicacionRepositorio dao;

	@Override
	public List<Publicacion> listar() {
		return dao.findAll(Sort.by(Sort.Direction.ASC, "id"));
	}

	@Override
	public void guardar(Publicacion publicacion) {
		dao.save(publicacion);
		
	}

	@Override
	public Publicacion buscar(int publicacion) {
		return dao.findById(publicacion).orElse(null);
	}

	@Override
	public void editar(Publicacion publicacion) {
		dao.save(publicacion);
		
	}

	@Override
	public void eliminar(int publicacion) {
		dao.deleteById(publicacion);
		
	}


}
