package ar.edu.untref.aydoo;

import java.util.Date;

public class Venta {

	Producto productoVendido;
	Suscribible productoSuscribible;
	Cliente comprador;
	Mes mesVenta;

	public void crearVentaDeProductoNoSuscribible(Producto unProducto, Cliente unCliente, Mes mesDeVenta) {

		productoVendido = unProducto;
		comprador = unCliente;
		mesVenta = mesDeVenta;

	}

	public void crearVentaDeSuscripcion(Suscribible unProductoSuscribible, Cliente unCliente, Mes mesDeVenta,
			int cantidadDeEjemplares, boolean esSuscripcionAnual) {
		productoSuscribible = unProductoSuscribible;
		comprador = unCliente;
		mesVenta = mesDeVenta;
		productoSuscribible.setearSiEsSuscripcionAnual(esSuscripcionAnual);
		productoSuscribible.setCantidadDeEjemplares(cantidadDeEjemplares);
	}

	public Suscribible getProductoSuscribible() {
		return productoSuscribible;
	}

	public void setProductoSuscribible(Suscribible productoSuscribible) {
		this.productoSuscribible = productoSuscribible;
	}

	public Producto getProductoVendido() {
		return productoVendido;
	}

	public void setProductoVendido(Producto productoVendido) {
		this.productoVendido = productoVendido;
	}

	public Cliente getComprador() {
		return comprador;
	}

	public void setComprador(Cliente comprador) {
		this.comprador = comprador;
	}

	public Mes getMesDeVenta() {
		return mesVenta;
	}

	public void setMesaDeVenta(Mes mesDeVenta) {
		this.mesVenta = mesDeVenta;
	}

}
