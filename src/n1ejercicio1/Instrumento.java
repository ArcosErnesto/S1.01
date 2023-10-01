package n1ejercicio1;

public abstract class Instrumento {
	private String nombre;
	private int precio;

	static {
		System.out.println("Instrumento: Inicialización estática");
	}

	public Instrumento(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public abstract void tocarInstrumento();

	@Override
	public String toString() {
		return "Instrumento ---> Nombre: " + nombre + ", Precio: " + precio + "€.";
	}

}
