package n2ejercicio1;

public class Main {

	public static void main(String[] args) {
		Smartphone smartphone1 = new Smartphone("iPhone", "12");
		Smartphone smartphone2 = new Smartphone("Samsung", "Galaxy S21");

		smartphone1.alarma();
		smartphone1.fotografiar();
		System.out.println(smartphone1.llamar("672023138"));

		smartphone2.alarma();
		smartphone2.fotografiar();
		System.out.println(smartphone2.llamar("658453987"));
	}

}
