package org.tutorial;
import java.util.*;
import java.math.*;


public class InvestmentEquation {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the value of P: ");
		double p = sc.nextDouble();
		System.out.println();
		
		System.out.print(" Enter the value of r: ");
		double r = sc.nextDouble();
		System.out.println();
		
		System.out.print(" Enter the value of n: ");
		double n = sc.nextDouble();
		System.out.println();
		
		double v1 = 1+r;
		double v2 = Math.pow(v1, n);
		double v = p*v2;
		
		Double d = new Double(v);
		System.out.println(d);
		
	}

}
