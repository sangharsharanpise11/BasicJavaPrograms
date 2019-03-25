/**
 *  created by: Sangharsha Ranpise.
 * Date: 28/02/2019.
 * Purpose: Write static functions to return all permutation of a String using iterative method and Recursion method.
 Check if the arrays returned by two string functions are equal.  
*/

package Com.BridgeIt.FunctionalPrograms;

import java.util.Scanner;

import Com.BridgeIt.Utility.FunctionalUtility;

public class Permutation 
{
  public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any String for permutation : ");
	    String s=sc.next();
		System.out.println("all permutations are :");
		FunctionalUtility.permutations(s.toCharArray(), 0);
	}
}

