
/** created by: Sangharsha Ranpise.
 * Date: 28/02/2019.
 * Purpose:  This program takes a command-line argument N and prints a table of the powers of 2 that are less 
 * than or equal to 2^N.
 * I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
   Logic -> repeat until i equals N.
   O/P -> Print the year is a Leap Year or not.
*/
package Com.BridgeIt.FunctionalPrograms;

import java.util.Scanner;

import Com.BridgeIt.Utility.FunctionalUtility;

public class Powerof2
{
  /*program starts from here*/
	
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter your number :");
	 int number=sc.nextInt();
	 FunctionalUtility.powerOf2(number);
	}
}
