package Part_1_5;

public class Cat extends Animal implements Walkable, Fighttable{
	public void makeSound() {
		System.out.println("Mew");
	}
	public Cat() {
		super();
		System.out.println("Cat constructor called");
		this.lives = 9;
		System.out.println("Cat has " + this.lives + " lives");
	}
	@Override
	public void scratch() {
		System.out.println("Scratch");
		
	}
	@Override
	public void walk() {
		System.out.println("Walk the cat");
		
	}
	@Override
	public void bite() {
		System.out.println("BITEEE");
		
	}
}
