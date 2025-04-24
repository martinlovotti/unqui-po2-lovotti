package ar.unq.po2.tp4;

public interface Cobrable {

	double calcularMonto();
	default void registrarPago(Agencia a) {
		a.registrarPago(this);
	}

}
