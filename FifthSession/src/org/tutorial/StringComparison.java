package org.tutorial;

public class StringComparison {
	public static void main(String[] args) {
		
		// equals method
		String s = " Hell";
		String s1 = " Hello";
		String s2 = " Hello";
		
		System.out.println(s1.equals(s2));
		System.out.println(s.equals(s1));
		
		// == operator
		
		String a = " Hello";
		String b = " Hello";
		String c = new String(" Hello");
		
		if(a == b)
			System.out.println(" String refers to same instance. ");
		else
			System.out.println(" String refers to different instances. ");
		
			System.out.println(" ");
		if(a == c)
			System.out.println(" String refers to same instance. ");
		else
			System.out.println(" String refers to different instances. ");
		
		// compareTo operator
		
		String p = " John";
		String q = " KUMAR";
		String r = " Johnny";
		
		System.out.println(q.compareTo(r));
		System.out.println(p.compareTo(r));
		
	}

}
