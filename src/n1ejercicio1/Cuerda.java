package n1ejercicio1;

public class Cuerda extends Instrumento {

	public Cuerda(String nombre, int precio) {
		super(nombre, precio);

	}

	@Override
	public void tocarInstrumento() {
		System.out.println("Estás tocando un instrumento de cuerda.");

	}

}
