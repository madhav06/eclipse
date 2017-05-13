package org.tutorialpoint;

public class Subclass extends Parentclass{
	
	public void add() {
		// call the add method of parentclass
		super.add();
		System.out.println();
		System.out.println(" Add method in subclass. ");
	}
	
	public static void main(String[] args) {
		
		Subclass sobject = new Subclass();
		sobject.add();
	}

}
