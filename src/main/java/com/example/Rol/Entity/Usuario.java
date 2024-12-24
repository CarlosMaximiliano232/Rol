package com.example.Rol.Entity;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Usuario {

	@Id
	private Integer id;
	private String usuario;
	private String contrasena;
	private String estado;
	
	@OneToMany(mappedBy =  "idUsuario", cascade = CascadeType.ALL)
	private List<UsuarioRol> lista = new ArrayList<>();
	
	
}
