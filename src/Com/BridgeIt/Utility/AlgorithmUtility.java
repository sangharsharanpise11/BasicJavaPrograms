/*

 * created by: Sangharsha Ranpise. 
 * Date: 28/02/2019.
 * Purpose:   Utilty class for Algorithm Programs.
 */
package Com.BridgeIt.Utility;
import java.util.Arrays;

public class AlgorithmUtility 
{
	public static String l;
	public static String r;
	
/**
 * 	this method will search number using binarysearch.
 * @param binaryIntArray:taking input from user.
 * @param start:start index of array.
 * @param end:last index of array. 
 * @param number:which number want to search.
 */

	
   public static void binarySearch(int[] binaryIntArray , int start, int end, int number) 
   {
		long start1=0;
	    long end1=0;
		
	    /*currentTimeMillis ()used for start stopwatch */
	    
	    start1=System.currentTimeMillis();
		
	    while(start<=end) 
		{
	    	/*here we calculate mid of array*/
	    	
			int mid = (start+end)/2;
			if(binaryIntArray[mid]==number) 
			{
				System.out.println("Number found.");
				break;
			}
			
			/*if mid of array is smaller than search number then mid+1*/
			
			else if(binaryIntArray[mid]<number) 
			{
				start = mid + 1;
			}
			
			/*if mid of array is greater than search number then mid-1*/
			
			else if(binaryIntArray[mid]>number) 
			{
				end = mid -1;
			}
			else
			{	
				System.out.println("Number not Found!!!");
			}
		}
	
	    /*currentTimeMillis ()used for stop stopwatch */
	    
		System.out.println(end1=System.currentTimeMillis());
		long elapsed=end1-start1;
		System.out.println("elapsed time by binarySearch is in miliseconds :"+elapsed+"ms");
		System.out.println("elapsed time by binarySearch is in seconds :"+elapsed/60);
		
	}
   

/**
 * this method is used for search String using binary search.
 * @param binString:taking input from user.
 * @param search:searching string.
 */
	
   public static void binaryString(String[] binString,String search)
	{
		long start1=0;
	    long end1=0;
		
	  /*currentTimeMillis ()used for start stopwatch */
	    
      start1=System.currentTimeMillis();
		
	    int lower=0,higher=binString.length-1;
		while(lower<=higher)
		{
			/*mid is calculated by (lower+higher)/2*/
			
			int mid=(lower+higher)/2;
			
			/*string is campared and result is stored in res variable*/
			
			int res=search.compareTo(binString[mid]);
			
			/*if two strings are same then it will return 0*/
			
			if(res==0)
			{
				System.out.println("String is found.");
				break;
			}
			/*if first string is greater than second then it  will return 1*/
			else if(res>0)
			{
				lower=mid+1;
			}
			/*if first string is smaller than second then it  will return -1*/
			else if(res<0)
			{
				higher=mid-1;
			}
			else
			{
				System.out.println("String not found...");
			}
		}
		
	   /*currentTimeMillis ()used for start stopwatch */
		
		System.out.println(end1=System.currentTimeMillis());
		long elapsed=end1-start1;
		System.out.println("elapsed time by binaryString is in miliseconds :"+elapsed+"ms");
		System.out.println("elapsed time by binaryString is in seconds :"+elapsed/60);
		
	}
		
/**
 * this method used for insertion sort of integer.	
 * @param insertionArray:taking input array from user.
 */
	
   public static void insertionSort(int[] insertionArray) 
	{
		long start1=0;
	    long end1=0;
		
	    /*stopwatch is started*/
	    
	    start1=System.currentTimeMillis();
		
		System.out.println("unsorted Array is :");
		 for(int i=0;i<insertionArray.length;i++)
		 {
			 System.out.print(insertionArray[i]+" ");
		 }
		 System.out.println();

		 System.out.println("sorted array is:");
	
	     for(int i=1;i<insertionArray.length;i++)
	    {
	     /*i will start from first element and stored in key*/
	    	 
		  int key=insertionArray[i];
		  /*j always follow i*/
		  
		  int j=i-1;
		  
	      while(j>=0 && insertionArray[j]>key) 
		  {
	     /*if array[j] is greater than array[j+1] then it will swap*/
	    	  
	    	insertionArray[j+1]=insertionArray[j];
		    j--;
		  }
	      insertionArray[j+1]=key;
	    }
	  
	 for(int i=0;i<insertionArray.length;++i)
	 {
		 System.out.print(insertionArray[i]+" ");
	 }
	 System.out.println();
	 
	 /*stopwatch is stopped*/
	 end1=System.currentTimeMillis();
		
	 /*elapse time is calculated*/
	 long elapsed=end1-start1;
	
	 System.out.println("elapsed time by insertionSort is in miliseconds :"+elapsed+"ms");
		System.out.println("elapsed time by insertionSort is in seconds :"+elapsed/60);
}
	
/**
 * this method is used for insertionSort of string .
 * @param insertionStringArr:taking input array.
 */
	
   public static void insertionString(String []insertionStringArr)
   {
		System.out.println("before insertionSort String Array is :");
		
		 for(int i=0;i<insertionStringArr.length;i++) 
		 {
			 System.out.print(insertionStringArr[i]+" ");
		 }
		 System.out.println();
		 System.out.println("after insertionSort String Array is :");
		
		 for(int i=1;i<insertionStringArr.length;i++)
		    {
			 String key=insertionStringArr[i];
			  int j=i-1;
			  
			  /*it will compare insertionStringArr[j]and insertionStringArr[key] */
		      while(j>=0 && insertionStringArr[j].compareToIgnoreCase(key)>0) 
			  {
		     /*if  insertionStringArr[j]is greater than insertionStringArr[j+1] then it swap */
		    	  insertionStringArr[j+1]=insertionStringArr[j];
			    j--;
			  }
		      insertionStringArr[j+1]=key;
		    }
		 
		  /*if (key.compareTo(inputArray[i]) < 0)*/
		 for(int i=0;i<insertionStringArr.length;i++) 
		 {
			 System.out.print(insertionStringArr[i]+" ");
		 }System.out.println();
	}
   
/**
 * thismethod used for bubble sort.
 * @param bubbleIntArray:taking input array.
 */
	
   public static void bubbleSort(int [] bubbleIntArray)
   {
		int size=bubbleIntArray.length;
		int swap;
		/*this for loop will execute size-1 times (size-1) passes*/
		for(int i=0;i<size-1;i++)
		{ 
			swap=0;
			/*this for loop will execute (size-i)-1 times */
			for(int j=0;j<(size-i)-1;j++)
			{
				/*this  loop will compare j and j+1 elements if j>j+1 then it will swap that values*/
				
				if(bubbleIntArray[j]>bubbleIntArray[j+1])
				{
					swap=bubbleIntArray[j];
					bubbleIntArray[j]=bubbleIntArray[j+1];
					bubbleIntArray[j+1]=swap;
					
					/*if swapping  id done then 1 will be store in swap*/
					swap=1;
				}
			}
			/*if swapping is not done then it will exit from inner loop*/
			if(swap==0)
			{
				break;
			}
		}
		System.out.println("After Bubble sort Array is :");
		for(int i=0;i<bubbleIntArray.length;i++)
		{
			System.out.print(bubbleIntArray[i]+" ");
		}System.out.println();
	}


   /**
    * this method used for bubbleSort for string.
    * @param bubbleStringArray:taking input string array.
    */
   
public static void bubbleString(String[] bubbleStringArray) 
{

int n=bubbleStringArray.length;
for(int i=0;i<n;i++)
{
	for(int j=0;j<(n-i)-1;j++)
	{
		/*it will compare j and j+1 and swap the Strings*/
		if(bubbleStringArray[j].compareToIgnoreCase(bubbleStringArray[j+1])>0)
		{
		 String  swap=bubbleStringArray[j];
		  bubbleStringArray[j]=bubbleStringArray[j+1];
		  bubbleStringArray[j+1]=swap;
		}
	  }
   }
System.out.println("after Bubble Sort strings are :");
for(int i=0;i<n;i++)
{
	System.out.print(bubbleStringArray[i]+" "); 
}
}


/**
 * this method is used for GuessingNumber.
 * @param arNumArray:taking input array from user.
 * @param start:start index of array.
 * @param end:last ib=ndex of array.
 */

public static void GuessingNum(int [] NumArray,int start,int end)
{
	/*it will check low middle and higher element of your limit*/
	   int low=0;
	
	/*calculates mid*/
	   int mid=(start+end)/2;
	    while(start<=end)
	    {
	    	System.out.println("is your no between 0 to "+mid);
	    }
	 
}


/**
 * this method is used for
 * @param day:taking input from user.
 * @param month:taking input from user.
 * @param year:taking input from user.
 * @return
 */

/*taking inputs from user*/
  public static int dayOfWeek(int day, int month, int year) 
  {
/*using these formulas*/
	  
	int y0 = year - (14 - month) / 12;
	int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
	int m0 = month + 12 * ((14 - month) / 12) - 2;
	int d0 = (day + x + (31 * m0) / 12) % 7;
	return d0;
  }
  
  
/**
 * this method is used for temperaturConversion.
 * @param temp:taking input from user.
 * @param c:taking character input.
 */

  public static void temperaturConversion(int temp,char c)
  {
  float celsius=0,Fahrenheit = 0;
  
  /*if user entered input as Fahrenhei then it converted into Celsius*/
	if(c=='f'|| c=='F')
	{
		celsius =(temp - 32)* 5/9;
		System.out.println("Temperature is converted Fahrenhei to Celsius :"+celsius);
	}
	
	/*if user entered input as Celsius then it converted into Fahrenhei*/
	else if(c=='c' || c=='C')
	{
		Fahrenheit = (temp * 9 / 5) + 32;
		System.out.println("Temperature is converted Celsius to Fahrenhei :"+Fahrenheit);
	}
	
   /*otherwise it will show an error message*/
	else
	{
		System.out.println("enter valid input...");
	}
}
  
  
/**
 * this method is used for calculate monthlyPayment.
 * @param payment:taking input from user.
 * @param year:taking input from user.
 * @param interest:taking input from user.
 * @return it returns monthlyPayment.
 */

public static double monthlyPayment(double payment, double year, double interest) 
{
	/*using these formula's we calculating monthly payment*/
	double n = 12 * year;
	double r0 = interest/ (12 * 100);
	double monthlyPayment = payment * r0 / (1 - Math.pow((1 + r0), -n));
    return monthlyPayment;
}   


/**
 * this method is used for conversion of decimal to binary.
 * @param number:taking input to convert.
 * @return binary number of that decimal number.
 */

/*this method is used for decimal to binary conversion*/

public static int[] toBinary(int number)
{

	int[] binaryNum=new int[8]; 
	int i=0;
	
 /*if number is greater than 0 */
	while(number>0)
	{
		binaryNum[i]=number%2;
		number=number/2;
		i++;
	}
/*binary number will display from i-1*/
	
	for(i=i-1;i>=0;i--)
	{
    	System.out.print(binaryNum[i]+" ");
    }
	System.out.println();
	return binaryNum;
}

/**
 * this method is used for find square root of number.
 * @param number:to find square root of number.
 * @return return square root of number.
 */

public static double sqrt(double number) 
{
/*this methos find square root of number*/
	double t = number;
	double epsilon = 1e-15;
	while (Math.abs(t - number/ t) > epsilon * t)
	{
		t = (number / t + t) / 2;
	}

	return number;
}


/**
 * this method is used for Read  list of words from File.
 * @param binaryWordArr:array of String.
 * @param word:which want to search.
 * @return
 */

public static int binaryWord(String [] binaryWordArr,String word)
{
		int lower=0,higher=binaryWordArr.length-1;
		while(lower<=higher)
		{
			int mid=(lower+higher)/2;
			/*compare two strings and result store in result variable*/
			
			int result=word.compareTo(binaryWordArr[mid]);
			/*if two string are same then it will return 0*/
			
			if(result==0)
			{
				return mid;
			}
			/*if first string is greater than second then it will return 1*/
			else if(result>0)
			{
				lower=mid+1;
			}
			/*if first string is smaller than second then it will return -1*/
			else 
			{
				higher=mid-1;
			}
		}
		return 1;
}

/**
 * this method is used for find out prime numbers between 0-1000;
 * @return it returns prime numbers from 0-1000;
 */
public static int prime()
{
int prime=1;
/*it will check prime numbers from 0-1000*/

for(int i=0;i<=1000;i++)
{
	if(i<2)
	{
		continue;
	}
	prime=1;
	
	/*j will start from 2 to j<i*/
	for(int j=2;j<i;j++)
	{
		if(i>1 && (i%j==0))
		{
			/*if (i%j==0) then prime variable initilizes to 0*/
			prime=0;
		}
	}
	/*it will display only prime numbers*/
	if(prime==1)
	{
		System.out.print(" "+i+" ");
	}
//	else
//	{
//		System.out.println("its not a prime no :"+i);
//	}
}
return prime;
}


/**
 * this method is used for checking strings are anagram or not.
 * @param string1:taking input from user.
 * @param string2:taking input from user.
 */

public static void angramString(String string1, String string2) 
{
	/*string1.length stored in size1
	 * string2.length stored in size2*/
	
	int size1=string1.length();
	int size2=string2.length();
	
	/*if size1 and size2 is not equal then Strings are not anagram*/
	if(size1!=size2)
	{
		System.out.println("Strings are not Anagram....");
	}
	else
	{
	/*converting string 1 and String 2 to char Array*/
		
		char st1[]=string1.toCharArray();
		char st2[]=string2.toCharArray();
		
	/*sort the Arrays using parallelSort */
		
		Arrays.parallelSort(st1);
		Arrays.parallelSort(st2);
		
	/*checks both are equal or not*/		
	
		if(Arrays.equals(st1, st2)==true)
		{
			System.out.println("Both Strings Are Anagram...");
		}
		else
		{
			System.out.println("Both strings Are Not Anagram...");
		}
	}
}



/**
 * this method is used for conversion of binary to decimal.
 * @param binaryArray:array of binary number.
 * @return :returns decimal number.
 */

public static int toDecimal(int[] binaryArray) 
{
	
  int decimal = 0, j = 0;
  for (int i = binaryArray.length - 1; i >= 0; i--) 
  {
	if (binaryArray[i] == 1) 
	{
	/*using math.pow() we are calculating decimal number*/
		decimal = decimal + (int) Math.pow(2, j);
	}
	/*j will increase*/
	  j++;
  }
return decimal;
}


/**
 * Function to swap nibbles in array
 *
 * @param int array to swap nibbles in array
 * @return return swapped array
 */
	public static int[] swapNibbles(int[] arr) 
	{
		
/* swap nibbles at first and last of the array
 *  j is used for saving last 4 index of the array*/
		
		int temp, j = arr.length - 4;
		
/* loop runs 4 times and swap first four element to last four elements*/

		for (int i = 0; i < 4; i++) 
		{ 
		    temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
		return arr;
	}

/**
 * this method is used for display Integer Array.
 * @param arr:array taking from user.
 */
	
	public static void showIntegerArray(int[] array)
	{
		/*it will diasplay Integer Array*/
		for(int i=0;i<array.length;i++)
		{
		 System.out.print(array[i]+" ");
		}
	 System.out.println();
	}
	
	
/**
 * this method is used for display String Array.
 * @param arr: array taking from user.
 */
	
public static void showStringArray(String[] array)

{
	/*it will diasplay String Array*/
	System.out.println("entered Strings are :");
      for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
 System.out.println();
}


/**
 * this method is used for display palindrome number.
 * @param arr: array taking from user.
 */

public static void palindrome()
{
System.out.println("Palindrome no. are  [0-1000] :");
int i,j;

int rem1 = 0,remain=0;
int num;
int num1;

/*check palindrome numbers*/

for(i=0;i<=1000;i++)
{
	num=i;
	int reverse=0;
	while(num!=0)
	{
		remain=num%10;
		reverse=reverse*10+remain;
		num=num/10;
	}
	
	/*if reverse is equal to i then those numbers are palindrome number.*/
	if(reverse==i)
	{
		System.out.println("This is  Palindrome Number :"+i);
	}
	
}

}


public static boolean isLeapYear(int year) 
{


	return false;
}


}


