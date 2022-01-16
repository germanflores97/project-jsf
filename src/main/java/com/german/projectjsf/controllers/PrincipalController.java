package com.german.projectjsf.controllers;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.german.projectjsf.entity.Empleado;
import com.german.projectjsf.services.EmpleadoService;

/*Clase controller que se encarga de procesar la información para la pantalla principal.xhtml*/
@ManagedBean(name="principal_controller")
@ViewScoped //Permite almacenar objetos mientras nos mantengamos en la misma vista (#{principalController.empleados})
public class PrincipalController {
	private ArrayList<Empleado> empleados;
	private EmpleadoService empleado_service;
	
	public PrincipalController() {
		this.empleado_service = new EmpleadoService();
	}
	
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}
	
	public void consultarEmpleados() {
		this.empleados = this.empleado_service.consultarEmpleados();
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
}
