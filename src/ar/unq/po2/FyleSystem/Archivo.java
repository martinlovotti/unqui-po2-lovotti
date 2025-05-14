package ar.unq.po2.FyleSystem;

import java.time.LocalDateTime;

public class Archivo implements FyleSystem {
	private String name;
	private LocalDateTime fechaCreacion;
	private LocalDateTime ultimaModificacion;
	private int tamanio;
	
	public LocalDateTime getFechaModificacion() {
	    return ultimaModificacion;
	}

	public LocalDateTime getFechaCreacion() {
	    return fechaCreacion;
	}
	
	
	@Override
	public int totalSize() {
		System.out.println("El archivo" + name +" Pesa: "+ tamanio +"KB");
		return tamanio;
	}
	@Override
	public void printStructura() {
		System.out.println("El archivo" + name +" Pesa: "+ tamanio +"KB");
	}
	@Override
	public FyleSystem lastModified() {
		return this;
		// Se retorna a si mismo ya que es una Hoja dentro de la jerarquia
	}
	@Override
	public FyleSystem oldestElement() {
		return this;
		// Se retorna a si mismo ya que es una Hoja dentro de la jerarquia
	}
	
	public void modificarArchivo(int tamanio) {
		this.tamanio = tamanio;
		this.ultimaModificacion = LocalDateTime.now();
		System.out.print(" El archivo: "+ name+ " fue modificado, ahora pesa: "+ tamanio);
	}
	
	public Archivo(String name, int tamanio) {
		this.name = name;
		this.fechaCreacion = LocalDateTime.now();
		this.ultimaModificacion = LocalDateTime.now();
		this.tamanio = tamanio;
	}
	
	
	
}
