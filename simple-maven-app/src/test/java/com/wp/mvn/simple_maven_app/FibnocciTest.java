package com.wp.mvn.simple_maven_app;


import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class FibnocciTest {
	@Test
	void checkGivenNumberIsNegative(int number) {
		Fibnocci fibnocci = new Fibnocci();
//		assertEquals("Nothing to display for negative numbers", fibnocci.printFibnocci(-5),"Negative values are not allowed");
		
	}
	
	@Test
	void checkForNumberIsPositive(int number) {
		Fibnocci fibnocci = new Fibnocci();
//		assertEquals("Successfully Printed", fibnocci.printFibnocci(4));
	}
}
