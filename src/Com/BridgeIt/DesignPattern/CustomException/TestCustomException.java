/**
 * Created By:Sangharsha Ranpise.
 * Date :29/03/2019.
 * Purpose :CustomException.
 */
package Com.BridgeIt.DesignPattern.CustomException;

import java.util.Scanner;

class TestCustomException
{  
	  static Scanner scanner=new Scanner(System.in);
	   static void validate(int age)throws InvalidAgeException
	   {  
	     if(age<18)  
	      throw new InvalidAgeException("not valid age you are bellow 18");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	     
	   public static void main(String args[])
	   {  
	      try
	      {  
	    	  System.out.println("enter Your  age :");
	    	  int age=scanner.nextInt();
	        validate(age);  
	      }catch(Exception m)
	      {
	    	  System.out.println("Exception occured: "+m);
	      }  
	      finally
	      {
	        System.out.println("rest of the code...");
	      }
	  }  
	}  