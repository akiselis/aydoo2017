package ar.edu.untref.aydoo;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class DescomponerEnFactoresPrimosTest {

	@Test
	public void debeDevolverFactoresPrimosDe90() {
		CalculadorDeFactorPrimo Calculador = new CalculadorDeFactorPrimo();
		LinkedList<Integer> lista = Calculador.descomponerEnFactoresPrimos(90);
		Assert.assertEquals(4, lista.size());
		Assert.assertEquals(2, (int) lista.get(0));
		Assert.assertEquals(3, (int) lista.get(1));
		Assert.assertEquals(3, (int) lista.get(2));
		Assert.assertEquals(5, (int) lista.get(3));
	}

	@Test
	public void debeDevolverFactoresPrimosDe360() {

		CalculadorDeFactorPrimo Calculador = new CalculadorDeFactorPrimo();

		LinkedList<Integer> lista = Calculador.descomponerEnFactoresPrimos(360);
		Assert.assertEquals(6, lista.size());
		Assert.assertEquals(2, (int) lista.get(0));
		Assert.assertEquals(2, (int) lista.get(1));
		Assert.assertEquals(2, (int) lista.get(2));
		Assert.assertEquals(3, (int) lista.get(3));
		Assert.assertEquals(3, (int) lista.get(4));
		Assert.assertEquals(5, (int) lista.get(5));
	}
}
