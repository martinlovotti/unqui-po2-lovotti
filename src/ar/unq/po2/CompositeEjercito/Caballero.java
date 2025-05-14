package ar.unq.po2.CompositeEjercito;

public class Caballero extends Personaje{

	public Caballero(Mapa p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void caminar(int x) {
		// TODO Auto-generated method stub
		System.out.println("Se mueve a" + x);
		this.posicion = x;
	}

	@Override
	public void aniadirIntegrante(Personaje p) {
		// TODO Auto-generated method stub
		System.out.println("no se puede");
	}

	@Override
	public void agregarLaja(int x) {
		// TODO Auto-generated method stub
		System.out.println("no se puede");
	}

	@Override
	public int getLajas() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
