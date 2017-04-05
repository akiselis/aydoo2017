package ar.edu.untref.aydoo;

import org.junit.Test;

import java.util.LinkedList;

import org.junit.Assert;

public class DarFormatoIngresadoTest {


	@Test
	public void DebeMostrarMensajeDeFormatoIncorrecto() {
		
		String resultadoObtenido = null;
		int numero = 360;
		LinkedList<Integer> listaDeNumeros = new LinkedList<Integer>();
		DadorDeFormato unDadorDeFormato = new DadorDeFormato();

		listaDeNumeros.add(2);
		listaDeNumeros.add(2);
		listaDeNumeros.add(2);
		listaDeNumeros.add(3);
		listaDeNumeros.add(3);
		listaDeNumeros.add(5);

		resultadoObtenido = unDadorDeFormato.darFormatoIngresado(numero, "yerba", listaDeNumeros);

		Assert.assertEquals("Formato no aceptado. Las opciones posibles son: pretty o quiet.", resultadoObtenido);

	}

	@Test
	public void debeMostrarFactoresPrimosConFormatoPrettyPorqueIngresoFormatoPretty() {
		
		String resultadoObtenido = null;
		int numero = 360;
		LinkedList<Integer> listaDeNumeros = new LinkedList<Integer>();
		DadorDeFormato unDadorDeFormato = new DadorDeFormato();

		listaDeNumeros.add(2);
		listaDeNumeros.add(2);
		listaDeNumeros.add(2);
		listaDeNumeros.add(3);
		listaDeNumeros.add(3);
		listaDeNumeros.add(5);

		resultadoObtenido = unDadorDeFormato.darFormatoIngresado(numero, "pretty", listaDeNumeros);

		Assert.assertEquals("Factores primos 360: 2 2 2 3 3 5 ", resultadoObtenido);

	}

	@Test
	public void debeMostrarFactoresPrimosConFormatoPrettyPorqueNoIngresoFormato() {
		
		String resultadoObtenido = null;
		int numero = 360;
		LinkedList<Integer> listaDeNumeros = new LinkedList<Integer>();
		DadorDeFormato unDadorDeFormato = new DadorDeFormato();

		listaDeNumeros.add(2);
		listaDeNumeros.add(2);
		listaDeNumeros.add(2);
		listaDeNumeros.add(3);
		listaDeNumeros.add(3);
		listaDeNumeros.add(5);

		resultadoObtenido = unDadorDeFormato.darFormatoIngresado(numero, null, listaDeNumeros);

		Assert.assertEquals("Factores primos 360: 2 2 2 3 3 5 ", resultadoObtenido);

	}
	

	@Test
	public void noDebeSerCaseSensitiveConFormatoPretty() {
		
		String resultadoObtenido = null;
		int numero = 360;
		LinkedList<Integer> listaDeNumeros = new LinkedList<Integer>();
		DadorDeFormato unDadorDeFormato = new DadorDeFormato();

		listaDeNumeros.add(2);
		listaDeNumeros.add(2);
		listaDeNumeros.add(2);
		listaDeNumeros.add(3);
		listaDeNumeros.add(3);
		listaDeNumeros.add(5);

		resultadoObtenido = unDadorDeFormato.darFormatoIngresado(numero, "PReTTY", listaDeNumeros);

		Assert.assertEquals("Factores primos 360: 2 2 2 3 3 5 ", resultadoObtenido);

	}
	
	
	@Test
	public void debeMostrarFactoresPrimosConFormatoQuietPorqueIngresoFormatoQuiet() {
		
		String resultadoObtenido = null;
		int numero = 360;
		LinkedList<Integer> listaDeNumeros = new LinkedList<Integer>();
		DadorDeFormato unDadorDeFormato = new DadorDeFormato();

		listaDeNumeros.add(2);
		listaDeNumeros.add(2);
		listaDeNumeros.add(2);
		listaDeNumeros.add(3);
		listaDeNumeros.add(3);
		listaDeNumeros.add(5);

		resultadoObtenido = unDadorDeFormato.darFormatoIngresado(numero, "quiet", listaDeNumeros);

		Assert.assertEquals("\n5\n3\n3\n2\n2\n2\n", resultadoObtenido);

	}

}
