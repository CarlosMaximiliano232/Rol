package com.example.Rol.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Rol.Entity.Publicacion;
import com.example.Rol.Service.PublicacionServiceImp;



@RestController
@RequestMapping(path = "Publicacion")
public class PublicaacionWS {

	 @Autowired
	    private PublicacionServiceImp servicio;

	    // Listar
	    @GetMapping
	    public ResponseEntity<?> listar() {
	        List<Publicacion> publicaciones = servicio.listar();
	        if (publicaciones.isEmpty()) {
	            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No existen registros");
	        } else {
	            return ResponseEntity.status(HttpStatus.OK).body(publicaciones);
	        }
	    }

	    // Guardar
	    @PostMapping
	    public ResponseEntity<?> guardar(@RequestBody Publicacion publicacion) {
	        Publicacion existente = servicio.buscar(publicacion.getId());
	        if (existente == null) {
	            servicio.guardar(publicacion);
	            return ResponseEntity.status(HttpStatus.OK).body("Se guardó el registro con el id: " + publicacion.getId() + " con éxito");
	        } else {
	            return ResponseEntity.status(HttpStatus.FOUND).body("El id ya existe");
	        }
	    }

	    // Buscar
	    @GetMapping(path = "/{id}")
	    public ResponseEntity<?> buscar(@PathVariable int id) {
	        Publicacion encontrada = servicio.buscar(id);
	        if (encontrada == null) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No existe el id");
	        } else {
	            return ResponseEntity.status(HttpStatus.OK).body(encontrada);
	        }
	    }

	    // Editar
	    @PutMapping
	    public ResponseEntity<?> editar(@RequestBody Publicacion publicacion) {
	        Publicacion existente = servicio.buscar(publicacion.getId());
	        if (existente == null) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No existe el id");
	        } else {
	            servicio.editar(publicacion);
	            return ResponseEntity.status(HttpStatus.OK).body("Se editó correctamente");
	        }
	    }

	    // Eliminar
	    @DeleteMapping(path = "/{id}")
	    public ResponseEntity<Map<String, String>> eliminar(@PathVariable("id") int id) {
	        Publicacion encontrada = servicio.buscar(id);
	        if (encontrada != null) {
	            servicio.eliminar(id);
	            Map<String, String> response = new HashMap<>();
	            response.put("message", "Registro eliminado correctamente");
	            return ResponseEntity.status(HttpStatus.OK).body(response);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
}
