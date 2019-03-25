/**
 * created by: Sangharsha Ranpise.
 * Date: 28/02/2019.
 * Purpose: Gambler Desc -> Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke 
 * (i.e. has no money) or reach $goal. Keeps track of the number of times he/she wins and the number of
 *  bets he/she makes. Run the experiment N times, averages the results, and prints them out. 
*/
package Com.BridgeIt.FunctionalPrograms;

import java.util.Scanner;


import Com.BridgeIt.Utility.FunctionalUtility;

public class Gambler 
{
	/*main method*/
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("***************WELCOME**************");
		System.out.println("Rule for Gambler :  ");
		System.out.println("1. bets until goes broke or reach goal.");
		System.out.println();
		System.out.println("Lets play Game...");
		System.out.println("enter stack value :");
		int stack=sc.nextInt();
		System.out.println("enter goal value :");
		int goal=sc.nextInt();
		System.out.println("enter no. of times :");
		int times=sc.nextInt();
		
		FunctionalUtility.gambler(times);

		}
	}
       