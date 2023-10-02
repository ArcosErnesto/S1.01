package n1ejercicio1;

public class Percusion extends Instrumento {

	static {
		System.out.println("La clase Percusion se ha cargado.\n");
	}

	public Percusion(String nombre, double precio) {
		super(nombre, precio);
	}

	@Override
	public void tocar() {
		System.out.println("Está sonando el instrumento de percusión: " + this.nombre + ".");
	}

}
