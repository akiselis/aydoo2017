package ar.edu.untref.aydoo;

import java.util.LinkedList;

public class Program {
	public static final void main(String arg[]) {
		int valorIngresado = Integer.parseInt(arg[0]);
		LinkedList<Integer> numeroDescompuesto = descomponerEnFactoresPrimos(valorIngresado);
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

		} // CIERRE while

		System.out.print(factoresPrimos);
		return factoresPrimos;

	} // CIERRE metodo

}
