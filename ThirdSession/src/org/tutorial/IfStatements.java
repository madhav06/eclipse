package org.tutorial;

public class IfStatements 
{
	public static void main(String[] args) 
	{
		// if-else ladder
		
		int marks = 72;
		char grade = 0;
		
		if(marks >= 90)
			grade = 'A';
		else if(marks >= 80)
			grade = 'B';
		else if(marks >= 70)
			grade = 'C';
		else if(marks >= 60)
			grade = 'D';
		else if(marks >= 50)
			grade = 'E';
		
		System.out.println(" grade =  " + grade);
		
	}
}
