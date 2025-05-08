package ar.unq.po2.tpSolidVideoJuego;

public class EstadoVideojuegoUnJugador extends EstadoVideojuego {

	@Override
	public void ingresarFichas(int fichas, MaquinaVideojuego maquina) {
		System.out.println("ya hay fichas");

	}

	@Override
	public void jugar(MaquinaVideojuego maquina) {
		System.out.println("jugando un jugador");
		maquina.EstadoActual = new EstadoVideojuegoInicial();
	}

}
