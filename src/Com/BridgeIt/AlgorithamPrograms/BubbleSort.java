/**
 * created by: Sangharsha Ranpise.
 * Date: 28/02/2019.
 * Purpose:  bubbleSort method for String.

*/
package Com.BridgeIt.AlgorithamPrograms;

import java.util.Scanner;

import Com.BridgeIt.Utility.AlgorithmUtility;

public class BubbleSort 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Array size :");
	int size=sc.nextInt();
	
	/*size is assigned to array */
	
	int arr[]=new int[size];

	System.out.println("enter your elements in array :");
   for(int i=0;i<size;i++)
   {
	   arr[i]=sc.nextInt();
   }
   
   /*before sorting array is */
   
   System.out.println("Before Bubble Sorting :");

   AlgorithmUtility.showIntegerArray(arr);
   
   /*calling to bubbleSort */
   
   AlgorithmUtility.bubbleSort(arr);
   
  
}
}
