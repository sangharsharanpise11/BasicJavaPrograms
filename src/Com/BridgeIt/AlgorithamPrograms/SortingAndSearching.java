/**
 * created by: Sangharsha Ranpise.
 * Date: 28/02/2019.
 * Purpose:   Create Utility Class having following static methods
 *  binarySearch method for integer
 *  binarySearch method for String
 *  insertionSort method for integer
 *  insertionSort method for String
 *  bubbleSort method for integer
 *  bubbleSort method for String
I/P -> Write main function to call the utility function
Logic -> Check using Stopwatch the Elapsed Time for every method call
O/P -> Output the Search and Sorted List. More importantly print elapsed time performance in descending order
*/

package Com.BridgeIt.AlgorithamPrograms;

import java.util.Scanner;

import Com.BridgeIt.Utility.AlgorithmUtility;



public class SortingAndSearching 
{
	static int i,size;
	int array[];
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your choice :");
	System.out.println("1. binarySearch method for integer");
	System.out.println("2. binarySearch method for String");
	System.out.println("3. insertionSort method for integer");
	System.out.println("4. insertionSort method for String");
	System.out.println("5. bubbleSort method for integer");
	System.out.println("6. bubbleSort method for String");
	
	int choice=sc.nextInt();
    
    switch(choice)
    {
    case 1 :
       System.out.println("1. binarySearch method for integer :"); 
       System.out.println();
       System.out.println("enter size of elements in array :");
       int size=sc.nextInt();
       
       int binaryInt[]=new int[size];
       System.out.println("enter "+size+" elements :");
       for(int i=0;i<size;i++)
       {
    	   binaryInt[i]=sc.nextInt();
       }
//       System.out.println("entered elements are :");
//       for(int i=0;i<size;i++)
//       {
//       	System.out.print(binaryInt[i]+" ");
//       }
//       System.out.println();
//       
       AlgorithmUtility.showIntegerArray(binaryInt);
       
       System.out.println("enter number to search :");
       int num=sc.nextInt();
       
       AlgorithmUtility.binarySearch(binaryInt, 0, binaryInt.length-1, num);
       break;
       
     case 2:
    	 System.out.println("2. binarySearch method for String :"); 
         System.out.println();
         System.out.println("enter size of elements in String Array :");
         int size1=sc.nextInt();
         
         String binString[]=new String[size1];
         
         System.out.println("enter "+size1+" elements :");
         for(int i=0;i<size1;i++)
         {
        	 binString[i]=sc.next();
         }
//         System.out.println("entered elements are :");
//         for(int i=0;i<size1;i++)
//         {
//         	System.out.println(binString[i]+" ");
//         }
//         System.out.println();
         
         AlgorithmUtility.showStringArray(binString);
         
         System.out.println("enter String to search :");
         String search=sc.next();
         
         AlgorithmUtility.binaryString(binString,search);
         break;
         
     case 3:
    	 System.out.println("3. insertionSort method for integer");
    	 System.out.println();
    	 System.out.println("enter the size of Array :");
    	 int size2=sc.nextInt();
    	 
    	 int insertionArray[]=new int[size2];
         System.out.println("enter "+size2+" elements :");
         for(int i=0;i<size2;i++)
         {
        	 insertionArray[i]=sc.nextInt();
         }
//         System.out.println("entered elements are :");
//         for(int i=0;i<size2;i++)
//         {
//         	System.out.print(insertionArray[i]+" ");
//         }
//         System.out.println();
         AlgorithmUtility.showIntegerArray(insertionArray);
         AlgorithmUtility.insertionSort(insertionArray);
         break;
         
     case 4:
    	 System.out.println("4. insertionSort method for String");
    	 System.out.println();
    	 System.out.println("enter the size of String Array :");
    	 int size3=sc.nextInt();
    	 
    	String insertionStringArr[]=new String[size3];
        System.out.println("enter "+size3+" Strings :");
         for(int i=0;i<size3;i++)
         {
        	 insertionStringArr[i]=sc.next();
         }
        
         AlgorithmUtility.insertionString(insertionStringArr);
         break;
         
         
     case 5:
    	 System.out.println("5. bubbleSort method for integer");
    	 System.out.println("Enter size for Array :");
    	 int size4=sc.nextInt();
    		
    	 int bubbleIntArray[]=new int[size4];
    	 System.out.println("enter your elements in array :");
    	   for(int i=0;i<size4;i++)
    	   {
    		   bubbleIntArray[i]=sc.nextInt();
    	   }
    	   System.out.println("Before Bubble Sorting :");
    	   for(int i=0;i<size4;i++)
    	   {
    		   System.out.print(bubbleIntArray[i]+" ");
    	   }
    	   System.out.println();
    	   AlgorithmUtility.bubbleSort(bubbleIntArray);
    	   break;
    	   
     case 6:
    	   System.out.println("6. bubbleSort method for String ............");
      	   System.out.println("Enter size for Array :");
      	   int size5=sc.nextInt();
      		
      	   String bubbleStringArray[]=new String[size5];
      	   System.out.println("enter your elements in array :");
      	   for(int i=0;i<size5;i++)
      	   {
      		 bubbleStringArray[i]=sc.next();
      	   }
      	   System.out.println("Before Bubble Sorting :");
      	   for(int i=0;i<size5;i++)
      	   {
      		   System.out.print(bubbleStringArray[i]+" ");
      	   }
      	   System.out.println();
      	 AlgorithmUtility.bubbleString(bubbleStringArray);
      	   break;   
     default :
         System.out.println("Invalid Input...");
}
}
}