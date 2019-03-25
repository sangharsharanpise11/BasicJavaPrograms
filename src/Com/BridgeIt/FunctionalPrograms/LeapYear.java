/**
 * created by: Sangharsha Ranpise.
 * Date: 28/02/2019.
 * Purpose: Leap Year I/P -> Year, ensure it is a 4 digit number. 
*/
package Com.BridgeIt.FunctionalPrograms;

import java.util.Scanner;

import Com.BridgeIt.Utility.FunctionalUtility;

public class LeapYear 
{
	/*main method program starts from here*/

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("enter any year to check its Leap Year or not :");
		int year=sc.nextInt();
		FunctionalUtility.leapYear(year);
     }
}