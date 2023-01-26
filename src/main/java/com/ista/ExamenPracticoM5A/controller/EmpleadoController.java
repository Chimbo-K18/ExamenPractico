/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ista.ExamenPracticoM5A.controller;

import com.ista.ExamenPracticoM5A.entity.Empleado;
import com.ista.ExamenPracticoM5A.service.EmpleadoService;
import java.util.List;

import javax.validation.Valid;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author matei
 */
@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/empleado")
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    @GetMapping("/listar")
    
    public ResponseEntity< List<Empleado>> obtenerLista() {
        return new ResponseEntity<>(empleadoService.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Empleado> crear(@RequestBody Empleado c) {
        return new ResponseEntity<>(empleadoService.save(c), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Empleado> eliminar(@PathVariable Integer id) {
        empleadoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Empleado> actualizarUsuario(@PathVariable Integer id, @RequestBody Empleado c) {
        Empleado empleado = empleadoService.findById(id);
        if (empleado == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                empleado.setNombre(c.getNombre());
                empleado.setApellido(c.getApellido());
                empleado.setTelefono(c.getTelefono());
                empleado.setDireccion(c.getDireccion());
                empleado.setFecha_nacimiento(c.getFecha_nacimiento());
                empleado.setObservacion(c.getObservacion());
                empleado.setDias_trabajo(c.getDias_trabajo());
                empleado.setSueldo(c.getSueldo());

                return new ResponseEntity<>(empleadoService.save(empleado), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        }

    }
}
