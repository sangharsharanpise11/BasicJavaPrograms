/*created by: Sangharsha Ranpise.
 * Date: 07/03/2019.
 * Purpose: Desc :Extend the Prime Number Program and store only the numbers in that range that are Anagrams. 
 * For e.g. 17 and 71 are both Prime and Anagrams in the 0 to 1000 range.
 * Further store in a 2D Array the numbers that are Anagram and numbers that are not Anagram
*/
package Com.BridgeIt.DataStructurePrograms;

import java.util.ArrayList;

import java.util.Arrays;

public class PrimeAnagram2D 
{
   static String[][]primeAnagramArray=new String[13][13];
    
   //created  ArrayList object primeList
	static ArrayList<Integer> primeList=new ArrayList<Integer>();
	//created ArrayList object anagramList
    static ArrayList<Integer> anagramList=new ArrayList<Integer>();
    
//this method will check number is prime or not if yes then check for Anagram
 public static void primeAnagram() 
 {
	 boolean flag;
    for(int i=2;i<=1000;i++)
    {
      flag=true;
      for(int j=2;j<i/2;j++)
      {
    	  if(i%j==0)
    	  {
    		  //if flag== false then its not a prime no.
    		  flag=false;
    		  break;
    	  }
      }
      if(flag)
    	  primeList.add(i);
    }
    
    for(int i=0;i<primeList.size();i++)
    {
    	for(int j=i+1;j<primeList.size();j++)
    	{
    		if(anagram(primeList.get(i),primeList.get(j)))//anagram calling 
    		{
    			//System.out.println(primeList.get(i)+" "+primeList.get(j));
    			anagramList.add(primeList.get(i));
    		}
    	}
    }
    //calling to storeElement()
    PrimeAnagram2D.storeElement();
    // calling to display()
    PrimeAnagram2D.display();
}
 
 //this method is used for store elements in primeAnagramArray.
 public static void storeElement()
 { int index=0;
	 for(int i=0;i<13;i++)
	 {
		 for(int j=0;j<13;j++)
		 {
			
			primeAnagramArray[i][j]= primeList.get(index).toString();
			index++;
		 }
	 }
 }
 
 //this method is used for display elements from primeAnagramArray.
 public static void display()
 {
	 for(int i=0;i<primeAnagramArray.length;i++)
	 {
		 for(int j=0;j<primeAnagramArray.length;j++)
		 {
			System.out.print(primeAnagramArray[i][j]+" ");
		 }
		 System.out.println();
	 }
 }
 
 //this method checks number is prime or not.
	public static boolean anagram(int n1, int n2) 
	{
		int[] n1count = counting(n1);
		int[] n2count = counting(n2);
		for (int i = 0; i < n2count.length; i++)
		{
			//if count of two numbers are not equal then 
			if (n1count[i] != n2count[i]) 
			{
				return false;
			}
		}
		return true;
	}
//this method is used for counting the digits of number.
private static int[] counting(int n1)
{
	int[] count = new int[10];
	int temp = n1;
	while (temp != 0) 
	{
		int rem = temp % 10;
		count[rem]++;
		temp = temp / 10;
	}
	return count;
}		
	
//main method of proggram.
public static void main(String[] args)
{
	System.out.println("Prime Anagram Numbers 0-1000 :");
	PrimeAnagram2D.primeAnagram();
}
}