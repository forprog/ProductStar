package Part_1_5;

public class Dog extends Animal implements Walkable{	
	public void bark() {
		System.out.println("Bark");
	}
	public void makeSound() {
		System.out.println("Bark");
	}
	@Override
	public void walk() {
		System.out.println("Walk the dog");
		
	}

}
