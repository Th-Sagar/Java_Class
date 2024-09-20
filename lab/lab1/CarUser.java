package lab1;

class Car {

	int model;
	String color;
	int price;
	int milage;



	Car() {

	}

	void print() {
		System.out.println("Model :" + model + " Color :" + color + " Price :" + price + " Milage : " + milage);
	}

}

public class CarUser {

	public static void main(String[] args) {

		Car obj = new Car();
		Car obj1 = new Car();

		obj.model = 1;
		obj.color = "red";
		obj.price = 2534;
		obj.milage = 433;
		System.out.println("Object 1 :");
		obj.print();
		System.out.println("Object 2 :");
		obj1.print();
	}
}