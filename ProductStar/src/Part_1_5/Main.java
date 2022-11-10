package Part_1_5;

public class Main {

	public static void main(String[] args) {
		//System.out.println("G'day mate");
		Car someSedan = new Car();
		someSedan.name="Volvo";
		someSedan.power = 140;
		someSedan.type = CarType.SEDAN;
		someSedan.weight = 1100;
		someSedan.engine.start();
		someSedan.engine.stop();
		someSedan.wheel.Turn();
	}
	
	public void takeMeToThePark(Walkable walkable) {
		walkable.walk();
		
	}

}
