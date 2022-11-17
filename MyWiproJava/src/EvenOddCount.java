import java.util.*;
public class EvenOddCount {
	public String count(int arr[])
	{
		int n = arr.length;
		String res = "";
		int cnt1=0,cnt2=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
				cnt1++;
			else
				cnt2++;
		}
		res+="Number of even elements are"+ " "+cnt1+"and number of odd elements are" +cnt2;
		return res;
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		EvenOddCount evenOddCount = new EvenOddCount();
		String res = evenOddCount.count(arr);
		System.out.println(res);
	}
}
