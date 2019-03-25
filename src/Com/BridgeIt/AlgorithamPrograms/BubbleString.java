/**
 * created by: Sangharsha Ranpise.
 * Date: 28/02/2019.
 * Purpose:  bubbleSort method for String.

*/
package Com.BridgeIt.AlgorithamPrograms;
import java.util.Scanner;

import Com.BridgeIt.Utility.AlgorithmUtility;

public class BubbleString 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your String array size :");
	int size=sc.nextInt();
	
	/*size is assigned to array*/
	
	String stringArray[]=new String[size];
	
	System.out.println("enter your elements in array :");
	for(int i=0;i<size;i++)
	{
		stringArray[i]=sc.next();
	}
	
	/*before sorting array is*/
	
	System.out.println("Before bubble sort :");
	for(int i=0;i<size;i++)
	{
		System.out.print(stringArray[i]+" ");
	}
	System.out.println();
	
	/*calling bubbleString()*/
	
	AlgorithmUtility.bubbleString(stringArray);
}
}
