/**
* created by :Sangharsha Ranpise.
 * Date :13/03/2019.
 * Purpose :Desc -> Read the Text from a file, split it into words and arrange it as Linked List. Take a user input
 *  to search a Word in the List. If the Word is not found then add it to the list, and if it found then remove
 *   the word from the List. In the end save the list into a file

 */
package Com.BridgeIt.DataStructurePrograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class UnOrderedList 
{
	public static void main(String[] args) throws IOException 
	{
		/*creating object of Linked List*/
		
	    LinkedList<String> list = new LinkedList<>();	
		Scanner sc=new Scanner(System.in);
		
		File file=new File("/home/admin1/UnOrdered.txt");
		
		//file is read using BufferedReader.
		
		BufferedReader br=new BufferedReader(new FileReader(file));
		String str;
		//String [] IntegerArray;
		if((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		
		//split the string and added in WordString array.
		String [] WordString = str.split(" ");
	   
		//list display.
	    for(int i = 0; i < WordString.length;i++)
	     {
	    	 list.add(WordString[i]);  //add element to list    
	     }
	     list.display();
	    
	     System.out.println();
	     
	     //taking String from user to search.
	     System.out.println("Enter String which you want to search:");
	     String search=sc.next();
	     if(list.search(search))
	     {
	    	 //if string is found.
	    	 System.out.println("String is found..");
	    	 list.remove(search);
	    	 System.out.println("String is deleted.....");
	    	 list.display();
	     }
	     else
	     {
	    	 //if string is not found.
	    	 System.out.println("String is not foud..");
	    	 list.add(search);
	    	 System.out.println("String is added in file.....");
	    	 list.display();
	     }        
      }
	
}
	
