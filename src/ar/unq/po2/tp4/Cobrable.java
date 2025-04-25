package ar.unq.po2.tp4;

public interface Cobrable {

	double calcularMonto();
	void registrarEnCaja(Caja c);
	
	//este método lo debe de implementar la caja en su método registrarTotal usando su lista de de cobrables
	default void registrarPago(Agencia a) {
		a.registrarPago(this);
	}

}
