package ar.unq.po2.MethodSueldos;

public class EmpleadoPasante extends MethodSueldo {

	private int valorDeHora = 40;
	@Override
	public int calcularBasico() {
		// TODO Auto-generated method stub
		return this.horasTrabajadas * valorDeHora;
	}

	@Override
	public int calcularExtra() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
