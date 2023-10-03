package n1ejercicio2;

public class Main {

	public static void main(String[] args) {

		System.out.println(Car.getBrand());
		System.out.println(Car.getModel());

		Car.brake();

		Car car1 = new Car();
		Car car2 = new Car();

		System.out.println(car1);
		System.out.println(car2);

		car2.setModel("Q5");
		car1.accelerate();

		System.out.println(car1);
		System.out.println(car2);

	}

}
