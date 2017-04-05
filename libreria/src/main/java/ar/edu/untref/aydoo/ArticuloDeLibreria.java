package ar.edu.untref.aydoo;

public class ArticuloDeLibreria extends Producto {

	int iva;

	public ArticuloDeLibreria(Float precioDeVenta, int iva) {
		super(precioDeVenta);
		iva = iva;
	}

	public float getPrecioDeVenta() {
		return precioDeVenta + ((precioDeVenta * iva) / 100);
	}
}
