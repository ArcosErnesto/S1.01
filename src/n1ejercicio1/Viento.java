package n1ejercicio1;

public class Viento extends Instrumento {

	static {
		System.out.println("La clase Viento se ha cargado.\n");
	}

	public Viento(String nombre, double precio) {
		super(nombre, precio);

	}

	@Override
	public void tocar() {
		System.out.println("Está sonando el instrumento de viento: " + this.nombre + ".");

	}

}