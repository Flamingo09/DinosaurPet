import java.util.Scanner;

public class Routine {
	Scanner scan = new Scanner(System.in);
	
	public Routine() {
		Dinosaur tri = new Dinosaur(0, 50, 50, "Triceratops");
		System.out.println(tri.name + " is looking around");
		System.out.println("What do you want to do? 1. Check \n2. Feed");
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
		}
		else {
			System.out.println(tri.name + " likes this food!");
		}
		}
}
