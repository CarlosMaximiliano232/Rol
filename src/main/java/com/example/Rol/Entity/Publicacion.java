package com.example.Rol.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Publicacion {

	@Id
	private int id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "IDPERSONA",nullable=false)
	private Personas idPersona;
	private String cuerpo;
}
