import java.util.Scanner;
public class Calci {
	
	void add(int x,int y)
	{
		System.out.println("Addition of two numbers" +(x+y));
	}
	
	void subtract(int x,int y)
	{
		System.out.println("Subtraction of two numbers is" +(x-y));
	}
	
	void multiply(int x,int y)
	{
		System.out.println("Multiplicationn of two numbers is" +(x*y));
	}
	
	void division(int x,int y)
	{
		System.out.println("Division of two numbers is" +(x/y));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calci calci = new Calci();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		char ch;
		ch=sc.next().charAt(0);
		switch(ch)
		{
		case '+':
			calci.add(a,b);
			break;
		case '-':
			calci.subtract(a,b);
			break;
		case '*':
			calci.multiply(a,b);
			break;
		default:
			calci.division(a,b);
			break;
			
		}
	}

}
