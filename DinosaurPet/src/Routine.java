import java.util.Scanner;
import java.util.Random;

public class Routine {
	Scanner scan = new Scanner(System.in);
	Dinosaur tri = new Dinosaur(0, 50, 50, "Triceratops");
	int food = 3;
	int gold = 0;
	boolean life = true;
	Random r = new Random();
	int rand2;			// 0, 1
	int rand3; 			// 0, 1, 2
	int rand4; 			// 0, 1, 2, 3
	
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
			System.out.println("Gold: " + gold);

		}
		
		// command 2 feeds the pet
		else if (command == 2)	{
			System.out.println(tri.name + " likes this food!");
			tri.happy += 2;
			tri.hunger -= 5;
			food = food - 1;
		}
		
		
		// command 3 searches for food
		else if (command == 3) {
			System.out.println(tri.name + " is exploring the area.");
			if (tri.happy >= 80) {
				System.out.println("He looks pretty confident!");
				
				// from 0 to 3, if rand4 == 1, 2 or 3
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
				
				// from 0 to 2, if rand3 equals 1 or 2
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
				
				// from 0 to 1, if rand2 equals 1
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
