package ar.unq.po2.StateMP3;

public class EstadoStop extends EstadoMP3 {

	@Override
	protected void play(Song song) {
		song.estadoActual = new EstadoPlay();
	}

	@Override
	protected void pause(Song song) {
		{System.out.println("Ya está pausada la canción seleccionada");}
	}

	@Override
	protected void stop(Song song) {
		song.cancionActual = null;
		song.estadoActual = new EstadoPlay();
	}

}
