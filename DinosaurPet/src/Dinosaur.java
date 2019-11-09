import java.util.Scanner;

public class Dinosaur {
	int age;
	int happy;
	int hunger;
	String name;
	
	public Dinosaur(int age, int happy, int hunger, String name) {
		this.age = age;
		this.happy = happy;
		this.hunger = hunger;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getHappy() {
		return happy;
	}
	
	public int getHunger() {
		return hunger;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return(this.getName() +
			"\nAge:" + this.getAge() +
			" Hunger: " + this.getHunger() +
			" Happiness: " + this.getHappy());
	}
	
	public static void main(String args[]) {
			new Routine();
	}
}
