package ar.unq.po2.compositeCultivos;

import java.util.ArrayList;

public class Parcela extends PorcionTierra {

	public Parcela(String n) {
		super(n);
		this.porcion = new ArrayList<>(); 
		// TODO Auto-generated constructor stub
	}

	@Override
	public int obtenerGanancias() {
		// TODO Auto-generated method stub
		int result = value;
		for (PorcionTierra p: porcion) {
			result += p.obtenerGanancias();
		}
		return result;
	}

	@Override
	public void aniadir(PorcionTierra p) {
		// TODO Auto-generated method stub
		porcion.add(p);
		
	}

	@Override
	public void eliminar(PorcionTierra p) {
		// TODO Auto-generated method stub
		porcion.remove(p);
	}

}
