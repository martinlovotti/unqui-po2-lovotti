package ar.unq.po2.tpSolidVideoJuego;

public class MaquinaVideojuego {
	
	int cantidadDeFichas;
	EstadoVideojuego EstadoActual; 
	
	public void ingresarFichas(int fichas) {
		EstadoActual.ingresarFichas(fichas, this);
	}
	
	public void jugar() {
		EstadoActual.jugar(this);
	}
	public MaquinaVideojuego() {
		this.cantidadDeFichas = 0;
		this.EstadoActual = new EstadoVideojuegoInicial();
	}
}
