package com.wp.mvn.simple_maven_app;

public class Fibnocci {
	public String printFibnocci(int number) {
		if(number<=0)
			System.out.println("Nothing to display for negative numbers");
		else
		{
			int a=0,b=1,c;
			System.out.println(a+" "+b+" ");
			for(int i=0;i<number;i++) {
				c = a+b;
				System.out.print(c+" ");
				a=b;
				c=b;
			}
		}
		return "Sucessfully printed";
	}
}
