/**
 * created by: Sangharsha Ranpise.
 * Date: 28/02/2019.
 * Purpose:  To the Util Class add dayOfWeek static function that takes a date as input and prints the day of the 
 * week that date falls on. Your program should take three command-line arguments: m (month), d (day), and y (year).
 *  For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, 
 *  and so forth. Use the following formulas, for the Gregorian calendar (where / denotes integer division):
*/
package Com.BridgeIt.AlgorithamPrograms;

import java.util.Scanner;

import Com.BridgeIt.Utility.AlgorithmUtility;

public class dayofweek
{
public static void main(String[] args)
{
	int date, month, year;
	
	/*taking inputs from user :
	 * date,month,year */
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter date :");
	date = sc.nextInt();
	System.out.println("enter month :");
	month = sc.nextInt();
	System.out.println("enter year :");
	year = sc.nextInt();
	
	/*calling to dayOfWeek()and pass d,m,y */
	
	System.out.println("day of week is :"+AlgorithmUtility.dayOfWeek(date, month, year));
  
}
}
