package ar.unq.po2.MethodSueldos;

public class EmpleadoPlanta extends MethodSueldo {
	private int sueldoBasico = 3000;
	private int cantidadHijos;
	private int plusPorHijo = 150;
	@Override
	public int calcularBasico() {
		// TODO Auto-generated method stub
		return sueldoBasico;
	}

	@Override
	public int calcularExtra() {
		// TODO Auto-generated method stub
		return cantidadHijos * plusPorHijo;
	}

	public EmpleadoPlanta(int cantHijos) {
		this.cantidadHijos = cantHijos;
	}
}
