/** created by: Sangharsha Ranpise.
 * Date: 28/02/2019.
 * Purpose: Computes the prime factorization of N using brute force.
I/P -> Number to find the prime factors
Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
O/P -> Print the prime factors of number N.  
*/
package Com.BridgeIt.FunctionalPrograms;

import java.util.Scanner;

public class PrimeFactorization 
{
	/*program will start from here*/
	
	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter any no to check its Prime Factor :");
			int number=sc.nextInt();
			System.out.println("its prime factor are :");
			int prime = 0;
			
	/*it checks prime factor*/
	
			for(int i=2;i<number;i++)
			{
				if(number%i==0)
				{
					for(int j=2;j<i;j++)
					{
						if(i%j==0)
						{
							prime=1;
							break;
						}
					}
					
	/*print only prime factor*/
		
					if(prime==0)
					System.out.print(i+" ");
				    else
					System.out.println("its not prime.");
			}
		}
	}
}
