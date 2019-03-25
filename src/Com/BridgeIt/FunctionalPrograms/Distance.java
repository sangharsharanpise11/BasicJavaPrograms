/**
 * created by: Sangharsha Ranpise.
 * Date: 28/02/2019.
 * Purpose:/*Write a program Distance.java that takes two integer ommand-line arguments x and y and prints 
the Euclidean distance from the point (x, y) to the origin (0, 0). 
The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
*/  

package Com.BridgeIt.FunctionalPrograms;

import java.util.Scanner;

import Com.BridgeIt.Utility.FunctionalUtility;

public class Distance 
{
/*main method program start from here*/
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of x and y:");
		int x=sc.nextInt();
		int y=sc.nextInt();
	
		FunctionalUtility.distance(x,y);
	
	}
}
