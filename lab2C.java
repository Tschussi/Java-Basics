import java.util.Scanner;

public class lab2C {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of seconds:");
		int sec = scanner.nextInt();
		int min = sec/60;
		int hr = min/60;
		sec = sec%60;
		min = min%60;
		System.out.println("The equivalent amount of time is: " + hr + " hours " + min + " minutes " + sec + " seconds");
		scanner.close();
	}

}
