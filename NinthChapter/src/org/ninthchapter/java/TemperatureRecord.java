package org.ninthchapter.java;

public class TemperatureRecord 
{
	
	final static int ROWS = 3, COLUMNS = 8;
	public static void main(String[] args)
	{
		int i,j;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int temperature[][] = {{31,29, 35, 39, 25, 27, 33, 30}, {32, 32, 35, 37, 43, 46, 52, 57}, {43, 45, 41, 36, 30, 35, 37, 44} };
		System.out.println(" TEMPERATURE TABLE ");
		System.out.println(" ");
		
		for(i = 0; i < ROWS; i++)
		{
			for(j = 0; j  < COLUMNS; j++)
			{
				System.out.println(temperature[i][j] + " ");
				
				
				  for (int i1 = 0; i1 < temperature.length; i1++) {
				        //iteration through 2nd index of 1st index (eg. through all columns)
				        for (int j1 = 0; j1 < temperature[i1].length; j1++) {
				            //compare and assign if array value is less than actual found min
				            if(min > temperature[i1][j1]){
				                min = temperature[i1][j1];
				            }
				            //compare and assign if array value is more than actual found max
				            if(max < temperature[i1][j1]){
				                max = temperature[i1][j1];
				                
				            }
				        }
				    }
	
			}
		}
		 System.out.println(" ");
	     System.out.println(" Highest temp : " + max);
	     System.out.println(" Lowest temp  : " + min);
	}
	 
}
