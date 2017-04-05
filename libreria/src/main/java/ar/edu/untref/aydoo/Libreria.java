package ar.edu.untref.aydoo;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public class Libreria {

	LinkedList<Cliente> listaDeClientes = new LinkedList<Cliente>();
	LinkedList<Venta> ventasDeProductosNoSuscribibles = new LinkedList<Venta>();
	LinkedList<Venta> ventasDeSuscripciones = new LinkedList<Venta>();

	private boolean verificadorDeCliente(int dni) {

		Iterator<Cliente> iteradorDeListaDeClientes = listaDeClientes.iterator();
		boolean esCliente = false;

		while (iteradorDeListaDeClientes.hasNext() && !esCliente) {
			if (iteradorDeListaDeClientes.next().getDni() == dni) {
				esCliente = true;
			}
		}

		return esCliente;
	}

	private void guardarClientes(String nombre, String apellido, int dni, String direccion) {

		Cliente unCliente = new Cliente(nombre, apellido, dni, direccion);
		listaDeClientes.add(unCliente);
	}

	public void venderProductoNoSuscribible(Cliente clienteComprador, Producto productoComprado, Mes mesDeVenta) {

		if (!this.verificadorDeCliente(clienteComprador.getDni())) {
			this.guardarClientes(clienteComprador.getNombre(), clienteComprador.getApellido(),
					clienteComprador.getDni(), clienteComprador.getDireccion());
		}

		Venta nuevaVenta = new Venta();

		nuevaVenta.crearVentaDeProductoNoSuscribible(productoComprado, clienteComprador, mesDeVenta);

		ventasDeProductosNoSuscribibles.add(nuevaVenta);

	}

	public void venderSuscripcion(Cliente clienteComprador, Suscribible productoSuscribible, Mes mesDeVenta,
			int cantidadDeEjemplares, boolean suscripcionAnual) {

		if (!this.verificadorDeCliente(clienteComprador.getDni())) {
			this.guardarClientes(clienteComprador.getNombre(), clienteComprador.getApellido(),
					clienteComprador.getDni(), clienteComprador.getDireccion());
		}

		Venta nuevaVenta = new Venta();

		nuevaVenta.crearVentaDeSuscripcion(productoSuscribible, clienteComprador, mesDeVenta, cantidadDeEjemplares,
				suscripcionAnual);

		ventasDeSuscripciones.add(nuevaVenta);

	}

	public float calcularMontoACobrar(Cliente clienteACobrar, Mes mes) {

		Iterator<Venta> iteradorVentasNoSuscribibles = ventasDeProductosNoSuscribibles.iterator();
		Iterator<Venta> iteradorSuscripciones = ventasDeSuscripciones.iterator();
		Venta unaVenta;
		float total = 0;

		while (iteradorVentasNoSuscribibles.hasNext()) {

			unaVenta = iteradorVentasNoSuscribibles.next();

			if (unaVenta.getMesDeVenta() == mes && unaVenta.getComprador() == clienteACobrar) {
				total = total + unaVenta.getProductoVendido().getPrecioDeVenta();
			}
		}

		while (iteradorSuscripciones.hasNext()) {

			unaVenta = iteradorSuscripciones.next();

			if (unaVenta.getMesDeVenta() == mes && unaVenta.getComprador() == clienteACobrar) {
				total = total + unaVenta.getProductoSuscribible().getPrecioDeVenta();
			}
		}

		return total;

	}

}
