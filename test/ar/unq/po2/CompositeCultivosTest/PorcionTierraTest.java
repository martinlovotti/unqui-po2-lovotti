package ar.unq.po2.CompositeCultivosTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.unq.po2.compositeCultivos.*;

class PorcionTierraTest {

	Parcela parcelaReal;
	Parcela parcelaMock;
	PorcionTierra sojaMock;
	PorcionTierra trigoMock;
	Soja sojaReal;
	Trigo trigoReal;

	@BeforeEach
	void setUp() {
		parcelaReal = new Parcela("p");
		parcelaMock = mock(Parcela.class);
		sojaMock = mock(Soja.class);
		trigoMock = mock(Trigo.class);
		sojaReal = new Soja("s");
		trigoReal = new Trigo("t");
	}

	@Test
	void obtenerGananciasParcela() {
		parcelaReal.aniadir(trigoReal);
		parcelaReal.aniadir(sojaReal);

		System.out.println("Ganancia de soja: " + sojaReal.obtenerGanancias());
		System.out.println("Ganancia de trigo: " + trigoReal.obtenerGanancias());
		System.out.println("Ganancia total: " + parcelaReal.obtenerGanancias());

		assertEquals(800, parcelaReal.obtenerGanancias());
	}

	@Test
	void aniadirSojaAParcelaMock() {
		parcelaMock.aniadir(sojaMock);
		verify(parcelaMock).aniadir(sojaMock);
	}

	@Test
	void aniadirSojaAParcela() {
		Parcela spyParcela = spy(new Parcela("p")); // Real + espiado
		when(sojaMock.obtenerGanancias()).thenReturn(500);

		spyParcela.aniadir(sojaMock);
		verify(spyParcela).aniadir(sojaMock);
	}
	
	@Test
	void seLlamaObtenerGananciasEnSoja() {
		parcelaReal.aniadir(sojaMock);
		when(sojaMock.obtenerGanancias()).thenReturn(500);
	
		parcelaReal.obtenerGanancias();//ejecutar metodo
		
		verify(sojaMock).obtenerGanancias();
		//verificar que a la soja le llego el 
		//metodo obtener ganancias
	}
	
	@Test 
	void obtenerGananciasDeParcela(){
		parcelaReal.aniadir(sojaMock);
		parcelaReal.aniadir(trigoMock);
		
		when(sojaMock.obtenerGanancias()).thenReturn(500);
		when(trigoMock.obtenerGanancias()).thenReturn(300);
		parcelaReal.obtenerGanancias();//ejecutar metodo
		
		assertEquals(800, parcelaReal.obtenerGanancias()); // 500 (soja) + 300 (trigo)
	}
}

