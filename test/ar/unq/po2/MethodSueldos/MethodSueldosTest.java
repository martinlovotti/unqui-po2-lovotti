package ar.unq.po2.MethodSueldos;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.*;

public class MethodSueldosTest {
	
	MethodSueldo emp1;
	MethodSueldo emp2;
	MethodSueldo emp3;
		
	@BeforeEach
	void setUp() {
		emp1 = new EmpleadoTemporario(true,1);
		emp2 = new EmpleadoPlanta(2);
		emp3 = new EmpleadoPasante();
	}
	
	@Test
	void calcularDescuentoTemporarioConHijos() {
		assertEquals(150,emp1.calcularDescuento());
	}
	
	@Test 
	void calcularSueldoTemporarioConHijos() {
		assertEquals(1005,emp1.sueldo());
	}
}
