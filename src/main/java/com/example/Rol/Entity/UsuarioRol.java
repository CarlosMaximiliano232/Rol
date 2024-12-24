package com.example.Rol.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "USUARIOROL")
@Data
public class UsuarioRol {

	@Id
	private int id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_ROL",nullable=false)
	private Rol idRol;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_USUARIO",nullable=false)
	private Usuario idUsuario;
}
