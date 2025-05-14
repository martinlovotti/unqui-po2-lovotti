package ar.unq.po2.FyleSystemTest;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;
import ar.unq.po2.FyleSystem.*;

public class ArchivoTest {
	Archivo a1;
	Archivo a2;
	Archivo a2Mock;
	Archivo a3Mock;
	Archivo a4Mock;
	Directorio d1;
	
	@BeforeEach
	void setUp() {
		a1 = new Archivo("1",10);
		a2 = new Archivo("2",10);
		a2Mock = mock(Archivo.class);
		a3Mock = mock(Archivo.class);
		a4Mock = mock(Archivo.class);
		d1 = new Directorio("d1");
		
	
		a2.modificarArchivo(2);
		a2.modificarArchivo(2);
		a2.modificarArchivo(2);
		a2.modificarArchivo(2);
		a2.modificarArchivo(2);
		a2.modificarArchivo(2);
		a2.modificarArchivo(2);
		a2.modificarArchivo(5);
		a2.modificarArchivo(2);
		a2.modificarArchivo(2);
		a2.modificarArchivo(2);
		a2.modificarArchivo(2);
		a2.modificarArchivo(2);
		a2.modificarArchivo(2);
		a2.modificarArchivo(2);
		a2.modificarArchivo(5);
		a2.modificarArchivo(2);
		a2.modificarArchivo(2);
		a2.modificarArchivo(2);
		a2.modificarArchivo(2);
		a2.modificarArchivo(2);
		a2.modificarArchivo(2);
		a2.modificarArchivo(2);
		a2.modificarArchivo(5);
	}
	
	@Test
	void seCreaArchivoYVerificaTamanio() {
		assertEquals(10,a1.totalSize());
	}
	
	@Test
	void modificarArchivo() {
		a1.modificarArchivo(5);
		assertEquals( 5 , a1.totalSize());
		
	}
	
	@Test
	void modificarArchivoYVerificarUltimaModificacion() {
		a1.modificarArchivo(5);
		assertEquals( 5 , a1.totalSize());
		assertTrue(a1.getFechaModificacion() != a1.getFechaCreacion());
	}
	
	@Test
	void ingresarArchivosADirectorioYVerificarTamaño(){
		d1.aniadirArchivo(a2Mock);
		d1.aniadirArchivo(a2Mock);
		when(d1.totalSize()).thenReturn(5);
		assertEquals( 10 , d1.totalSize());
	}
	
	@Test
	void ingresarArchivosADirectorioYVerificarLlamado(){
		d1.aniadirArchivo(a2Mock);
		d1.aniadirArchivo(a2Mock);
		d1.totalSize();
		verify(a2Mock, atLeastOnce()).totalSize();
	}
	
	@Test
	void elMasViejoEnUnDirectorioConUnArchivo() {
		d1.aniadirArchivo(a1);
		assertEquals(a1, d1.oldestElement());
	}
	
	@Test
	void elMasViejoEnUnDirectorio() {
		
		d1.aniadirArchivo(a1);
		d1.aniadirArchivo(a2);
		
		assertEquals(a1, d1.oldestElement());
	}
	
	@Test
	void elMasNuevoEnUnDirectorio() {
		d1.aniadirArchivo(a1);
		d1.aniadirArchivo(a2);
		assertEquals(a2, d1.lastModified());
	}
	
}