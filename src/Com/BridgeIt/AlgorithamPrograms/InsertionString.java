/**
 * created by: Sangharsha Ranpise.
 * Date: 28/02/2019.
 * Purpose: Reads in strings from standard input and prints them in sorted order.
   Uses insertion sort.
 
*/
package Com.BridgeIt.AlgorithamPrograms;
import java.util.Scanner;

import Com.BridgeIt.Utility.AlgorithmUtility;


public class InsertionString 
{
	/*program will start from here*/
	
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	
	/*enter size here*/
	
	System.out.println("enter Size of String Array :");
	int size=sc.nextInt();
	
	/*size is assigned to string array*/
	
	String insertionStringArr[]=new String[size];
	
	System.out.println("enter "+size+" elements :");
	for(int i=0;i<size;i++)
	{
		insertionStringArr[i]=sc.next();
	}
	
	/*before sorting*/
	
	System.out.println("before sorting elements are ;");
	for(int i=0;i<size;i++)
	{
		System.out.println(insertionStringArr[i]);
	}
	
	/*calling insertion() to perform sorting*/
	
	AlgorithmUtility.insertionString(insertionStringArr);
	
	System.out.println();
//	System.out.println("After sorting elements are ;");
//	
//	/*array will be display*/
//	
//	for(int i=0;i<size;i++)
//	{
//		System.out.println(insertionStringArr[i]);
//	}
}
}

