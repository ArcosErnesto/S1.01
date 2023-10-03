package n1ejercicio2;

public class Car {
	private static final String BRAND = "Audi";
	private static String model = "TT";
	private final int POWER = 110;

	public static String getBrand() {
		return BRAND;
	}

	public static String getModel() {
		return model;
	}

	public static void setModel(String model) {
		Car.model = model;
	}

	public int getPOWER() {
		return POWER;
	}

	public static void brake() {
		System.out.println("El vehículo está frenando.");
	}

	public void accelerate() {
		System.out.println("El vehículo está acelerando.");
	}

	@Override
	public String toString() {
		return "Coche ---> Marca: " + BRAND + ", modelo: " + model + ", potencia: " + POWER + "CV.";
	}

}
