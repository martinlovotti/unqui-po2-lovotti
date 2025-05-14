package ar.unq.po2.compositeCultivos;

//import java.util.ArrayList;
import java.util.List;

/**
 1 Se logra tratar a todos los objetos individuales como compuestos de la misma forma
 ya que los clientes usan la interfaz Componente, si el obj es una hoja la petición
 se trata correctamente y si es compuesto, reedirige las peticiones a sus hijos
 realizando operaciones adicionales antes o despues
 
 2 EL patrón se usa cuando se requiere representar jerarquías de objetos parte-todo
 	y cuando quiera que los clientes sean capaces de obviar las diferencias entre composiciones
 	de objetos y individuales. Los clientes tratarán a todos los objetos 
 	de la estructura compuesta de manera uniforme
 */


public abstract class PorcionTierra {
	//Es el componente
	protected String nombre;
	protected int value;
	protected List<PorcionTierra> porcion;
	public abstract int obtenerGanancias();
	public abstract void aniadir(PorcionTierra p);
	public abstract void eliminar(PorcionTierra p);
	
	public PorcionTierra(String n) {
		this.nombre = n;
		this.value = 0;
	}
	
}
