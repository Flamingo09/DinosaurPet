import java.util.Scanner;
import java.util.Random;

public class Routine {
	Scanner scan = new Scanner(System.in);
	Dinosaur tri = new Dinosaur(0, 50, 50, "Triceratops");
	int food = 3;
	boolean life = true;
	Random r = new Random();
	int rand2;
	int rand3;
	int rand4;
	
	public Routine() {
	do {
		int rand2 = r.nextInt(2);
		int rand3 = r.nextInt(3);
		int rand4 = r.nextInt(4);
		System.out.println(tri.name + " is looking around");
		System.out.println("What do you want to do? \n1. Status \n2. Feed \n3. Explore");
		int command = scan.nextInt();
		
		// command 1 checks the stats
		if (command == 1) {
			System.out.println(tri.toString());
			if (tri.happy >= 75) {
				System.out.println(tri.name + " is in a good mood!");
			}
			
			else if (tri.happy < 75 & tri.happy >= 45) {
				System.out.println(tri.name + " is doing alright.");
			}
			
			else {
				System.out.println(tri.name + " is mad!");
			}
			System.out.println("Food: " + food);

		}
		
		// command 2 feeds the dinosaur
		else if (command == 2)	{
			System.out.println(tri.name + " likes this food!");
			tri.happy += 5;
			tri.hunger -= 5;
			food = food - 1;
		}
		
		
		// command 3 searches for food
		else if (command == 3) {
			System.out.println(tri.name + " is exploring the area.");
			if (tri.happy >= 80) {
				System.out.println("He looks pretty confident!");
				if (rand4 >= 1) {
					System.out.println("Success! He found a lot of food!");
					food += 3;
					tri.hunger += 3;
				}
				
				else {
					System.out.println("Not much food was found.");
					food += 1;
					tri.hunger += 6;
				}
			}
			
			else if (tri.happy >= 30) {
				System.out.println("Looking... looking...");
				if (rand3 >= 1) {
					System.out.println("Alright! He found  some food!");
					food += 1;
					tri.hunger += 3;
				}
				
				else {
					System.out.println("He looked all over, but no food was found...");
					tri.hunger += 6;
				}
			}
			
			else {
				System.out.println("Doesn't look like he's too motivated.");
				if (rand2 == 1) {
					System.out.println("Good! He found  some food!");
					food += 1;
					tri.hunger += 3;
				}
				else {
					System.out.println("Guess he didn't find any food...");
					tri.hunger += 6;
				}
			}
		}
		
		// not a valid option
		else {
			System.out.println("That's not one of the options!");
		}
		
		} while (life == true);
	}
}
