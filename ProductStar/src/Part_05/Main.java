package Part_05;

public class Main {

	public static void main(String[] args) {
		//System.out.println("G'day mate");
		Car someSedan = new Car("Volvo",140,1100,CarType.SEDAN);
		Car someEM = new ElectricCar("Toyota",140,1100,CarType.SEDAN);
		testCar(someSedan);
		testCar(someEM);
	}
	
	public static void testCar(Car car) {
		System.out.println("Name: "+car.getName());
		System.out.println("Type: "+car.getType());
		System.out.println("Power: "+car.getPower());
		System.out.println("Weight: "+car.getWeight());
		car.drive();
	}
	
	public void takeMeToThePark(Walkable walkable) {
		walkable.walk();
		
	}

}
