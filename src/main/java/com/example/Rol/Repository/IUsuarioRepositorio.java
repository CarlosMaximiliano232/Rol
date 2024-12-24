package com.example.Rol.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Rol.Entity.Usuario;



@Repository
public interface IUsuarioRepositorio extends JpaRepository<Usuario, Integer>{

	
}
