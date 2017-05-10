package org.ninthchapter.java;




public class MarksTest {
	public static void main(String[] args) {
		
		Marks m1 = new Marks(01, 53, 63, 72);
		Marks m2 = new Marks(02, 47, 56, 33);
		Marks m3 = new Marks(03, 65, 77, 83);
		
		System.out.println(" marks obtained by m1: " + m1.subject1 +" "+ m1.subject2 +" "+ m1.subject3);
		System.out.println(" marks obtained by m2: " + m2.subject1 +" "+ m2.subject2 +" "+ m2.subject3);
		System.out.println(" marks obtained by m3: " + m3.subject1 +" "+ m3.subject2 +" "+ m3.subject3);
		
		// highest marks in each subject and the roll no of that student
		
		System.out.println(" Highest in subject1: " + m3.subject1 + " Highest in subject2: " + m3.subject2 + " Highest in subject3: " + m3.subject3);
		// Student who secured highest marks
		System.out.println(" Student Roll number who secured highest: " + m3.rollno);
		
		System.out.println("Student who secured highest :");System.out.println(m3.rollno);System.out.println("with marks: ");System.out.println(m3.subject1 + m3.subject2 + m3.subject3);
	}

}

