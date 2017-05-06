package org.tutorial;

public class InvalidScope
{
	public static void main(String args[])
	{
		/* int num = 1;
		*{
		*	create a new scope
		* int num = 2;  compile time error
		*/
		
		// create a new scope
	{
		int num = 1;
		System.out.println(num);
	}
	
	{
		int num = 2;
		System.out.println(num);
	}
  }
}

