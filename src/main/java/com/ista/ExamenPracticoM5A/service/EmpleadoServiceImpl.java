/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ista.ExamenPracticoM5A.service;


import com.ista.ExamenPracticoM5A.entity.Empleado;
import com.ista.ExamenPracticoM5A.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
/**
 *
 * @author matei
 */
@Service
public class EmpleadoServiceImpl extends GenericServiceImpl<Empleado, Integer> implements EmpleadoService{
	
    @Autowired
	   EmpleadoRepository empleadoRepository;
	
	@Override
	public CrudRepository<Empleado, Integer> getDao() {
		// TODO Auto-generated method stub
		return empleadoRepository;
	}
	
	public Empleado buscarEmpleado(String id_empleado) {
		return empleadoRepository.buscarEmpleado(id_empleado);
	}
    
}
