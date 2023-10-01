package n1ejercicio2;

public class Coche {
	private static final String MARCA = "Audi";
	private static String modelo;
	private final int POTENCIA = 3000;

	public static String getMarca() {
		return MARCA;
	}

	public static String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		Coche.modelo = modelo;
	}

	public int getPOTENCIA() {
		return POTENCIA;
	}

	public static void frenar() {
		System.out.println("El vehiculo está frenando");
	}

	public void acelerar() {
		System.out.println("El vehiculo está acelerando");
	}

	@Override
	public String toString() {
		return "Coche ---> Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Potencia: " + POTENCIA + ".";
	}

}
