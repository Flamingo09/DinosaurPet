import java.util.Scanner;

public class Routine {
	Scanner scan = new Scanner(System.in);
	Dinosaur tri = new Dinosaur(0, 50, 50, "Triceratops");
	int food = 3;
	boolean life = true;
	
	public Routine() {
	do {
		System.out.println(tri.name + " is looking around");
		System.out.println("What do you want to do? \n1. Status \n2. Feed \n3. Explore");
		int command = scan.nextInt();
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
		else if (command == 2)	{
			System.out.println(tri.name + " likes this food!");
			tri.happy += 5;
			tri.hunger -= 5;
			food -= 1;
		}
		
		else {
			System.out.println("That's not one of the options!");
		}
		
		} while (life == true);
	}
}
