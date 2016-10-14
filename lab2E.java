import java.util.Scanner;

public class lab2E {

	public static void main(String[] args) {
		int temp;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of integers: ");
		int size = scanner.nextInt();
		int[] ints = new int[size];
		System.out.println("Please enter the " + size + " integers: ");
		for(int x = 0; x<size; x++) 
		{
			ints[x] = scanner.nextInt();
		}
		scanner.close();
		for(int i=0; i<size-1; i++)
		{
				for(int k = 0; k<size-1; k++)
			{
				if(ints[k] < ints[k+1])
				{
					temp = ints[k];
					ints[k] = ints[k+1];
					ints[k+1] = temp;
				}
			}
		}
		System.out.println("The max value entered is " + ints[0]);
	}

}
