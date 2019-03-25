/**
 * created by: Sangharsha Ranpise.
 * Date: 28/02/2019.
 * Purpose:  Reads in integers prints them in sorted order using Bubble Sort
 
*/
package Com.BridgeIt.AlgorithamPrograms;
import java.util.Scanner;

import Com.BridgeIt.Utility.AlgorithmUtility;


public class StringBubbleSort
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of array :");
	int size=sc.nextInt();
	int arr[]=new int[size];
	
	System.out.println("Enter "+size+" elements :");
	for(int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Before Bubble Sort Array is :");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]+" ");
	}
	AlgorithmUtility.bubbleSort(arr);
}
}
