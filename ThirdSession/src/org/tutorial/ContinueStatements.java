package org.tutorial;

public class ContinueStatements 
{
	public static void main(String[] args)
	{
		// continue example
		
		String searchString = " what why where when which would";
		int lengthOfString = searchString.length();
		int numWs = 0;
		int numEs = 0;
		
		for(int i = 0; i  < lengthOfString; i++)
		{
			// find only W's
			if(searchString.charAt(i)!= 'w')
				continue;
			// process w's 
			numWs++;
			// find only E's
			//(searchString.charAt(i)!= 'e')
				continue;
			// process e's
			//numEs++;
		}
		System.out.println(" found " + numWs + " W's inside the string ");
		//System.out.println(" found " + numEs + " E's inside the string ");
	}
}
