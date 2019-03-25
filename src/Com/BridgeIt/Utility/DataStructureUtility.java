package Com.BridgeIt.Utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Com.BridgeIt.DataStructurePrograms.Deque;

public class DataStructureUtility 
{ 
	static Scanner sc= new Scanner(System.in);
	public static boolean palindrome(String input) 
	{
	
		// palindrome checker using deque	
 	
 		input = input.toLowerCase();
 		Deque <Character> deque = new Deque<>(); 
 		boolean result = false ;
 		for(int i=0;i<input.length();i++)
 		{
 			char c =input.charAt(i);
 			//adding each character to the rear of the deque
 			deque.addRear(c);
 		}
 		int flag=0;
 		
 		//traverse upto size of the deque greater than 1
 		while(deque.size()>1)
 		{
 			char first = (char) ((deque.removeFront())); //remove from front
 			char last =(char) (deque.removeRear());   //remove from rear
 			if( first== last)  //if equal set flag to 0.
 			{
 				flag=0;
 				
 			}
 			else
 			{
 				flag = 1;
 				break;
 			}
 		}
 		
 		
 		if(flag==0)
 		{
 		result = true;  //is palindrome
 		}
 		else
 		{
 			result = false;  //not palindrome
 		}
 		return result;
 	}
/****************************************************************************************************************/
/**
 * this method is used for checking Prime Anagram numbers..
 */

	 public static int[] primeAnagrams(int range) 
	 {
		     int index = 0;
             String[] array1 = new String[168];
             int[] anagram = new int[158];  //to store anagrams
             int count = 0;
            
             for(int i=2;i<range;i++)
             {
                 if(isPrime(i)) //check for prime
                 {
                	 array1[index] = String.valueOf(i); // integer to string conversion
                     index++;
                 }
             }
            
            
            
             for(int i=0;i<index;i++)  //to traverse array
             {
                 for(int j=i+1;j<index;j++)
                 {
                     if(isAnagram(array1[j], array1[i])) //to compare ith element with jth element
                     {
                         //store ith as well as jth positions numbers
                         anagram[count] = Integer.parseInt(array1[i]);  //String to integer
                         count++;
                         anagram[count] = Integer.parseInt(array1[j]);
                         count++;
                     }
                 }
             }
            
             return anagram;
         }
    
	 /**
	  * this method is used for checking anagram numbers
	  * @param str1 :taking input from primeAnagrams method.
	  * @param str2 :taking input from primeAnagrams method.
	  * @return
	  */
         //anagram check
     public static boolean isAnagram(String str1, String str2)
     {
             boolean status=true;
            
             if(str1.length() != str2.length())  //check length of two strings are equal or not
                 status = false;
             else
             {
                 //convert strings to character array to compare their characters
                 char[] str1Array = str1.toCharArray();
                 char[] str2Array = str2.toCharArray();
                
                 //sort both char arrays
                 Arrays.sort(str1Array);
                 Arrays.sort(str2Array);
                
                 status = Arrays.equals(str1Array, str2Array); //compare two arrays
              }
             if(status)
                 return true;
             else
                 return false;
         }

/**
 * pchecking prime numbers or not.
 * @param n: taking input from user.
 * @return
 */
   public static boolean isPrime(int n)
   {
	 for(int i=2;i<=n/2;i++)
	  {
		if(n%i==0)
	    {
	     return false;
	    }
	  }
	 return true;
   }
	
   
   
 //for getting integer as user input
 	public static int inputInteger()
 	{
 		return (Integer.parseInt(sc.next()));
 	}
	
}	
	

	
