package ar.unq.po2.tp4;

public class Impuesto implements Cobrable {
	private double monto;
	
	@Override
	public double calcularMonto() {
		// TODO Auto-generated method stub
		return monto;
	}

	@Override
	public void registrarEnCaja(Caja c) {
		// TODO Auto-generated method stub
		c.agregarProducto(this);
	}

	
	
}
