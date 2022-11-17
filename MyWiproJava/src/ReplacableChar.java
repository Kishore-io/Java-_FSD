
public class ReplacableChar {

	static String myReplace(String data, char find , char replace)
	{
		char[] arr =  data.toCharArray();
		
		//write your code here;
		boolean rep = false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==find)
			{
				arr[i] = replace;
				rep = true;
			}
		}
		if(rep==false)
		{
			System.out.println("Given char not found");
		}
					
		String res=new String(arr);
		return res;
	}
			
public static void main(String[] args) {

	String x="Hello";
	
	String res = myReplace(x, 'a', 'e');
	
	//myReplace(x, 'k', 'e');
	// given char not found 
	
	System.out.println(res);
	
}

}
