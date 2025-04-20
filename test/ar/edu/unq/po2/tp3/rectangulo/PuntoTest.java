package ar.edu.unq.po2.tp3.rectangulo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import ar.edu.unq.po2.prueba.Punto;

public class PuntoTest {
	
	Punto p;
	@BeforeEach
	public void setUp() {
		p = new Punto(1,2);
	}
	
	@Test
	public void testearGetter() {
		assertEquals(1,p.getX(),"no se creo correctamente");
	}
	
	@Test
	public void testearSetter() {
		p.setX(5);
		assertEquals(5, p.getX(),"El setter no funciona bien");
	}
}
//control + shift + T = Buscar una clase