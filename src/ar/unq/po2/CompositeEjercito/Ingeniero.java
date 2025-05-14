package ar.unq.po2.CompositeEjercito;

public class Ingeniero extends Personaje {

	public Ingeniero(Mapa p) {
		super(p);
		this.bolsaLajas = 3;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getLajas() {
		return bolsaLajas;
	}

	@Override
	public void caminar(int x) {
		for(int i = 0; i < x; i++ ) {
			System.out.println("se mueve a " + posicion);
			this.agregarLaja(i);
			posicion += 1;
		}
	}

	@Override
	public void aniadirIntegrante(Personaje p) {
		// TODO Auto-generated method stub
		System.out.println("No se puede aniadir personajes");
	}

	@Override
	public void agregarLaja(int x) {
		// TODO Auto-generated method stub
		if (this.mapa.getPunto(x) == 0  || bolsaLajas == 0 ){
			this.bolsaLajas -= 1;
			this.mapa.setPunto(x,1);
		}
		else { System.out.println("ya hay una laja en" + x + "O ya no hay lajas: " + this.bolsaLajas);}
		}
	}
	
