/** created by: Sangharsha Ranpise.
 * Date: 28/02/2019.
 * Purpose: Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c. Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found using a formula 
delta = b*b - 4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a)
Root 2 of x = (-b - sqrt(delta))/(2*a)
Take a, b and c as input values to find the roots of x. 
*/
package Com.BridgeIt.FunctionalPrograms;

import java.util.Scanner;

public class Quadratic
{

	/*program will start from here*/

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
	/*accept three values from user*/
	
		System.out.println("Enter Three Values to Calculate Root Of Equation: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		double root1=0;
		double root2=0;
		 
  /*finding delta using this formula*/
	
		double delta=b*b - 4*a*c;
		
		if(delta>0)
		{
			System.out.println("root1 of x ="+ (-b + sqrt(delta))/(2*a));
			System.out.println("root2 of x ="+ (-b - sqrt(delta))/(2*a));
		}
		else
		{
			System.out.println("enter valid no....");
		}
   }
    public static int sqrt(Object delta)
	{
		return 0;
	}
}
