import java.util.Scanner;

public class lab2B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of hours:");
		int hr = scanner.nextInt();
		System.out.println("Enter the number of minutes:");
		int min = scanner.nextInt();
		System.out.println("Enter the number of seconds:");
		int sec = scanner.nextInt();
		min += hr*60;
		sec += min*60;
		System.out.println("The total time in seconds is: " + sec);
		scanner.close();
	}

}
