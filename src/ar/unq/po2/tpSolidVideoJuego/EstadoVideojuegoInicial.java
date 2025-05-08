package ar.unq.po2.tpSolidVideoJuego;

public class EstadoVideojuegoInicial extends EstadoVideojuego {

	@Override
	public void ingresarFichas(int fichas, MaquinaVideojuego maquina) {
		maquina.cantidadDeFichas = fichas;
		System.out.println("cargando fichas: " + fichas);
		if (maquina.cantidadDeFichas == 1) {
			maquina.EstadoActual = new EstadoVideojuegoUnJugador();
		}else {
			maquina.EstadoActual = new EstadoVideojuegoMultijugador();
		}
		
	}

	@Override
	public void jugar(MaquinaVideojuego maquina) {
		System.out.println("se necesitan fichas");
	}
}
