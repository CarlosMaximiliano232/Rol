package com.example.Rol.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Rol.Entity.UsuarioRol;



@Repository
public interface IUsuariorRolRepositorio extends JpaRepository<UsuarioRol, Integer>{

}
