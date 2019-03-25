/**
 * created by: Sangharsha Ranpise.
 * Date: 28/02/2019.
 * Purpose:Given N distinct Coupon Numbers, how many random numbers do you need to generate distinct coupon number?
 *  This program simulates this random process.
 */
package Com.BridgeIt.FunctionalPrograms;

import java.util.Random;

import java.util.Scanner;



import Com.BridgeIt.Utility.FunctionalUtility;

public class Coupans 
{
	/*program will start from here*/
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of coupons : ");
		int number=sc.nextInt();
		int count;
		
		FunctionalUtility.coupons(number);
	}
}