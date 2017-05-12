
package org.tutorial;

public class CompareStringbfff {
	

	public static void main(String[] args) {
		
		String str = "Java";
		str.concat("tutorial");
		System.out.println(str);
		
		StringBuffer strB = new StringBuffer("Java");
		
		strB.append("tutorial");
		strB.insert(4, 123);
		System.out.println(strB);
		System.out.println(strB.reverse());
		
	}

}
