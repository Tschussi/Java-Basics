import java.util.Scanner;

public class lab2A {

	public static void main(String[] args) {
		// Part 1
		System.out.println("Hello, my name is James and I am 18 years old. I’m");
		System.out.println("enjoying my time at Villanova, though I miss my pet");
		System.out.println("Luca very much!\n");
		
		// Part 2
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter name: ");
		String name = scanner.nextLine();
		System.out.println("Please enter pet name: ");
		String pet = scanner.nextLine();
		System.out.println("Please enter age: ");
		String age = scanner.nextLine();
		System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
		System.out.println("I'm enjoying my time at villanova, but I miss my pet " + pet + " very much");
		scanner.close();
	}

}
