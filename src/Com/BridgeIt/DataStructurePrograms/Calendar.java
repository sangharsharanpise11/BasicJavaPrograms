/**
 * created by :SAngharsha Ranpise.
 * Date :12/03/2019.
 * Purpose:Write a program Calendar.java that takes the month and year as command-line arguments and prints the Calendar of 
 * the month. Store the Calendar in an 2D Array, the first dimension the week of the month and the second dimension stores 
 * the day of the week. Print the result as following.

 */
package Com.BridgeIt.DataStructurePrograms;

public class Calendar
{
public static void main(String[] args)
 {
  int calendar[][] = new int[5][7];	
  
  //taking command line argument
  int month= Integer.parseInt(args[0]);
  int year= Integer.parseInt(args[1]);

  //String array of months
  String[] months= {" ","January", "February", "march","April","May","June","Jully",
		  "August","September","Octomber","November","December"};
 
  //integer array of month of days
  int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
 
  System.out.println("welcome to Calendar....");
  System.out.println();
  System.out.println(months[month]+" "+year);
  System.out.println("sun\tMon\tTue\twed\tThu\tFri\tSat");
  
  //if month is 2 and year will be leap year then month of days will be 29
  if(month==2 && isLeapyear(year)) days[month]=29;
  
  //start day
  
  int d=day(1,month,year);
  
  for(int i=0;i<d;i++)
  {
	  System.out.print("\t");
  }

  int day=0;
  for(int i=0; i<calendar.length; i++)		// set calendar according to user input.
	{	
		for(int j=0; j<calendar[i].length; j++)
		{
			if(days[month] != day)
			{
				day++;
				calendar[i][j] = day;
				
				if((j+d) % 7 == 0)
				{
					System.out.println();
				}
				if(calendar[i][j] < 10)
				{
					System.out.print(" "+calendar[i][j]+"\t");
				}
				else
					System.out.print(calendar[i][j]+"\t");
			}
		}
	}
 }
//this method is used for getting day of months
public static int day(int day,int month, int year)
{
  int y = year - (14 - month) / 12;
  int x = y + y/4 - y/100 + y/400;
  int m = month + 12 * ((14 - month) / 12) - 2;
  int d = (day + x + (31*m)/12) % 7;
  System.out.println(d);
  //return d
  return d;
}
//this method is used for checking  its leap year or not
public static boolean isLeapyear(int year)
{
   if  ((year % 4 == 0) && (year % 100 != 0)) return true;
   if  (year % 400 == 0) return true;
   return true;
}


}
