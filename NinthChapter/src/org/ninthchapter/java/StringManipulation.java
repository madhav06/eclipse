package org.ninthchapter.java;

// Manipulation of strings
class StringManipulation 
{
	public static void main(String args[])
	{
		StringBuffer str = new StringBuffer("Object language");
		System.out.println("original String :" + str);
		// obtaining string length
		System.out.println("Length of string :" + str.length());
		// Accessing characters in a string
		
		for(int i = 0; i < str.length(); i++)
		{
			int p = i + 1;
			System.out.println("Character at position " + p + " is " + str.charAt(i));
			
		}
		//Inserting a string in the middle
		String aString = new String(str.toString());
		int pos = aString.indexOf(" language");
		//int process = 10;
		str.insert(10 , "Oriented");
		System.out.println("Modified string " + str);
		// Modifying characters
		str.setCharAt(6, '-');
		System.out.println("String now " + str);
		// Appending a string at the end
		str.append("improves security.");
		System.out.println("Appended string " + str);
		
	}
}
