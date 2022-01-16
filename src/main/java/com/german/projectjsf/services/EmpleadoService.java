package com.german.projectjsf.services;

import java.util.ArrayList;
import com.german.projectjsf.entity.Empleado;

public class EmpleadoService {
	public ArrayList<Empleado> consultarEmpleados() {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleado_IBM = new Empleado();
		Empleado empleado_Microsoft = new Empleado();
		Empleado empleado_Apple = new Empleado();
		
		empleado_IBM.setNombre("Diego");
		empleado_IBM.setPrimer_apellido("Paniagua");
		empleado_IBM.setSegundo_apellido("López");
		empleado_IBM.setPuesto("Senior Developer Java");
		empleado_IBM.setEstatus(true);
		
		empleado_Microsoft.setNombre("Luís Jesus");
		empleado_Microsoft.setPrimer_apellido("López");
		empleado_Microsoft.setSegundo_apellido("Romero");
		empleado_Microsoft.setPuesto("CEO");
		empleado_Microsoft.setEstatus(true);
		
		empleado_Apple.setNombre("Félix Germán");
		empleado_Apple.setPrimer_apellido("Flores");
		empleado_Apple.setSegundo_apellido("Gálvez");
		empleado_Apple.setPuesto("Senior Developer Python");
		empleado_Apple.setEstatus(true);
		
		empleados.add(empleado_IBM);
		empleados.add(empleado_Microsoft);
		empleados.add(empleado_Apple);
		
		return empleados;
	}
}
