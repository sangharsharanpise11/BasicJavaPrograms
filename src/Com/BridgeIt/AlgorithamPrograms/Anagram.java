/**
 * created by: Sangharsha Ranpise.
 * Date: 28/02/2019.
 * Purpose: Desc -> One string is an anagram of another if the second is simply a rearrangement of the first. For example, 'heart' and 'earth' are anagrams...
I/P -> Take 2 Strings as Input such abcd and dcba and Check for Anagrams
O/P -> The Two Strings are Anagram or not....

 */
package Com.BridgeIt.AlgorithamPrograms;

import java.util.Arrays;

import java.util.Scanner;

import Com.BridgeIt.Utility.AlgorithmUtility;



public class Anagram 
{
	/*program start freom here*/

public static void main(String[] args)
{
	/*accepting strings from user*/
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first String :");
	String string1=sc.next();
	System.out.println("enter second string :");
	String string2=sc.next();
	System.out.println();
	 
	AlgorithmUtility.angramString(string1,string2);
}
}
