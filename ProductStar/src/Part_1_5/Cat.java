package Part_1_5;

public class Cat extends Animal{
	public void makeSound() {
		System.out.println("Mew");
	}
	public Cat() {
		super();
		System.out.println("Cat constructor called");
		this.lives = 9;
		System.out.println("Cat has " + this.lives + " lives");
	}
}
