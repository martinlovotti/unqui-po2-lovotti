package ar.unq.po2.tp4;

public class ProductoCooperativa extends Producto{

	public ProductoCooperativa(String n, double p, int s) {
		super(n, p, s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularMonto() {
		// TODO Auto-generated method stub
		return precio * 0.9;
	}

	
	
	

}
