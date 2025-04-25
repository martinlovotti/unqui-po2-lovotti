package ar.unq.po2.tp4;

public abstract class Producto implements Cobrable{
	
	protected String nombre;
	protected double precio;
	protected int stock;
	
	public Producto(String n, double p, int s) {
		this.nombre = n;
		this.precio = p;
		this.stock = s;
	}
	
	public boolean hayStock() {
		return (stock > 0);
	}
	
	@Override
	public void registrarEnCaja(Caja caja) {
		if (hayStock()) {
			caja.agregarProducto(this);
		}
		else {System.out.print("no hay stock");}
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	


	@Override
	public abstract double calcularMonto();
	
}
