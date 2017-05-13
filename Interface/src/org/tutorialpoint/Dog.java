package org.tutorialpoint;

 abstract class Dog implements Pet{
	public static void friendly() {
		// TODO Auto-generated method stub
		
	}
	public static boolean roam() {
		return true;
		// TODO Auto-generated method stub
		
	}
	public static boolean eat() {
		return true;
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.print(Dog.eat());
		System.out.println(" ");
		System.out.print(Dog.roam());
		//System.out.print(Dog.friendly());
	}

}
