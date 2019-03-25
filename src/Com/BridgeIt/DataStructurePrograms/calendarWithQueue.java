/**
 * Creadted By :Sangharsha Ranpise.
 * Date :14/03/2019.
 * Purpose : Create the Week Object having a list of WeekDay objects each storing the day (i.e S,M,T,W,Th,..) and the Date 
 * (1,2,3..) . The WeekDay objects are stored in a Queue implemented using Linked List. Further maintain also a Week 
 * Object in a Queue to finally display the Calendar
 */
package Com.BridgeIt.DataStructurePrograms;

import java.util.Scanner;

public class calendarWithQueue 
{
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter month :");
	int month=sc.nextInt();
	System.out.println("enter year :");
	int year=sc.nextInt();
	calendarWithQueue.calenderQueue(month,year);
  }
	//calendar using queue
	public static void calenderQueue(int month, int year)
	{
		String months[] = { "January", "Februry", "March", "April", "May", "June", "July", "August", "September", "October",
				"November", "December" };
		
		Queue<String> q1 = new Queue<>();
		
        // get d0 value hence upto d0 we will add null values
		
        int d = 1, y = year, m = month;
		
        int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;

		int start = d0;
		int totalDaysOfMonth = 0, count = 1;//days starts from 1,2,3
		
		if (month == 2) 
         {
		    if (calendarWithQueue.isLeapYear(year)) // if leap year days = 29
				totalDaysOfMonth = 29;
			else
				totalDaysOfMonth = 28; // if not leap year days= 28
		 } 
        else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			totalDaysOfMonth = 31;
		else
			totalDaysOfMonth = 30;

		while (start != 0) 
		{
			q1.enque("   ");//insert into queue and prints"_ "
			start--;
		}

		while (count <= totalDaysOfMonth) 
		{
			if (count <= 9)
				q1.enque(String.valueOf(count) + "  "); // add data to the queue
			else
				q1.enque(String.valueOf(count) + " "); // add data to the queue
			count++;
		}

		System.out.println(months[month - 1] + " " + year);
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		count = 1;
		while (!q1.isEmpty()) // traverse till queue is not empty
		{
			String result = q1.deque();
			System.out.print(result+"\t");
			
			if (count % 7 == 0) 
			{
				System.out.println();
			}
			count++;
		}
}
	private static boolean isLeapYear(int year) 
	{
		 if  ((year % 4 == 0) && (year % 100 != 0)) return true;
		   if  (year % 400 == 0) return true;
		   return true;
		
	}
}
