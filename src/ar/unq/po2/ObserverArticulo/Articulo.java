package ar.unq.po2.ObserverArticulo;

import java.util.ArrayList;
import java.util.List;

public class Articulo {
	private String titulo;      
	private List<String> autores;
	private String tipo;
	private String lugar;
	private List<String> palabrasClave;
	private List<Observador> suscriptores;
	
	public Articulo(String titulo, String tipo, String lugar, List<String> autores, List<String> palabras) {
		this.titulo = titulo;
		this.tipo = tipo;
		this.lugar = lugar;
		this.autores = autores;
		this.palabrasClave = palabras;
		this.suscriptores = new ArrayList<Observador>();
	}
	
	public void agregarSub(Observador obs) {
		suscriptores.add(obs);
	}
}
