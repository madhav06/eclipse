package org.tutorial;

public class Swap {
	public static void main(String[] args) {
		
		int a = 20;
		int b = 30;
		
		System.out.println(" a = " +a+ " and b = " +b );
		// invoke the swap method
		
		swapMethod(a,b);
	}

	public static void swapMethod(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(" Before swapping a = " +a+ " and b = "+b);
		// swap a with b
		int c = a; // c = 20
		a = b; // a = 30
		b = c; // b = 20
		
		System.out.println(" After swapping a = " +a+ " and b = " +b);
		
	}

}
