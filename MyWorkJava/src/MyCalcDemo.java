
public class MyCalcDemo {
	
	public int addNumbers(int a,int b)
	{
		return a+b;
	}
	
	public Student getStud(String name)
	{
		Student student=new Student();
		
		student.setName(name);
		//student.setName("Mr "+name);
		
		return student;
	}
	
}
