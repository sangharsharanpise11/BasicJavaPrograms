/**created by: Sangharsha Ranpise.
 * Date: 28/02/2019.
 * Purpose:Sum of three Integer adds to ZERO
Desc -> A program with cubic running time. Read in N integers and counts the   number of triples that sum to exactly 0.
I/P -> N number of integer, and N integer input array
Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
O/P -> One Output is number of distinct triplets as well as the second output is to print the distinct triplets.  
*/
package Com.BridgeIt.FunctionalPrograms;

import java.util.Scanner;

import Com.BridgeIt.Utility.FunctionalUtility;


public class sumofInteger
{
	/*main method of program*/
	
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the size of array");
	int size=sc.nextInt();
	System.out.println("Enter the "+size+" elements in array:");
	int array[]=new int[size];
	for(int i=0;i<size;i++)
	{
	  array[i]=sc.nextInt();
	}
	
	/*calling sumOfThreeInteger() method with sumofInteger (class name)*/

	FunctionalUtility.sumOfThreeInteger(array);
	}
}
