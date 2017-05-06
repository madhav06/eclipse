package org.tutorial;

public class UnaryOperators 
{
	public static void main(String[] args)
	{
		int value =+ 1; // int value = value + 1.
		System.out.println(value);
		
		value--;
		System.out.println(value); // value is now 0.
		
		value++;
		System.out.println(value); // value will be 1.
		
		boolean success = false;
		System.out.println(success); // prints false
		
		System.out.println(!success); // prints true
		
		int a = 5;
		a++; // prints 6
		System.out.println(a);
		
		++a;
		System.out.println(a); // prints 7
	}
}
