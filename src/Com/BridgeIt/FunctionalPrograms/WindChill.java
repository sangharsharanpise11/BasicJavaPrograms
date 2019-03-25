/** created by: Sangharsha Ranpise.
 * Date: 28/02/2019.
 * Purpose: Write a program WindChill.java that takes two double command-line arguments t and v and prints the wind chill. Use Math.pow(a, b) to compute ab. 
Given the temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the National Weather Service defines the effective temperature (the wind chill) to be:
*/ 


package Com.BridgeIt.FunctionalPrograms;
import java.util.Scanner;

import Com.BridgeIt.Utility.FunctionalUtility;

public class WindChill
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	double t=Double.parseDouble(args[0]);
	double v=Double.parseDouble(args[1]);
	
	FunctionalUtility.windChill(t,v);
	
    }
}
