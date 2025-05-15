package ar.unq.po2.MethodSueldos;

public class EmpleadoTemporario extends MethodSueldo {
	private int sueldoBasico = 1000;
	private Boolean poseeHijosOCasado;
	private int valorDeHora = 5;
	
	@Override
	public int calcularBasico() {
		return sueldoBasico + this.horasTrabajadas * valorDeHora;
	}

	@Override
	public int calcularExtra() {
		if (poseeHijosOCasado) {
			return 150;
		}else return 0;
	}
	
	public EmpleadoTemporario (Boolean h, int horasT) {
		this.poseeHijosOCasado = h;
		this.horasTrabajadas = horasT;
	}
}
