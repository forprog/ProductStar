package Part_1_5;

public class Car implements Driveable {
	private String name;
	private int power;
	private int weight;
	private CarType type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public CarType getType() {
		return type;
	}
	public void setType(CarType type) {
		this.type = type;
	}
	public Wheel getWheel() {
		return wheel;
	}
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Wheel wheel;
	public Engine engine;
	public Car(String name, int power, int weight, CarType type) {
		super();
		this.name = name;
		this.power = power;
		this.weight = weight;
		this.type = type;
		this.wheel = new Wheel();
		this.engine = new Engine();
	}
	@Override
	public void drive() {
		this.engine.start();
		this.wheel.Turn();
		this.engine.stop();
	}
}
