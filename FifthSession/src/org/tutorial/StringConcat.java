package org.tutorial;

public class StringConcat {
	public static void main(String[] args) {
		
		String sayWord = "John and jonny".concat(" are friends forever.");
		
		System.out.println(sayWord);
		System.out.println(sayWord.length());
		System.out.println(sayWord.charAt(6));
		System.out.println(sayWord.substring(6, 8));
	}

}
