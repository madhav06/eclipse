package org.tutorial;

public class StringDemo {
	public static void main(String[] args) {
		
		char[] sayhello = {'h','e','l','l','o','.'};
		String helloString = new String(sayhello);
		
		System.out.println(helloString);
		
		String saySomething = " John and jonny are good friends. ";
		
		int length = saySomething.length();
		System.out.println("String Length: " +saySomething);
	}
	
}
