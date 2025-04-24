package ar.unq.po2.tp4;



public class AgenciaRecaudadora implements Agencia {
	@Override
	public void registrarPago(Cobrable c) {
		
		System.out.println("Registrando pago: $" + c.calcularMonto());
		
	}

}
