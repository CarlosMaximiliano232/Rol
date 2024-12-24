package com.example.Rol.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Personas {

	@Id
	private int id;
	private String nombres;
	private String apellido;
	private String sexo;
	private String pais;
	private String direccion;
	
	@OneToMany(mappedBy =  "idPersona", cascade = CascadeType.ALL)
	private List<Publicacion> lista = new ArrayList<>();
	
	
}
