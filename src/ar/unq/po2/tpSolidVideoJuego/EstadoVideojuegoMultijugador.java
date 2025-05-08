package ar.unq.po2.tpSolidVideoJuego;

public class EstadoVideojuegoMultijugador extends EstadoVideojuego {

	@Override
	public void ingresarFichas(int fichas, MaquinaVideojuego maquina) {
		System.out.println("ya hay fichas");

	}

	@Override
	public void jugar(MaquinaVideojuego maquina) {
		System.out.println("jugando 2 jugadores");
		maquina.cantidadDeFichas = 0;
		maquina.EstadoActual = new EstadoVideojuegoInicial();
	}

}
