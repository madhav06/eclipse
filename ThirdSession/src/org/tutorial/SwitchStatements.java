package org.tutorial;

public class SwitchStatements 
{
	public static void main(String[] args)
	{
		// switch example
		
		int month = 4;
		String monthOfYear;
		
		switch(month) {
		
		case 1: monthOfYear = " January ";
		break;
		
		case 2: monthOfYear = " February ";
		break;
		
		case 3: monthOfYear = " March ";
		break;
		
		case 4: monthOfYear = " April ";
		break;
		
		case 5: monthOfYear = " May ";
		break;
		
		case 6: monthOfYear = " June ";
		break;
		
		default: monthOfYear = " Invalid Month ";
		
		} // end of switch
		System.out.println(monthOfYear);
	}
}
