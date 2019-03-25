/**
 * created by: Sangharsha Ranpise.
 * Date: 28/02/2019.
 * Purpose:Write a Util Static Function to calculate monthlyPayment that reads
 *  in three command-line arguments P, Y, and R and calculates the monthly payments you would have to make
 *   over Y years to pay off a P principal loan amount at R per cent interest compounded monthly.   
*/
package Com.BridgeIt.AlgorithamPrograms;

import java.util.Scanner;

import Com.BridgeIt.Utility.AlgorithmUtility;


public class MonthlyPayment
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	
	/*asking for three values like payment,year,interest*/
	
	System.out.println("enter three arguement :");
    System.out.println("enter Payment:");
    double payment=sc.nextInt();
    System.out.println("enter time period in year:");
    double year=sc.nextInt();
    System.out.println("enter Intrest :");
    double interest=sc.nextFloat();
   
    /*calling to monthlyPayment() with argument*/
    
    System.out.println("monthly payment is :"+ AlgorithmUtility.monthlyPayment(payment,year,interest));
}
}
