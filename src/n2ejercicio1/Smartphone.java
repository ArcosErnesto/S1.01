package n2ejercicio1;

public class Smartphone extends Telefono implements Camara, Reloj {

	public Smartphone(String marca, String modelo) {
		super(marca, modelo);
	}

	@Override
	public void fotografiar() {
		System.out.println("Se está haciendo una foto en smartphone " + getMarca() + " " + getModelo() + ".");
	}

	@Override
	public void alarma() {
		System.out.println("Está sonando la alarma en smartphone " + getMarca() + " " + getModelo() + ".");
	}
}