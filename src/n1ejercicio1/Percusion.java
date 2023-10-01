package n1ejercicio1;

public class Percusion extends Instrumento {

	public Percusion(String nombre, int precio) {
		super(nombre, precio);

	}

	@Override
	public void tocarInstrumento() {
		System.out.println("Estás tocando un instrumento de percusión.");

	}

}
