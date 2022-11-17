import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyCalcDemoTest {
	@Test
	void sumUpTwoNumbersWhenGivenPositeIntegers()
	{
		MyCalcDemo demo=new MyCalcDemo();		
		assertEquals(4, demo.addNumbers(2, 2), "check the logic of your code");
		assertEquals(0,demo.addNumbers(0, 0),"Check the logic once again");
		
	}
	
	@Test
	void shouldNotReturnNullWhenGivenName()
	{
	
		MyCalcDemo demo=new MyCalcDemo();			
		assertNotNull("Student Object is null",demo.getStud("raj"));
	}


	@Test
	void shouldNotReturnNullNameWhenGivenName()
	{
		MyCalcDemo demo=new MyCalcDemo();			
		assertNotNull("name is returned as null",demo.getStud("raj").getName());
	}

	@Test
	void shouldCheckGivenNameIsName()
	{
		MyCalcDemo demo=new MyCalcDemo();			
		assertEquals("raj",demo.getStud("raj").getName(),"when raj is passed raj is not returend");
	}


}
