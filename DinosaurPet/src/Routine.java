import java.util.Scanner;
import java.util.Random;

public class Routine {
	Scanner scan = new Scanner(System.in);
	Dinosaur tri = new Dinosaur(0, 50, 50, "Triceratops");
	int food = 3;
	int gold = 0;
	int key = 0;
	int turn = 0;
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

		if(turn == 0) {
			System.out.println("Name of out Dinosaur pet is " + tri.name ". \n Do you want to change his name?");
			System.out.println("1. Yes \n2. No");
			int command = scan.nextInt();
			if(command == 1) {
				tri.name = scan.nextLine().trim();
				System.out.println("Name of our Dinosaur pet has been changed to " + tri.name);
			}
		}
		if (tri.hunger >50) {
			System.out.println(tri.name + " is hungry!");
		}
		
		if (tri.hunger >= 100) {
			life = false;
		}
		
		if (tri.happy >= 75) {
			System.out.println(tri.name + " is proudly walking around");
		}
		else if (tri.happy >= 50 & tri.happy < 75) {
			System.out.println(tri.name + " is looking around");
		}
		else if (tri.happy >= 25 & tri.happy < 50) {
			System.out.println(tri.name + " seems unhappy.");
		}
		else {
			System.out.println(tri.name + " is miserable.");
		}
		System.out.println("///////////////////////////////////////////");
		System.out.println(tri.toString());
		System.out.println("What do you want to do? [1] Status [2] Feed [3] Explore [4] Play");
		int command = scan.nextInt();
		
		// command 1 checks the stats
		if (command == 1) {
			if (tri.happy >= 75) {
				System.out.println(tri.name + " is in a good mood!");
			}
			
			else if (tri.happy < 75 & tri.happy >= 45) {
				System.out.println(tri.name + " is doing alright.");
			}
			
			else {
				System.out.println(tri.name + " is mad!");
			}
			System.out.println("Food: " + food + "    Gold: " + gold + "    Keys: " + key);
		}
		
		// command 2 feeds the pet
		else if (command == 2)	{
			if (food >= 1) {
				System.out.println(tri.name + " likes this food! \nHappy + 2");
				tri.happy += 2;
				tri.hunger -= 5;
				food = food - 1;
			}
			else {
				System.out.println("You're out of food! Go find some more!");
			}
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
					tri.hunger += 5;
					if (rand4 == 3) {
						System.out.println(tri.name + " also found a key!");
						key++;
					}
				}
				
				else {
					System.out.println("Not much food was found.");
					food += 1;
					tri.hunger += 5;
				}
			}
			
			else if (tri.happy >= 30) {
				System.out.println("Looking... looking...");
				
				// from 0 to 2, if rand3 equals 1 or 2
				if (rand3 >= 1) {
					System.out.println("Alright! He found  some food!");
					food += 1;
					tri.hunger += 5;
					if (rand4 == 3) {
						System.out.println(tri.name + " also found a key!");
						key++;
					}
				}
				
				else {
					System.out.println("He looked all over, but no food was found...");
					tri.hunger += 5;
				}
			}
			
			else {
				System.out.println("Doesn't look like he's too motivated.");
				
				// from 0 to 1, if rand2 equals 1
				if (rand2 == 1) {
					System.out.println("Good! He found  some food!");
					food += 1;
					tri.hunger += 5;
					if (rand4 == 3) {
						System.out.println(tri.name + " also found a key!");
						key++;
					}
				}
				else {
					System.out.println("Guess he didn't find any food...");
					tri.hunger += 5;
				}
			}
		}
		
		else if (command == 4) {
			if (rand3 == 0) {
				System.out.println(tri.name + " wants to play fetch!");
				tri.hunger += 5;
				tri.happy += 5;
			}
			else if (rand3 == 1) {
				System.out.println(tri.name + " wants to race!");
				tri.hunger += 5;
				tri.happy += 5;
			}
			else {
				System.out.println(tri.name + " wants to dig!");
				tri.hunger += 5;
				tri.happy += 5;
				if (key >= 1) {
					System.out.println(tri.name + " found a treasure chest! \nDo you want to open it?");
					System.out.println("1. Yes \n2. No");
					command = scan.nextInt();
						if (command == 1) {
							key =- 1;
							System.out.println("You open the treasure chest and find...");
							if (rand3 == 2) {
								System.out.println("... a stockpile of food!");
								food =+ 10;
							}
							else if (rand3 == 1) {
								System.out.println("... lights and music blast out of the chest!");
								System.out.println("What a cool light show!");
								System.out.println(tri.name + " is loving this!!");
								tri.happy =+ 10;
							}
							else {
								System.out.println("2 keys!");
								key =+ 2;
							}
						}
				}
				
				else {
					System.out.println(tri.name + " found a treasure chest! \nBut you don't have a key!!");
				}
			}
		}
		
		// not a valid option
		else {
			System.out.println("That's not one of the options!");
		}
		
		turn ++;
		if(turn%3 == 0)
			tri.age ++;
		} while (life == true);
	
	System.out.println(tri.name + " has starved.");
	System.out.println(tri.name + " has died at the age of " + tri.age);
	}
}
