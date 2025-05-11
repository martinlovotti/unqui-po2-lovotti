package ar.unq.po2.compositeCultivos;

public class Trigo extends PorcionTierra {

	public Trigo(String n) {
		super(n);
		this.value = 300;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int obtenerGanancias() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public void aniadir(PorcionTierra p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(PorcionTierra p) {
		// TODO Auto-generated method stub
		
	}

}
