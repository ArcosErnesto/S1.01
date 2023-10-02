package n1ejercicio1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Instrumento> instrumentos = new ArrayList<Instrumento>();

		Cuerda guitarra = new Cuerda("Guitarra", 2333.86);
		Cuerda bajo = new Cuerda("Bajo", 1135.46);
		Percusion bateria = new Percusion("Bateria", 5784.24);
		Percusion congas = new Percusion("Congas", 456.36);
		Viento saxo = new Viento("Saxo", 4536.25);
		Viento trompeta = new Viento("Trompeta", 3654.47);

		instrumentos.add(bateria);
		instrumentos.add(bajo);
		instrumentos.add(congas);
		instrumentos.add(saxo);
		instrumentos.add(guitarra);
		instrumentos.add(trompeta);

		for (Instrumento instrumento : instrumentos) {
			System.out.println(instrumento);
			instrumento.tocar();
		}

	}

}
