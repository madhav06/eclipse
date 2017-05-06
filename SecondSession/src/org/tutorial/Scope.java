package org.tutorial;

public class Scope
{
	public static void main(String args[])
	{
		int num1; // visible in main
		num1 = 20;
		if(num1 == 20) // start new scope
		{
			int num2 = 30; // visible only to this block
			System.out.println("num1 and num2 : " + num1+ " " +num2);
		}
		// num2 = 100; // error
		// System.out.println(num2);
		System.out.println("num1 is " + num1);

		}	
}

