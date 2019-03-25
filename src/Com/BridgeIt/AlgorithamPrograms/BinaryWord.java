/**
 * created by: Sangharsha Ranpise.
 * Date: 28/02/2019.
 * Purpose: Read in a list of words from File. Then prompt the user to enter a word to search the list.
 *  The program reports if the search word is found in the list.
 
*/
package Com.BridgeIt.AlgorithamPrograms;


import java.util.Scanner;

import Com.BridgeIt.Utility.AlgorithmUtility;


public class BinaryWord
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of elements in array ");
    int size=sc.nextInt();
    
    /*size assigned to array*/
    
    String array[]=new String[size];
    
    System.out.println("enter "+size+" elements :");
    for(int i=0;i<size;i++)
    {
    	array[i]=sc.next();
    }
    
    AlgorithmUtility.showStringArray(array);
       
    System.out.println("enter Word to search :");
    String word=sc.next();
    
    /*calling binaryWord() method to search that String*/
    
    int f1 = AlgorithmUtility.binaryWord(array , word);
	
	if(f1 > 0)
	{
		System.out.println("Element is found at index "+f1);
	}
	else
	{
		System.out.println("Element not found");
	}
  }

}
