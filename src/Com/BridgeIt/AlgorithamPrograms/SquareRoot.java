/**
 * created by: Sangharsha Ranpise.
* Date: 28/02/2019.
 * Purpose: Write a static function sqrt  to compute the square root of a nonnegative number c given in the
 *  input using Newton's method:
- initialize t = c
- replace t with the average of c/t and t
- repeat until desired accuracy reached using condition Math.abs(t - c/t) > epsilon*t where epsilon = 1e-15;
 
*/
package Com.BridgeIt.AlgorithamPrograms;

import java.util.Scanner;

import Com.BridgeIt.Utility.AlgorithmUtility;

public class SquareRoot {
public static void main(String[] args) 
{

		Scanner s = new Scanner(System.in);
		System.out.println("enter no to find square root");
		int number = s.nextInt();
		System.out.println("square root is " + AlgorithmUtility.sqrt(number));
}
}