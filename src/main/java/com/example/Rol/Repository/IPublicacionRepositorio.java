package com.example.Rol.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Rol.Entity.Publicacion;



@Repository
public interface IPublicacionRepositorio extends JpaRepository<Publicacion, Integer>{

}
