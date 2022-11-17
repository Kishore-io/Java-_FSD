
public class LowerCaseConverter {
	
	static char lowerCharConverter(char x){
		//write ur code here to covert x in lower case
		if(x>=65 && x<=90)
			return (char)(x + 32);
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		char res=	lowerCharConverter('1');		
		 System.out.println(res);


	}

}
