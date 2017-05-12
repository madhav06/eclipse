package org.tutorial;

public class StringMore {
	public static void main(String[] args) {
		
		String s = " Java ";
		System.out.println(s.charAt(2));
		
		System.out.println(s.equalsIgnoreCase("java"));
		System.out.println(s.replace('a', 'A'));
		
		String sepa = "0123456789";
		
		System.out.println(sepa.substring(4));
		System.out.println(sepa.substring(4, 7));
		
		String upper = "ABCDE";
		System.out.println(upper.toLowerCase());
		
	}

}
