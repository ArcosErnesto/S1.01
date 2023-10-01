package n1ejercicio1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Instrumento> instrumentos = new ArrayList<Instrumento>();

		Viento viento1 = new Viento("Saxo", 2000);
		Cuerda cuerda1 = new Cuerda("Guitarra", 2000);
		Cuerda cuerda2 = new Cuerda("Bajo", 1500);
		Percusion percusion1 = new Percusion("Bateria", 5000);
		Percusion percusion2 = new Percusion("Congas", 700);

		instrumentos.add(viento1);
		instrumentos.add(cuerda1);
		instrumentos.add(cuerda2);
		instrumentos.add(percusion1);
		instrumentos.add(percusion2);

		for (int i = 0; i < instrumentos.size(); i++) {
			System.out.println(instrumentos.get(i));
			instrumentos.get(i).tocarInstrumento();

		}

	}

}
