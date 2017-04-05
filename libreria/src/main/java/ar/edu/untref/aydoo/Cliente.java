package ar.edu.untref.aydoo;

import java.util.LinkedList;

public class Cliente {

	String nombre;
	String apellido;
	int dni;
	String direccion;
	LinkedList<Producto> listaDeProductosCompradosPorMes = new LinkedList<Producto>();

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

	
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
	public Cliente(String nombreCliente, String apellidoCliente, int dniCliente, String direccionCliente) {
		nombre = nombreCliente;
		apellido = apellidoCliente;
		dni = dniCliente;
		direccion = direccionCliente;
	}
	
	
	
	

}
