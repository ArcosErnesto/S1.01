package n2ejercicio1;

public class Telefono {
	private String marca;
	private String modelo;

	public Telefono(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String llamar(String numero) {
		return "Se está llamando al número: " + numero + " en teléfono " + getMarca() + " " + getModelo() + ".";
	}
}