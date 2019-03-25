/*created by: Sangharsha Ranpise.
* Date: 28/02/2019.
 * Purpose:  Find the Fewest Notes to be returned for Vending Machine
     Desc -> There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be returned by Vending Machine. Write a Program to calculate the minimum number of Notes as well as the Notes to be returned by the Vending Machine as a Change
     I/P -> read the Change in Rs to be returned by the Vending Machine
     Logic -> Use Recursion and check for largest value of the Note to return change to get to minimum number of Notes. 
*/

package Com.BridgeIt.AlgorithamPrograms;

import java.util.Scanner;
public class VendingMachine
{
	 static int notes[] = {1000,500,100,50,10,5,2,1}; 
public static void main(String[] args)
{

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Amount: ");
		int amount = sc.nextInt();
		int totalNotes[] = VendingMachine.countNotes(amount);
		int noOfNotes = 0;
		for (int i=0; i <totalNotes.length; i++) 
		{ 
			if (totalNotes[i] > 0) 
			{
				System.out.println(totalNotes[i]+" notes of "+notes[i]); 
				noOfNotes = noOfNotes + totalNotes[i];
			}
		}
		System.out.println("\n Total Number of Notes: "+noOfNotes);
	}
	
	/**
	 * method to count Fewest Notes to be returned for Vending Machine.
	 * @param amount : amount entered by user.
	 * @return : array of countNotes which includes count of all notes.
	 */
	public static int[] countNotes(int amount)
	{
		
		int countNotes[] = new int[9]; 
		for (int i=0; i<notes.length; i++)
		{ 
			if (amount >= notes[i]) 
			{ 
				countNotes[i] = amount/notes[i]; 
				amount = amount%notes[i];
				countNotes(amount);
			}
		}
		return countNotes;
	}
}

