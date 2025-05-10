package ar.unq.po2.StateMP3;

public class Song {
	String cancionActual;
	EstadoMP3 estadoActual;
	
	public void play() {
		estadoActual.play(this);
	}
	
	public void pause() {
		estadoActual.pause(this);
	}
	
	public void stop() {
		estadoActual.stop(this);
	}
	
	public void setSong(String c) {
		this.cancionActual=c;
	}
	
	public String getSong() {
		return cancionActual;
	}

	public Song(String cancionActual, EstadoMP3 estadoActual) {
		this.cancionActual = null;
		this.estadoActual = new EstadoPlay();
	}
	
	
}
