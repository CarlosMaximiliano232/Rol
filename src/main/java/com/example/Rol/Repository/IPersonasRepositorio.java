package com.example.Rol.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Rol.Entity.Personas;


@Repository
public interface IPersonasRepositorio extends JpaRepository<Personas, Integer>{

}
