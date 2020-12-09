package com.clearminds.arm.dtos;

public class Estudiante {

	private String nombre;
	private String apellido;
	private int id;
	public Estudiante(String nombre, String apellido, int id) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
	}
	public Estudiante(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + "]";
	}
	
	
	
}
