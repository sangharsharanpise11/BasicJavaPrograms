/**
 * created by: Sangharsha Ranpise.

 * Date: 28/02/2019.
 * Purpose:To the Util Class add temperaturConversion static function, given the temperature in fahrenheit as 
 * input outputs the temperature in Celsius or viceversa using the formula
Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F
Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C
  
*/
package Com.BridgeIt.AlgorithamPrograms;

import java.util.Scanner;

import Com.BridgeIt.Utility.AlgorithmUtility;

public class Temperature {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter temperature in Celsius or Fahrenheit :");
	int temp=sc.nextInt();
	char c=sc.next().charAt(0);
	
	AlgorithmUtility.temperaturConversion(temp,c);


}


}