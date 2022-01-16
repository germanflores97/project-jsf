package com.german.projectjsf.entity;

public class Empleado {
	private String nombre;
	private String primer_apellido;
	private String segundo_apellido;
	private String puesto;
	private boolean estatus;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getPrimer_apellido() {
		return primer_apellido;
	}
	
	public void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}
	
	public String getSegundo_apellido() {
		return segundo_apellido;
	}
	
	public void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}
	
	public String getPuesto() {
		return puesto;
	}
	
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	public boolean isEstatus() {
		return estatus;
	}
	
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	
	
}
