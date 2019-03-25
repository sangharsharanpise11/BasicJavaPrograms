/**
 * created by: Sangharsha Ranpise.
 * Date: 28/02/2019.
 * Purpose: Harmonic Number Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N   
*/
package Com.BridgeIt.FunctionalPrograms;


import java.util.Scanner;

import Com.BridgeIt.Utility.FunctionalUtility;

public class Harmonic
{
	/*program will start from here*/
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number :");
		int number=sc.nextInt();
		
		FunctionalUtility.harmonic(number);
    }
}