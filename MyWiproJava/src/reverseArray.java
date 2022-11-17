import java.util.*;

public class reverseArray {
	
	
	static void printVerticle(String x)
	{
		char[] arr =  x.toCharArray();
		
//		for(char a:arr)
//		System.out.println(a);

		
		for(int i=arr.length-1;i>=0;i--)
		{
			char a= arr[i];
			System.out.println(a);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String x=sc.nextLine();
		printVerticle(x);
	}	
		

}
