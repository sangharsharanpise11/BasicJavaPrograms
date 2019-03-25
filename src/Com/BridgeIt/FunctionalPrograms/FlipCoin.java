/**
 *created by: Sangharsha Ranpise.
 * Date: 28/02/2019.
 * Purpose:Flip Coin and print percentage of Heads and Tails
I/P -> The number of times to Flip Coin. Ensure it is positive integer.
Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
O/P -> Percentage of Head vs Tails
*/  

package Com.BridgeIt.FunctionalPrograms;


import java.util.Scanner;

import Com.BridgeIt.Utility.FunctionalUtility;

public class FlipCoin 
{

/*program will start from here */
	
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the numbers of time to flips the coin :");
	int number=sc.nextInt();
	
	FunctionalUtility.filpCoin(number);
}
}
