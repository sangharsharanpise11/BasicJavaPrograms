/**
 * Created by: Sangharsha Ranpise.
 * Date:09/03/2019.
 * Purpose:Desc -> A palindrome is a string that reads the same forward and backward, for example, radar, toot, and madam.
 *  We would like to construct an algorithm to input a string of characters and check whether it is a palindrome.
 */
package Com.BridgeIt.DataStructurePrograms;

import java.util.Scanner;

import Com.BridgeIt.Utility.DataStructureUtility;

public class PalindromChecker 
{
	//main method for program
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter any String to check its palindrom or not .");
	  String input=sc.next();
	  //passing the parameter to palindrom method
	   if (DataStructureUtility .palindrome(input)) 
	   {
		   //if its true then
		System.out.println("its palindrom...");
	    } else 
	    {
	    	//if its false then
         System.out.println("its not palindrome");
	    }
	 
  }
}
