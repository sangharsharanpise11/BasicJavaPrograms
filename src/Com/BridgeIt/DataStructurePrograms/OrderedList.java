/**
 * Created By :Sangharsha Ranpise.
 * Date :14/03/2019.
 * Purpose : Read .a List of Numbers from a file and arrange it ascending Order in a Linked List. 
 * Take user input for a number, if found then pop the number out of the list else insert the number
 *  in appropriate position
 *  */
package Com.BridgeIt.DataStructurePrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class OrderedList 
{
	//main method of program
	public static void main(String[] args) throws IOException 
	{
	    LinkedList<Integer> list = new LinkedList<>();	
		Scanner sc=new Scanner(System.in);
		File file=new File("/home/admin1/Ordered");
		//read the file using BufferedReader and stores in String str
		BufferedReader br=new BufferedReader(new FileReader(file));
		String str;
		String [] IntegerArray;
		if((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		
		//split the string and store in NumberString Array.
		String [] NumberString = str.split(" ");
	   
		int[] integers = new int[NumberString.length]; 
	        // Creates the integer array.
	    for (int i = 0; i < integers.length; i++)
	    {
	        integers[i] = Integer.parseInt(NumberString[i]); 
	        //Parses the integer for each string.
	    }
	    for(int i=0;i<integers.length;i++)
	    {
	    	for(int j=i+1;j<integers.length;j++)
	    	{
	    		if(integers[i]>integers[j])
	    		{
	    			//if i is greater than j then swap the numbers
	    		  int temp=integers[i];
	    		  integers[i]=integers[j];
	    		  integers[j]=temp;
	    		}
	    	}
	    }
	   
	    for(int i = 0; i < integers.length;i++)
	     {
	    	 list.add(integers[i]);  //add element to list    
	     }
	     list.display();
	     System.out.println();
	     System.out.println("Enter which Number you want to search:");
	     int search=sc.nextInt();
	     if(list.search(search))
	     {
	    	 //if number is found
	    	 System.out.println("number is found..");
	    	 list.remove(search);
	    	 System.out.println("Number is deleted.....");
	    	 list.display();
	     }
	     else
	     {
	    	 //if number is not found
	    	 System.out.println("number is not foud..");
	    	 list.add(search);
	    	 System.out.println("number is added in file.....");
	    	 list.display();
	     }
      }
	
	}

