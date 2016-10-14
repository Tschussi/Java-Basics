import java.util.Scanner;

public class lab2D {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 3 integers: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int max;
		if(a > b) 
		{	
			if(a>c)
				max = a;
			else
				max = c;
		}
		else
			if (b > c)
				max = b;
			else 
				max = c;
		System.out.println("The maximum of these values is " + max);			
		scanner.close();
	}

}
