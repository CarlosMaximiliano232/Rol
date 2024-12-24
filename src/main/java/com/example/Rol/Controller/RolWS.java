package com.example.Rol.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.example.Rol.Entity.Rol;
import com.example.Rol.Service.RolServiceImp;

@RestController
@RequestMapping(path = "Rol")
public class RolWS {
	
	@Autowired
    private RolServiceImp servicio;

    // Listar
    @GetMapping
    public ResponseEntity<?> listar() {
        List<Rol> roles = servicio.listar();
        if (roles.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No existen registros");
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(roles);
        }
    }

    // Guardar
    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Rol rol) {
        Rol existente = servicio.buscar(rol.getId());
        if (existente == null) {
            servicio.guardar(rol);
            return ResponseEntity.status(HttpStatus.OK).body("Se guardó el registro con el id: " + rol.getId() + " con éxito");
        } else {
            return ResponseEntity.status(HttpStatus.FOUND).body("El id ya existe");
        }
    }

    // Buscar
    @GetMapping(path = "/{id}")
    public ResponseEntity<?> buscar(@PathVariable int id) {
        Rol encontrado = servicio.buscar(id);
        if (encontrado == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No existe el id");
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(encontrado);
        }
    }

    // Editar
    @PutMapping
    public ResponseEntity<?> editar(@RequestBody Rol rol) {
        Rol existente = servicio.buscar(rol.getId());
        if (existente == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No existe el id");
        } else {
            servicio.editar(rol);
            return ResponseEntity.status(HttpStatus.OK).body("Se editó correctamente");
        }
    }

    // Eliminar
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Map<String, String>> eliminar(@PathVariable("id") int id) {
        Rol encontrado = servicio.buscar(id);
        if (encontrado != null) {
            servicio.eliminar(id);
            Map<String, String> response = new HashMap<>();
            response.put("message", "Registro eliminado correctamente");
            return ResponseEntity.status(HttpStatus.OK).body(response);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
