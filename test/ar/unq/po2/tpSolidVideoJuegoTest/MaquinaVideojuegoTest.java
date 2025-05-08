package ar.unq.po2.tpSolidVideoJuegoTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.unq.po2.tpSolidVideoJuego.MaquinaVideojuego;
//import static org.mockito.Mockito.*;


class MaquinaVideojuegoTest {
	
	@BeforeEach
	void setup() {
		MaquinaVideojuego m1 = new MaquinaVideojuego();
	}
	
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

/**
 * 
 click derecho en proyecto, build path, configure build path, librerias, add external jar, apply and close
  Creacion
 
	@Mock 
	private Classname varName;

SET UN VALOR -- STUB
when(methodCall).thenReturn(value)
.thenReturn(value,value).thenThrow(whorwableClasses)

VERIFICAR
Paseador Juan = mock(Paseador.class)
verify(mock).methodCall == assert
verify(mock, VerificationMode).methodCall
verifyNoMoreInteractions(mock)
verifyZeroInteractions(mock)
--verify(Juan,never()).getSueldo()
MODOS DE VERIFICACION
atLeastOne()	atLeast(int)

atMost(int)		times(int)

timeout(long)	never()
*/




