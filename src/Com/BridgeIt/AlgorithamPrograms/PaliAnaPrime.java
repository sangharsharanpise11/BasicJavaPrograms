/**
 * created by: Sangharsha Ranpise..
 * Date: 28/02/2019.
 * Purpose: Extend the above program to find the prime numbers that are Anagram and Palindrome. 
 */
package Com.BridgeIt.AlgorithamPrograms;

import java.util.Arrays;

import java.util.Scanner;



import Com.BridgeIt.Utility.AlgorithmUtility;

public class PaliAnaPrime 
{
	
	public static void main(String[] args) 
	{
	    int [] prime=new int[1000];
		Scanner sc=new Scanner(System.in);
		AlgorithmUtility.prime();
        System.out.println("**********************************");
        AlgorithmUtility.palindrome();
	
		System.out.println("**********************************");
		System.out.println("Anagram Numbers :");
		 for( int i=0;i<prime.length;i++)
		   {
		     String s1 = Integer.toString(i); 
		     
		      for(int j=i+1;j<prime.length;j++)
			   {
		          String s2 = Integer.toString(j); 
				  
				    int s1l=s1.length();
					int s2l=s2.length();
					if(s1l!=s2l)
					{
						continue;
					}
					else
					{

					char st1[]=s1.toCharArray();
					char st2[]=s2.toCharArray();
					
					Arrays.parallelSort(st1);
					Arrays.parallelSort(st2);
						
				    if(Arrays.equals(st1, st2)==true)
						{
							System.out.println("Both Numberes Are Anagram..."+i+" "+j);
						}
		           }
		       }
		  
		    }
}
}