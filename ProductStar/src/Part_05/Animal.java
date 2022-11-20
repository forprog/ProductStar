package Part_05;

public abstract class Animal {
	int age;
	Colour colour;
	boolean gender;
	protected int lives;

	public Animal() {
		super();
		System.out.println("Animal constructor called");
		this.lives = 1;
		System.out.println("Animal has " + this.lives + " lives");
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}

	public void jump() {
		System.out.println("Jump");
	}

	public abstract void makeSound();

}
