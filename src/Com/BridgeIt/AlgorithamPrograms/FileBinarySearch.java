/**
 * created by: Sangharsha Ranpise.'
 * Date: 28/02/2019.
 * Purpose: Binary Search the Word from Word List: Read in a list of words from File. Then prompt the user to enter a word to search the list. 
 * The program reports if the search word is found in the list.

*/
package Com.BridgeIt.AlgorithamPrograms;


import java.io.BufferedReader;import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import Com.BridgeIt.Utility.AlgorithmUtility;



public class FileBinarySearch
{

	public static void main(String[] args) throws IOException 
	{
		Scanner sc=new Scanner(System.in);
		String arr[]=new String[10];
		
	    File f=new File("/home/admin1/Documents/FileProgram/words.txt");
	    
	    /*file reading using BufferedReader*/
	    
	    BufferedReader br=new BufferedReader(new FileReader(f)); 
	    String st;
	    
	    /*ArrayList is created for storing file data*/
	    
	    ArrayList<String>al=new ArrayList<String>();
	    while((st=br.readLine())!=null)
	    {
	    	/*add file data into ArrayList*/
	    	
	        al.add(st);
	    }
	    
	    /*sort() sort the elements of collection*/
	    
	    Collections.sort(al);
	    
	    /*print ArrayList*/
	    
	    System.out.println(al);
	    
	    /*string array created and store ArrayList elements*/
	    
		String array[] = new String[al.size()];              
		for(int j =0;j<al.size();j++)
		{
		  array[j] = al.get(j);
		}

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the element to be search: ");
		String str = sc1.next();
		
		/*calling binaryWord() with array and str arguments*/
		
		int f1 = AlgorithmUtility.binaryWord(array , str);
		
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
