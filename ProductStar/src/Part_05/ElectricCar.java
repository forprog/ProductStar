package Part_05;

public class ElectricCar extends Car{

	@Override
	public void drive() {
		this.wheel.Turn();
	}

	public ElectricCar(String name, int power, int weight, CarType type) {
		super(name, power, weight, type);
	}

}
