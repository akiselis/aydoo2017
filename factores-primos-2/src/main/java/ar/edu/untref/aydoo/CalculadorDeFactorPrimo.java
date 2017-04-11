package ar.edu.untref.aydoo;

import java.util.LinkedList;

public class CalculadorDeFactorPrimo {

	public static final void main(String arg[]) {
		int valorIngresado = Integer.parseInt(arg[0]);
		String formatoIngresado = arg[1];	
		boolean noIngresaFormato = false;
		DadorDeFormato unDadorDeFormato = new DadorDeFormato();
		LinkedList<Integer> numeroDescompuesto = descomponerEnFactoresPrimos(valorIngresado);
		String FactoresPrimosConFormato = null;

		if (arg.length < 2) {
			noIngresaFormato = true;
		}

		FactoresPrimosConFormato = unDadorDeFormato.darFormatoIngresado(valorIngresado, formatoIngresado,
				numeroDescompuesto, noIngresaFormato);

		System.out.println(FactoresPrimosConFormato);
	}

	public static LinkedList<Integer> descomponerEnFactoresPrimos(int numero) {
		int divisor = 2;
		LinkedList<Integer> factoresPrimos = new LinkedList<Integer>();

		while (numero > 1) {

			if (numero % divisor == 0) {

				factoresPrimos.add(new Integer(divisor));
				numero = numero / divisor;

			} else {

				divisor++;

			}

		}

		return factoresPrimos;

	}

}
