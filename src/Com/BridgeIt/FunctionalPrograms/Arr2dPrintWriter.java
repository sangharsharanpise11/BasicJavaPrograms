
/*created by: Sangharsha Ranpise. 
 * Date: 28/02/2019.
 * Purpose:  A library for reading in 2D arrays of integers, doubles, or booleans from standard input and printing them out to standard output.
I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
Logic -> create 2 dimensional array in memory to read in M rows and N cols 
O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with OutputStreamWriter to print the output to the screen.
*/
package Com.BridgeIt.FunctionalPrograms;

import java.io.FileNotFoundException;

import java.io.PrintWriter;
import java.util.Scanner;

import Com.BridgeIt.Utility.DataStructureUtility;
import Com.BridgeIt.Utility.FunctionalUtility;


public class Arr2dPrintWriter 
{
	/*this is main method program will start from here*/
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		
	/*taking input from user using Scanner class */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of rows: ");
		int row = sc.nextInt();
		System.out.print("Enter no of columns: ");
		int column = sc.nextInt();
		System.out.println("Enter "+row*column+" Array element");
		int array[][] =new int[row][column]; 
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < column; j++)
			{
				array[i][j] = sc.nextInt();
			}
		}
		FunctionalUtility.printWriter(row,column,array);
	}
}

