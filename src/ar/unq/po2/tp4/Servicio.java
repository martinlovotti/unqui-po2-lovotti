package ar.unq.po2.tp4;

public class Servicio implements Cobrable{
	private int unidadesConsumidas;
	private double costoPorUnidad;
	
	public Servicio(int u, double c) {
		this.unidadesConsumidas =u;
		this.costoPorUnidad=c;
	}
	
	@Override
	public double calcularMonto() {
		// TODO Auto-generated method stub
		return unidadesConsumidas * costoPorUnidad;
	}
}
