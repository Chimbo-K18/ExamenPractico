/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ista.ExamenPracticoM5A.entity;

/**
 *
 * @author matei
 */
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "empleado")
public class Empleado {

   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private Integer id_empleado;
   
    @Column(name = "nombre", length = 45, nullable = false)
    private String nombre;
    
    @Column(name = "apellido", length = 45, nullable = false)
    private String apellido;
    
    @Column(name = "telefono", length = 15, nullable = false)
    private String telefono;
    
    @Column(name = "direccion", length = 45, nullable = false)
    private String direccion;
    
    @Column(name = "fecha_nacimiento", nullable = false)
    private Date fecha_nacimiento;
    
    @Column(name = "observacion", length = 45, nullable = false)
    private String observacion;
    
    @Column(name = "dias_trabajo", nullable = false)
    private String dias_trabajo;
    
    @Column(name = "sueldo", nullable = false)
    private String sueldo;
    
    
}
