package ar.unq.po2.MethodSueldos;

public abstract class MethodSueldo {
	protected int porcentajeDescuento =13;
	protected int horasTrabajadas;
	
	public final int sueldo() {
		int sueldoBruto = this.calcularBasico()+this.calcularExtra();
		return(sueldoBruto - this.calcularDescuento());
	}
	
	public abstract int calcularBasico();
	public abstract int calcularExtra();
	
	public int calcularDescuento() {
		double sueldoBruto = this.calcularBasico()+this.calcularExtra();
		return (int) (sueldoBruto * porcentajeDescuento/100);
	}
}
