import java.util.Scanner;

public class Add {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter 2 numbers to add");
		
		int x=sc.nextInt();
		// reads the int value from user and stores it in a variable called x
		int y=sc.nextInt();
		// reads the int value from user and stores it in a variable called y		
		
		System.out.println(y+x);
		// prints the sum of x and y
		
	}
}


