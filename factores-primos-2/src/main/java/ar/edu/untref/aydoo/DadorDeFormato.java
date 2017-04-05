package ar.edu.untref.aydoo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class DadorDeFormato {

	String formatoDeImpresion = null;

	public String darFormatoIngresado(int numeroIngresado, String formatoIngresado,
			LinkedList<Integer> listaDeNumeros) {
		String resultadoEnFormatoIngresado = null;
		int numero = numeroIngresado;
		formatoDeImpresion = formatoIngresado;

		if (formatoDeImpresion == null || formatoDeImpresion.equalsIgnoreCase("pretty")) {

			resultadoEnFormatoIngresado = this.imprimirEnFormatoPretty(numero, listaDeNumeros);

		} else if (formatoDeImpresion.equalsIgnoreCase("quiet")) {

			resultadoEnFormatoIngresado = this.imprimirEnFormatoQuiet(listaDeNumeros);

		} else {

			resultadoEnFormatoIngresado = "Formato no aceptado. Las opciones posibles son: pretty o quiet.";
		}

		return resultadoEnFormatoIngresado;
	}

	private String imprimirEnFormatoPretty(int numero, LinkedList<Integer> listaAImprimir) {

		Iterator<Integer> iteradorDeFactoresPrimos = listaAImprimir.iterator();
		String resultado = "Factores primos " + String.valueOf(numero) + ": ";

		while (iteradorDeFactoresPrimos.hasNext()) {
			resultado = resultado + String.valueOf(iteradorDeFactoresPrimos.next() + " ");
		}
		return resultado;

	}

	private String imprimirEnFormatoQuiet(LinkedList<Integer> listaAImprimir) {

		ListIterator<Integer> iteradorDeFactoresPrimos = listaAImprimir.listIterator(listaAImprimir.size());
		String resultado = "\n";

		while (iteradorDeFactoresPrimos.hasPrevious()) {
			resultado = resultado + String.valueOf(iteradorDeFactoresPrimos.previous() + "\n");
		}
		return resultado;

	}

	public String getFormatoDeImpresion() {
		return formatoDeImpresion;
	}

	public void setFormatoDeImpresion(String formatoDeImpresion) {
		this.formatoDeImpresion = formatoDeImpresion;
	}

}
