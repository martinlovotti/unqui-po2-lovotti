package ar.unq.po2.FyleSystem;

import java.time.LocalDateTime;

public interface FyleSystem {
	public int totalSize(); //Total de espacio en bytes
	public void printStructura(); //en consola el contenido indicando nombre e identandolos
	public FyleSystem lastModified(); //Elemento mas nuevo
	public FyleSystem oldestElement(); //Elemento mas antiguo
	public LocalDateTime getFechaModificacion();//
	public LocalDateTime getFechaCreacion();
}
