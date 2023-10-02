package n1ejercicio1;

public class Main {

	public static void main(String[] args) {
		Cuerda guitarra = new Cuerda("Guitarra", 2333.86);
		Cuerda bajo = new Cuerda("Bajo", 1135.46);
		Percusion bateria = new Percusion("Bateria", 5784.24);
		Percusion congas = new Percusion("Congas", 456.36);
		Viento saxo = new Viento("Saxo", 4536.25);
		Viento trompeta = new Viento("Trompeta", 3654.47);

		guitarra.tocar();
		bajo.tocar();
		bateria.tocar();
		congas.tocar();
		saxo.tocar();
		trompeta.tocar();

	}

}
