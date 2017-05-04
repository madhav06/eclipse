package org.ninthchapter.java;

class MulTable {

	final static int ROWS = 20;
	final static int COLUMNS = 20;

	public static void main(String args[]) {
		System.out.println("MULTIPLICATION TABLE");
		System.out.println("");
		int i, j;

		for (i = 10; i < ROWS; i++) {
			for (j = 10; j < COLUMNS; j++) {
				int temp = i * j;
				System.out.print(temp + " ");
			}
			System.out.println();
		}
	}

}
