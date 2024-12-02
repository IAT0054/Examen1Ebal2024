package clases;

import utilidades.util;

public class Empleado {
	
	
public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public LocalDate getFechaAlt() {
		return fechaAlt;
	}

	public void setFechaAlt(LocalDate fechaAlt) {
		this.fechaAlt = fechaAlt;
	}

	public int getNumSorteo() {
		return numSorteo;
	}

	public void setNumSorteo(int numSorteo) {
		this.numSorteo = numSorteo;
	}

}
	
public void setDatos()	
{
	char rsp;
	this.nombre=util.introducirCadena("Introduce el nombre");
	 
	

}

