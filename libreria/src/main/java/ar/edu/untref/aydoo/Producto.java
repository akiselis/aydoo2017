package ar.edu.untref.aydoo;

public abstract class Producto {

	Float precioDeVenta;

	public Producto(Float precioDeVenta) {
		precioDeVenta = precioDeVenta;
	}


	public float getPrecioDeVenta() {
		return precioDeVenta;
	}

	public void setPrecioDeVenta(Float precioDeVenta) {
		this.precioDeVenta = precioDeVenta;
	}

}
