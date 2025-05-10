package ar.unq.po2.StateMP3;

public class EstadoPlay extends EstadoMP3 {

	@Override
	protected void play(Song song) {
		if(song.getSong() != null) {
			System.out.println("Reproduciendo" + song.getSong());
		}else {System.out.println("No hay una canción seleccionada");}
	}

	@Override
	protected void pause(Song song) {
		if(song.getSong() != null) {
			song.estadoActual = new EstadoPausa();
		}else {System.out.println("No hay una canción seleccionada");}

	}

	@Override
	protected void stop(Song song) {
		if(song.getSong() != null) {
			song.estadoActual = new EstadoStop();
		}else {System.out.println("No hay una canción seleccionada");}

	}

}
