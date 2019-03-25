/**
 * created by: Sangharsha Ranpise.
 * Date: 28/02/2019.
 * 
 * Purpose:  Write a static function toBinary that outputs the binary (base 2) representation of the decimal number typed as 
 * the input. It is based on decomposing the number into a sum of powers of 2. For example,the binary representation of 106 is 11010102,
 * which is the same as saying that 106 = 64 + 32 + 8 + 2. Ensure necessary padding to represent 4 Byte String.
 To compute the binary representation of n, we consider the powers of 2 less than or equal to n in decreasing order
 to determine which belong in the binary decomposition (and therefore correspond to a 1 bit in the binary representation).
 
*/
package Com.BridgeIt.AlgorithamPrograms;

import java.util.Scanner;

import Com.BridgeIt.Utility.AlgorithmUtility;

public class ToBinary
{
	/*program will start from here*/
	
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
 	System.out.println("enter any no. to convert in binary :");
 	int number=sc.nextInt();
 	
 	/*calling toBinary() to convert decimal to binary */
 	
 	AlgorithmUtility.toBinary(number);
 	
}
}
