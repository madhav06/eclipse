package org.tutorialpoint;

public class Bike extends Vehicle {
	
	public void character() {
		System.out.println(" Characteristics of my bike: ");
		
		// calls the add method of parentclass
		System.out.println();
		super.power();
		super.engine();
		super.gearbox();
	}
	
	public static void main(String[] args) {
		
		Bike bike = new Bike();
		bike.character();
	}

}
