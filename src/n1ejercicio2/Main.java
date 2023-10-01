package n1ejercicio2;

public class Main {

	public static void main(String[] args) {

		Coche.frenar();

		Coche coche1 = new Coche();

		System.out.println(coche1);

		coche1.setModelo("TT");

		System.out.println(coche1);

		coche1.acelerar();
		coche1.frenar();

	}

}
