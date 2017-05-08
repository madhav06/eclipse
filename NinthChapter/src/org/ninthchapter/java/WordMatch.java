package org.ninthchapter.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordMatch {
	
	public static void main(String[] args) 
	{
		String text = " i have a male cat. the color male cat  of male cat is Black ";

		
		int c = 0;
		Pattern p = Pattern.compile("male cat");
		Matcher m = p.matcher( text );
		while (m.find()) {
		    c++;
		}
		System.out.println(c);
	}
}
