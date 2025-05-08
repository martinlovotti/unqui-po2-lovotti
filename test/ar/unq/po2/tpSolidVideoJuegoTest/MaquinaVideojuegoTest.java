package ar.unq.po2.tpSolidVideoJuegoTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import ar.unq.po2.tpSolidVideoJuego.MaquinaVideojuego;

class MaquinaVideojuegoTest {
	
	MaquinaVideojuego m1 = new MaquinaVideojuego();
	
	@Test
	public void testJugarInicial() {
			assertEquals(0, m1.getCantidadDeFichas());
	}
	
	@Test
	public void testIngresarFichas() {
			m1.ingresarFichas(1);
			assertEquals(1, m1.getCantidadDeFichas());
	}
	
	@Test
	public void testIngresarFichasYJugar() {
			m1.ingresarFichas(1);
			m1.jugar();
			assertEquals(0, m1.getCantidadDeFichas());
	}

}
