package org.tutorial;

public class MaxValue 
{
	public static void main(String[] args) 
	{
		//Integers
		byte largestByte = Byte.MAX_VALUE;
		short largestShort = Short.MAX_VALUE;
		int largestInt = Integer.MAX_VALUE;
		
		// real numbers
		float largestFloat = Float.MAX_VALUE;
		double largestDouble = Double.MAX_VALUE;
		
		// display them all
		System.out.println(" largest byte value is   : " + largestByte);
		System.out.println(" largest short value is  : " + largestShort);
		System.out.println(" largest int value is    : " + largestInt);
		System.out.println(" largest float value is  : " + largestFloat);
		System.out.println(" largest double value is : " + largestDouble);
	}
}
