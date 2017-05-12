package org.tutorial;

public class OverloadingDemo {
	public static void main(String[] args) {
		
		int a = 13;
		int b = 07;
		double c = 9.7;
		double d = 13.5;
		
		int resultInt = minMethod(a,b);
		double resultDouble = minMethod(c,d);
		
		System.out.println(" Minimum Value = " +resultInt);
		System.out.println(" Minimum Value = " +resultDouble);
	}

	public static int minMethod(int num1, int num2) {
		// TODO Auto-generated method stub
			int min;
			if(num1 > num2)
				min = num2;
			else
				min = num1;
			return min;
	}
	public static double minMethod(double num1, double num2) {
		double min;
		if(num1 > num2)
			min = num2;
		else
			min = num1;
		return min;
	}
	
}


