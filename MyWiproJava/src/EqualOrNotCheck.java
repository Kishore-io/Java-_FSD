import java.util.*;

public class EqualOrNotCheck {

	String compareChars(char a,char b)
	{
		String res = "";
		if(a==b)
			res+="Both are equal";
		else
			res+="Both are not equal";
		return res;
	}

	String compareCharsIgnoreCase(char a,char b)
	{
		String res = "";
		
		if(a==b || (a+32)==b || a==(b+32))
			res+="Both are equal";
		else
			res+="Both are not equal";
		return res;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EqualOrNotCheck equalCheckOrNot = new EqualOrNotCheck();
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		char b = sc.next().charAt(0);
		String res1 = equalCheckOrNot.compareChars(a, b);
		String res2 = equalCheckOrNot.compareCharsIgnoreCase(a, b);
		System.out.println(res1);
		System.out.println(res2);
	}

}
