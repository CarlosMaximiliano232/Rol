package com.example.Rol.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Rol {

	@Id
	private int id;
	private String tipo;
	
	@ManyToMany(mappedBy =  "idRol", cascade = CascadeType.ALL)
	List<UsuarioRol> lista = new ArrayList<>();
}
