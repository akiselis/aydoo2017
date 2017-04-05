package ar.edu.untref.aydoo;

public class Suscribible extends Producto {

	private int cantidadDeEjemplares;
	private boolean suscripcionAnual;
	private static final int descuentoPorAnual = 20;

	public Suscribible(Float precioDeVenta, int cantidadDeEjemplares) {
		super(precioDeVenta);
		this.cantidadDeEjemplares = cantidadDeEjemplares;
	}

	public int getCantidadDeEjemplares() {
		return cantidadDeEjemplares;
	}

	public void setCantidadDeEjemplares(int cantidadDeEjemplares) {
		this.cantidadDeEjemplares = cantidadDeEjemplares;
	}

	public void setearSiEsSuscripcionAnual(boolean anualONo) {
		this.suscripcionAnual = anualONo;
	}

	public boolean devolverSiEsSuscripcionAnual() {
		return suscripcionAnual;
	}

	public float getPrecioDeVenta() {

		float precioPorMes;

		if (suscripcionAnual) {
			precioPorMes = super.getPrecioDeVenta() - ((super.getPrecioDeVenta() * descuentoPorAnual) / 100);
			precioPorMes = precioPorMes * this.getCantidadDeEjemplares();
		} else {
			precioPorMes = super.getPrecioDeVenta() * this.getCantidadDeEjemplares();
		}

		return precioPorMes;
	}

}
