package org.ninthchapter.java;

import java.io.*; // importing Vector class

public class Invest 
{
	public static void main(String args[])
	{
		//at principalString = new Float(0);
		Float principalAmount = new Float(0); // Converting number to object
		Float interestRate = new Float(0);
		int numYears = 0;
		try
		{
			DataInputStream in = new DataInputStream(System.in);
			System.out.print("Enter Principal Amount: ");
			System.out.flush();
			String principalString = in.readLine();
			principalAmount = Float.valueOf(principalString); // String object to number object
			
			System.out.print("Enter Interest Rate: ");
			System.out.flush();
			String interestString = in.readLine();
			interestRate = Float.valueOf(interestString);
			System.out.print("Enter Number of Years: ");
			System.out.flush();
			String yearsString = in.readLine();
			numYears = Integer.parseInt(yearsString); // Numeric strings to numbers
		}
		catch(IOException e)
		{
			System.out.println("I/O Error");
			System.exit(1);
		}
		float value = loan(principalAmount.floatValue(), interestRate.floatValue(), numYears);
		printline();
		System.out.println("Final Value = " + value);
		printline();
	} // Method to compute final values
	static float loan(float p, float r, int n)
	{
		int year = 1;
		float sum = p;
		while(year <= n)
		{
			sum = sum * (1+r);
			year = year + 1;
		}
		return sum;
	}
	// Method to draw a line
	static void printline()
	{
		for(int i = 1; i <= 30; i++)
		{
			System.out.print("=");
		}
		System.out.println(" ");
	}
}
