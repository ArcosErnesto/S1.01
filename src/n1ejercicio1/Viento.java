package n1ejercicio1;

public class Viento extends Instrumento {

	public Viento(String nombre, int precio) {
		super(nombre, precio);

	}

	@Override
	public void tocarInstrumento() {
		System.out.println("Estás tocando un instrumento de viento.");

	}

}