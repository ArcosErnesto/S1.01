package n1ejercicio1;

public abstract class Instrumento {

	protected String nombre;
	protected double precio;

	static {
		System.out.println("La clase Instrumento se ha cargado.\n");
	}

	public Instrumento(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public abstract void tocar();

}
