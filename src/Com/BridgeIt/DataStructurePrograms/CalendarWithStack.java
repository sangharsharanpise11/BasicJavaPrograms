/**
 * Creadted By :Sangharsha Ranpise.
 * Date :14/03/2019.
 * Purpose : Create the Week Object having a list of WeekDay objects each storing the day (i.e S,M,T,W,Th,..) and the Date 
 * (1,2,3..) . The WeekDay objects are stored in a Queue implemented using Linked List. Further maintain also a Week 
 * Object in a Queue to finally display the Calendar.
 * Modify the above program to store the Queue in two Stacks. Stack here is also implemented using Linked List 
 * and not from Collection Library
 */
package Com.BridgeIt.DataStructurePrograms;

import java.util.Scanner;

public class CalendarWithStack 
{
	public static void main(String[] args)
	{
		//taking inputs from user 
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter month :");
		 int month=sc.nextInt();
		 System.out.println("enter year :");
		 int year=sc.nextInt();
		 //passing the parameters to calendarStack
		 CalendarWithStack.calendarStack(month,year);
	}

	private static void calendarStack(int month, int year) 
	{
	 String [] months= {"january","february","march","april","may","june","jully","august","september","octomber","november","december"};
	 Stack <String>stack=new Stack();
	
	//this formula used for getting no. of days.
	    int d = 1, y = year, m = month;
		
        int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;

		int start = d0;
		int totalDaysofMonth=0;
		int count=1;
		if (month == 2) 
        {
			//if month is 2 then it will check that year is leap or not
		    if (CalendarWithStack.isLeapYear(year)) // if leap year days = 29
		    	totalDaysofMonth = 29;
			else
				totalDaysofMonth = 28; // if not leap year days= 28
		 } 
       else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
    	   totalDaysofMonth = 31;
	   else
			totalDaysofMonth = 30;
		
	   while (start != 0) 
		{
			stack.push("   ");//insert into stack and prints"_ "
			start--;
		}
		
	   while (count <= totalDaysofMonth) 
		{
			if (count <= 9)
				stack.push(String.valueOf(count) + "  "); // add data into the stack
			else
				stack.push(String.valueOf(count) + " "); // add data into the stack
			count++;
		}

		System.out.println(months[month-1]+" "+year);
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		System.out.println();
		count = 1;
		while (!stack.isEmpty()) // traverse till stack is not empty
		{
			String result = stack.pop();
			System.out.print(result+"\t");
			
			if (count % 7 == 0) 
			{
				System.out.println();
			}
			count++;
		}
	}
	//this method is used for checking leap year.
    private static boolean isLeapYear(int year)
	{
    	 if  ((year % 4 == 0) && (year % 100 != 0)) return true;
		 if  (year % 400 == 0) return true;
		 return true;
    }
}
