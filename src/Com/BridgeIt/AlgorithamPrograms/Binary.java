/**
 * created by: Sangharsha Ranpise.
 * Date: 28/02/2019.
 * Purpose: /*Write Binary.java to read an integer as an Input, convert to Binary using toBinary function and perform the following functions.
i. Swap nibbles and find the new number.
ii. Find the resultant number is the number is a power of 2.
A nibble is a four-bit aggregation, or half an octet. There are two nibbles in a byte.
Given a byte, swap the two nibbles in it. For example 100 is to be represented as 01100100 in a byte (or 8 bits). The two nibbles are (0110) and (0100). If we swap the two nibbles, we get 01000110 which is 70 in decimal.
*/

package Com.BridgeIt.AlgorithamPrograms;

import java.util.Arrays;

import java.util.Scanner;

import Com.BridgeIt.Utility.AlgorithmUtility;


class Binary
{
	/**
	 * main function/method to test Binary class
	 *
	 * @param int array to swap nibbles in array
	 * @return return swapped array
	 */
		public static void main(String[] args)
		{
		        Scanner s = new Scanner(System.in);
				System.out.println("enter any no : ");
	
	             /*call toBinary() for binary of enetered number */
				
				int[] binary = AlgorithmUtility.toBinary(s.nextInt());
				System.out.println("binary is :");
				
	            /*call to showArr() for showing binary */	
				
				AlgorithmUtility.showIntegerArray(binary);
				
	            /*call to swapNibbles() for swapping the nibbles */
				
				AlgorithmUtility.swapNibbles(binary);
				
				System.out.println("after swapping ");
				AlgorithmUtility.showIntegerArray(binary);
	      
				/*call to toDecimal() for decimal number and result stored in swapDec variable*/
				
				int swapDec = AlgorithmUtility.toDecimal(binary);
				System.out.println("decimal of swapped binary is :" + swapDec);
				}
		}

	

	
