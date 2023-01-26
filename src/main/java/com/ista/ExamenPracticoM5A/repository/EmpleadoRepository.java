/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ista.ExamenPracticoM5A.repository;


import com.ista.ExamenPracticoM5A.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author matei
 */
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>{
   
    @Query(value = "Select * from empleado c where c.id_empleado= :id_empleado", nativeQuery = true)
	public Empleado buscarEmpleado(String id_empleado);
}
