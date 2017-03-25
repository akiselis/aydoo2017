package ar.edu.untref.aydoo;

import org.junit.Test;

import java.util.LinkedList;

import org.junit.Assert;

public class DescomponerFacPrimosTest {
	
	@Test
	public void devuelveFactoresOk (){
		Program p = new Program();
		LinkedList<Integer> lista1 = p.descomponerEnFactoresPrimos(90);
		Assert.assertEquals(4, lista1.size());
		Assert.assertEquals(2, (int)lista1.get(0));
		Assert.assertEquals(3, (int)lista1.get(1));
		Assert.assertEquals(3, (int)lista1.get(2));
		Assert.assertEquals(5, (int)lista1.get(3));
		
		LinkedList<Integer> lista2 = p.descomponerEnFactoresPrimos(360);
		Assert.assertEquals(6, lista2.size());
		Assert.assertEquals(2, (int)lista2.get(0));
		Assert.assertEquals(2, (int)lista2.get(1));
		Assert.assertEquals(2, (int)lista2.get(2));
		Assert.assertEquals(3, (int)lista2.get(3));
		Assert.assertEquals(3, (int)lista2.get(4));
		Assert.assertEquals(5, (int)lista2.get(5));
	}

}
