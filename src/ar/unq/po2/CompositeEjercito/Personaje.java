package ar.unq.po2.CompositeEjercito;

import java.util.ArrayList;
import java.util.List;

public abstract class Personaje {
	protected List<Personaje> integrantes;
	protected int bolsaLajas;
	protected Mapa mapa; // el mapa es solo unas coordenadas en x donde en cada posicion se accede al caminar
	protected int posicion;//La posicion en x es donde está en el mapa
	
	public abstract void caminar(int x);
	public abstract void aniadirIntegrante(Personaje p);
	public abstract void agregarLaja(int x);
	public abstract int getLajas();
	public Personaje(Mapa p) {
		this.integrantes = new ArrayList<>();
		this.bolsaLajas = 0;
		this.mapa = p;
		this.posicion = 0;
	}
}
