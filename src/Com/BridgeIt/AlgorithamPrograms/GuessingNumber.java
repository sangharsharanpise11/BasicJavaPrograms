/**
 * created by: Sangharsha Ranpise.
 * Date: 28/02/2019.
 * Purpose: takes a command-line argument N, asks you to think of a number between 0 and N-1, where N = 2^n,
 *  and always guesses the answer with n questions.
 
*/
package Com.BridgeIt.AlgorithamPrograms;

import java.util.Scanner;

public class GuessingNumber
{
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
    {
		
	 int i=0;
	 System.out.println("welcome to Guessing Game .........");
	 System.out.println("enter your number limit :");
	 int limit=sc.nextInt();
	 System.out.println("pick any no... ");
	 
	 System.out.println("your mid value is :"+limit/2);
	 System.out.println("enter N if num is smaller than mid :");
	 System.out.println("enter Y if num is greater than mid :");
	 
	 int array[]=new int[limit];
	 for(i=0;i<limit;i++)
	 {
		 array[i]=i;
	 }
	
	/*calling guess() with array*/
	 
	 System.out.println(GuessingNumber.guess(array));
    }
	
	/*this guess() method will check the number */
	
	private static int guess(int [] array)
	{
		int low=0;int high=array.length;
		int mid=(low+high)/2;
		while(low<high)
		{
		 System.out.println("is your value :"+mid);
		  char ch=sc.next().charAt(0);
		  
	 /*it will check your value*/
		  if(ch=='y')
		  {
			  low=mid+1;
		  }
		  else
		  {
			  high=mid-1;
		  }
		  mid=(low+high)/2;
		}
		return low;
	}
}
