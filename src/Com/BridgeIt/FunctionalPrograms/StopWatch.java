/** created by: Sangharsha Ranpise.
 * Date: 28/02/2019.
 * Purpose: Simulate Stopwatch Program Desc -> Write a Stopwatch Program for measuring the time that elapses between the 
 * start and end clicks
I/P -> Start the Stopwatch and End the Stopwatch
Logic -> Measure the elapsed time between start and end
O/P -> Print the elapsed time.  
*/
package Com.BridgeIt.FunctionalPrograms;

import java.util.Scanner;

import Com.BridgeIt.Utility.FunctionalUtility;


public class StopWatch
{
	/*main method program will start from here*/
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		long start=0;
		long stop=0;
		char choice;
		
		
		System.out.println("Welcome to StopWatch...........");
		System.out.println("do you want to start the stopwatch :[y/n]");
		choice=sc.next().charAt(0);
		FunctionalUtility.startstopwatch(choice);
		
//		switch(choice)
//		{
//		case 'y':
//			System.out.println("stopwatch is started...");
//			
//			/*time is stoped*/
//
//			System.out.println(start=System.currentTimeMillis());
//			break;
//			
//		case 'n':
//			System.out.println("Thank You for Response..........");
//			break;
//			
//		default:
//			System.out.println("Please Enter Valid  Choice...");
//		}
//	
		
	System.out.println("do you want to stop the stopwatch :[y/n]");
	choice=sc.next().charAt(0);
	FunctionalUtility.stopstopwatch(choice);
	
//	switch(choice)
//	{
//	case 'y':
//		System.out.println("stopwatch is stopped...");
//		
//		/*time is stoped*/
//		
//		System.out.println(stop=System.currentTimeMillis());
//		break;
//		
//	case 'n':
//		System.out.println("Thank You for Response..........");
//		break;
//		
//	default:
//		System.out.println("Please Enter Valid  Choice...");
//	}
//	
//	long elapsed=stop-start;
//	long sec=elapsed/60;
//	
//	/*prints elepsed time*/
//	
//	System.out.println("elapsed time in miliseconds :"+elapsed+" ms");
//	System.out.println("elapsed time in  seconds :"+sec+" sec");
}

}
