package ar.unq.po2.StateMP3;

public abstract class EstadoMP3 {

	protected abstract void play(Song song);

	protected abstract void pause(Song song);

	protected abstract void stop(Song song);
	
}
