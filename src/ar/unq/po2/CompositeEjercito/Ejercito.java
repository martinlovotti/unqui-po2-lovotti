package ar.unq.po2.CompositeEjercito;

public class Ejercito extends Personaje {

	public Ejercito(Mapa p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void caminar(int x) {
		for(Personaje p : integrantes) {
			p.caminar(x);
		}
	}

	@Override
	public void aniadirIntegrante(Personaje p) {
		// TODO Auto-generated method stub
		integrantes.add(p);
	}

	@Override
	public void agregarLaja(int x) {
		// TODO Auto-generated method stub
		System.out.println("El ejercito no hace eso");
	}

	@Override
	public int getLajas() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
