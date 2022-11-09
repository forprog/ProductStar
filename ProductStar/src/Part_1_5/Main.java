package Part_1_5;

public class Main {

	public static void main(String[] args) {
		//System.out.println("G'day mate");
		Walkable normCat = new Cat();
		Walkable dog = new Dog();
		
		normCat.walk();
		dog.walk();
	}
	
	public void takeMeToThePark(Walkable walkable) {
		walkable.walk();
		
	}

}
