/**
 * *created by: Sangharsha Ranpise.
 *Date: 28/02/2019.
 *Purpose: Util class for Functional Programs. 
 */
package Com.BridgeIt.Utility;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class FunctionalUtility 
{
	static Scanner sc= new Scanner(System.in);

/**
 * method to replace string.	
 * @param string : string which want to replace. 
 */
	
  public static void replaceString(String string)
  {
	  /*converts string to char array for calculate size of string*/
	  char []name=string.toCharArray();
	  
	   /*if size of string is greater than 3 then it will display the hello message otherwise error message*/ 
	  if(name.length>3) 
	    {
		System.out.println("“Hello "+string+", How are you?” \n" + "");
      }
	    else
	    {
	    	System.out.println("Username should be greater than 3 characters :");
      	System.out.println("please try again..........");
      }
  }



  /**
   * this method is used for flip the coin no. of time and get randomly tails and heads.
   * @param number:no. of times it will flip the coin.
   */
  
  public static void filpCoin(int number)
  {
	  int tail=0,head=0;
	  
	  /*number of time loop will execute*/
		for(int i=0;i<number;i++)
		{
			
	    /*math.random method will generate random number*/
			
			if(Math.random()<0.5)
			{
				tail++;
			}
			else
			{
				head++;
			}
		}
		
		/*calculates tail percentage*/
		
			float tailper=(float)head/number*100;
			
		/*calculates head percentage*/
			
			float headper=(float)tail/number*100;
			
			System.out.println("tail:"+tail);
			System.out.println("head:"+head);
			System.out.println("Percentage of head:"+headper);
			System.out.println("Percentage of tail:"+tailper);
		}




/**
 * this method is used for write data into file.using PrintWriter.
 * @param row:taking no.of rows from user.
 * @param column:taking no.of columns from user.
 * @param array:taking array of integer from user.
 * @throws FileNotFoundException:
 */

  public static void printWriter(int row, int column, int[][] array) throws FileNotFoundException 
  {
	  PrintWriter writer = null;
	  writer = new PrintWriter("/home/admin1/sangharsha/new.txt");
		
		/*this for loop write all elements in array*/
		
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < column; j++)
			{
		/*using write method of PrintWriter we write the data in new.txt*/
				writer.write(" "+array[i][j]+" ");
			}
			writer.write("\n");
		}
		
		/*this method flushes the stream*/
		
		writer.flush();
		
		/*this method close the stream*/
		writer.close();
	}



/**
 * this method will geneterate random coupon numbers.
 * @param number:generate no. of times coupons.
 */
 
  public static void coupons(int number) 
{
	char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
	char[]coupons=new char[number];
	char[]dis=new char[number];
	
	/*this Random() will generate random no. of coupons*/
	
	Random r=new Random(number);
	
	for(int i=0;i<number;i++)
	{
		 coupons[i] = chars[r.nextInt(coupons.length)];

		 System.out.println(coupons[i]+" ");
	}
  System.out.println("Distinct coupon numbers are :");
 
  /*it will show only Distinct coupon numbers*/
  
  for(int i=0;i<coupons.length;i++)
  {
	  int count = 0;
	  
	  /*it will check distinct coupons*/
	for(int j=i+1;j<coupons.length;j++)
	{
	  /*if coupons  are same then count will 1*/
		if(coupons[i]==coupons[j])
		{
			count=1;
		}
	}
	/*if count=0 then they are not repeated coupon numbers*/
	if(count==0) 
	{
		System.out.println("coupon is= "+coupons[i]+" position is :"+i);
	}
  }
	
}


  /**this method will calculate distance of X and Y.
   * 
   * @param x:taking input from user.
   * @param y:taking input from user.
   */
  
public static void distance(int x, int y) 
{
/*this method will calculate Euclidean distance from the point (x, y)*/
		double z=(double)Math.pow(x, 2);
		double z1=(double)Math.pow(y, 2);
		
/*this will calculate distance */
		
		double dist= (double)Math.sqrt(z+z1);
		
		System.out.println("Euclidean distance from the point (x, y): "+dist);
}

/**
 * this method will generate randome numbers using random().
 * @param times:no.of times random() execute.
 */
public static void gambler(int times) 
{
	int win = 0;
	int loss=0;

	for(int i=0;i<times;i++)
	{
		
/*math.randome() will generate randome numbers*/
		
		if(Math.random()>0.5) 
		{
			win++;//count win
		}
		else
		{
			loss++;//count loss
		}
	}
	
	/*calculates percentage of win*/
	
	float winper=(float)win/times*100;
	
	/*calculates percentage of loss*/
	
	float lossper=(float)loss/times*100;
	
		System.out.println("no of wins :"+win);
		System.out.println("no of lose :"+loss);
		System.out.println("percentage of win :"+winper);
		System.out.println("percentage of loss :"+lossper);
	}


/**
 * this method calculate harmonic value.	
 * @param number:taking input from user.
 */
public static void harmonic(int number)
{
	if(number>0)
	{
		float harmonic = 1; 
	    for (int i = 2; i <= number; i++) 
	    { 
	    	/*calculates harmonic value*/
	    	
	        harmonic += (float)1 / i; 
	    } 
	    
	    /*prints harminic value */
	    
     System.out.println(harmonic); 
    }
	
}

/**
 * this method will check leap year or not.
 * @param year:taking input from user.
 */

public static void leapYear(int year)
{
	int sum=0;
	int y=year;
	
/*it will check digits of year*/
	
	while(year!=0)
	{
		sum=sum+1;
		year=year/10;
	}
	
/*it will count digit*/
	
	if(sum==4)
	{
		
/*it will check leap year or not*/
		
	if((y%4==0)&&(y%100 !=0)||(y%400==0))
	
	System.out.println(y+" this is leap year ");
	
	else
	
	System.out.println(y+" this is not  leap year ");
	}
	else
	{
		System.out.println("enter valid year....");
	}
}


/**
 * this method used for permutation string.
 * @param StringArray is array name which is passed by user.
 * @param currentIndex:current index of array.
 */

public static void permutations(char[] StringArray, int currentIndex)
{
	if (currentIndex == StringArray.length - 1)
	{
		
/*String.valueOf() converts character to String */
		
		System.out.println(String.valueOf(StringArray));
	}

	for (int i = currentIndex; i < StringArray.length; i++)
	{
		/*call to swap()*/
		swap(StringArray, currentIndex, i);
		
		/*call to permutations()*/
		permutations(StringArray, currentIndex + 1);
		
		/*call to swap()*/
		swap(StringArray, currentIndex, i);
	}
}

/**
 * this method is used for swapping variables.
 * @param ch:this is array which is passed by user.
 * @param i:i th index of array.
 * @param j:j th index of array.
 */

public static void swap(char[] ch, int i, int j)
{
	/*swap variables using temp variable*/
	char temp = ch[i];
	ch[i] = ch[j];
	ch[j] = temp;
}


/**
 * this method calculates powerof 2.
 * @param number:no.of times while loop will execute.
 */

public static void powerOf2(int number) 
{
	int power=1;
	 int i=0;
	 
	 /* i will increase */
	 
	 while(i<=number)
	 {
		 System.out.println("2 ^"+i+" = "+power);
	     power=power*2;
	     i++;
	 }
	
}


/**
 * this method used for start the stopwatch.
 * @param choice:taking input from user.
 */

public static void startstopwatch(char choice) 
{
	long start=0;
	long stop=0;
	
	switch(choice)
	{
	case 'y':
		System.out.println("stopwatch is started...");
		
		/*time is stoped*/

		System.out.println(start=System.currentTimeMillis());
		break;
		
	case 'n':
		System.out.println("Thank You for Response..........");
		break;
		
	default:
		System.out.println("Please Enter Valid  Choice...");
	}
	
}


/**
 * this method is used for stop the stopwatch.
 * @param choice:taking input from user.
 */

public static void stopstopwatch(char choice) 
{
	long start=0;
	long stop=0;
	switch(choice)
	{
	case 'y':
		System.out.println("stopwatch is stopped...");
		
		/*time is stoped*/
		
		System.out.println(stop=System.currentTimeMillis());
		break;
		
	case 'n':
		System.out.println("Thank You for Response..........");
		break;
		
	default:
		System.out.println("Please Enter Valid  Choice...");
	}
	
	long elapsed=stop-start;
	long sec=elapsed/60;
	
	/*prints elepsed time*/
	
	System.out.println("elapsed time in miliseconds :"+elapsed+" ms");
	System.out.println("elapsed time in  seconds :"+sec+" sec");
	
}


/**
 * this method will calculate sum of three integers.
 * @param array:taking input from user.
 */

public static void sumOfThreeInteger(int array[])
{
	  /*it will point to 0th element initialy*/
	  
	for(int i=0;i<array.length;i++)
	{
		  /*it will point to 1th element initialy*/
		
		for(int j=i+1;j<array.length;j++)
		{
			  /*it will point to 2th element initialy*/
			
			for(int k=j+1;k<array.length;k++)
			{
				if((array[i]+array[j]+array[k])==0)
				{
					System.out.println("This Three no's sum = "+array[i]+"+"+array[j]+"+"+array[k]+" = 0");
				}
			}
		}
	}
}



/**
 * this method calculates windchill.
 * @param temparature:taking input from user.
 * @param windspeed:taking input from user.
 */

public static void windChill(double temparature, double windspeed) 
{
/*this will calculate  WindChill*/
	
	double windchill=35.74 + 0.6215*temparature + (0.4275*temparature - 35.75) * Math.pow(windspeed, 0.13);
	
	System.out.println("Temparature is :"+temparature);
	System.out.println("wind speed is :"+windspeed);
	System.out.println("wind chill is :"+windchill);
}


/**
 * this method is used for printBoard.
 * @param board:taking input from user.
 */

public static void printBoard(char[][] board) 
{
	/*it will display board in 2d array*/
	for(int i=0;i<board.length;i++) 
	{
		System.out.print("| ");
		for(int j=0;j<board.length;j++)
		{
			System.out.print(board[i][j]+" | ");
		}
		System.out.println("\n");
	}
	System.out.println();
}


/**
 * this method is used for getting input from user.
 * @return it returns number.
 */

public static int getInt() 
{
	/*taking input from user*/
	System.out.println("Enter a number: ");
	int number=sc.nextInt();
	return number;
}

}








	





			


















