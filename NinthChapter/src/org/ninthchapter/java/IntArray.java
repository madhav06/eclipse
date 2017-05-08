package org.ninthchapter.java;

public class IntArray 
{
	public static void main(String[] args) 
	{
		// declare an array of integers
		int[] anArray;
		// assign a to each array element and print
		for(int i = 0; i < anArray.length; i++)
		{
			anArray[i] = i;
			System.out.println(anArray[i] + " ");
		}
		System.out.println();
	}
}
