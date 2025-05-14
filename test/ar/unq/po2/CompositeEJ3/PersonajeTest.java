package ar.unq.po2.CompositeEJ3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.*;

import ar.unq.po2.CompositeEjercito.*;

public class PersonajeTest {
	Personaje ingenieroReal;
	Personaje ejercitoReal;
	Personaje caballeroReal;
	Mapa mapaReal;
	Mapa mapaMock;
	Personaje ingenieroMock;
	Personaje ejercitoMock;
	Personaje caballeroMock;
	
	@BeforeEach
	void setUp() {
		//Mapa
		mapaReal = new Mapa("1");
		mapaMock = mock(Mapa.class);
		
		ingenieroReal = new Ingeniero(mapaReal);
		caballeroReal = new Caballero(mapaReal);
		ejercitoReal = new Ejercito(mapaReal);
		//Mocks
		ingenieroMock = mock(Personaje.class);
		caballeroMock = mock(Personaje.class);
		ejercitoMock = mock(Personaje.class);
		
	}
	
	//Ingeniero
	@Test
	void ingenieroCaminayColocaLaja() {
		ingenieroReal.caminar(2);
		assertEquals(1,mapaReal.getPunto(1));
	}
	
	@Test
	void ingenieroCaminaHastaQuedarseSinLajas() {
		ingenieroReal.caminar(4);
		assertEquals( 0 , ingenieroReal.getLajas());
	}
	@Test
	void ingenieroCaminaHastaQuedarseSinLajasYNoHayLajaADondeLLega() {
		ingenieroReal.caminar(4);
		assertEquals(0 , mapaReal.getPunto(4));
	}
	
	//Ejercito
	@Test
	void ejercitoCamina() {
		ejercitoReal.aniadirIntegrante(caballeroMock);
		ejercitoReal.aniadirIntegrante(ingenieroMock);
		
		ejercitoReal.caminar(1);
	
		verify(caballeroMock).caminar(1);
		verify(ingenieroMock).caminar(1);
	}
	
	@Test
	void ejercitoAgregaIntegrantesYcaminaYcambiaPosicion() {
		ejercitoReal.aniadirIntegrante(caballeroMock);
		ejercitoReal.aniadirIntegrante(ingenieroMock);
		
		ejercitoReal.caminar(2);
		
		assertEquals(2,ejercitoReal.getPosicion());
	}
}
