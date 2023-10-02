package n1ejercicio1;

public class Cuerda extends Instrumento {

	static {
		System.out.println("La clase Cuerda se ha cargado.\n");
	}

	public Cuerda(String nombre, double precio) {
		super(nombre, precio);
	}

	@Override
	public void tocar() {
		System.out.println("Está sonando el instrumento de cuerda: " + this.nombre + ".");

	}

}