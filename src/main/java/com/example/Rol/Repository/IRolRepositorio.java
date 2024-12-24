package com.example.Rol.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Rol.Entity.Rol;

@Repository
public interface IRolRepositorio extends JpaRepository<Rol, Integer>{

}
