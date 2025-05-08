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
	
	public static void main() {
		MaquinaVideojuego m1 = new MaquinaVideojuego();
		
		m1.jugar();
		m1.ingresarFichas(1);
		m1.jugar();
		m1.jugar();
	}

	public int getCantidadDeFichas() {
		// TODO Auto-generated method stub
		return cantidadDeFichas;
	}
}
