/**
 * created by:Sangharsha Ranpise.
 * Date:15/03/2019.
 * Pupose: Read in the following message: Hello <<name>>, We have your full name as <<full name>> in our system. 
 * your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 
 * 01/01/2016. Use Regex to replace name, full name, Mobile#, and Date with proper value.
* */
package Com.BridgeIt.ObjectOrientedPrograms;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

import Com.BridgeIt.Utility.OopsUtility;

public class RegularExpressionDemonstration 
{
 public static void main(String[] args) 
 {
	Scanner scanner=new Scanner(System.in);
	 
	String bio="Hello <<name>>, We have your full name as <<full name>> in our system. \n" + 
			" * your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz \n" + 
			" * 01/01/2016";
	
	System.out.println(bio);
    System.out.println("Enter Your FirstName :");
    String FirstName=scanner.nextLine();
    System.out.println("Enter Your LastName :");
    String LastName=scanner.nextLine();
    String FullName=FirstName+" "+LastName;
    Pattern r=Pattern.compile("[a-zA-Z]+");
    if(Pattern.matches("[a-zA-Z]+",FirstName))
    {
    	bio=bio.replaceAll("<<name>>", FirstName);
    	bio=bio.replaceAll("<<full name>>", FullName);
    }
    System.out.println("Enter Mobile Number :");
    String MobileNumber=scanner.next();
   
    if(Pattern.matches("[789][0-9]{9}",MobileNumber))
    {
    	bio=bio.replaceAll("x{10}", MobileNumber);
    }
    System.out.println("Enter Date :");
    String date=scanner.next();
    
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
    LocalDate now = LocalDate.now();  
    String day="";
    System.out.println(day=dtf.format(now));  
    
    if(Pattern.matches(("^[0-3][0-9]/[0-3][0-9]/(?:[0-9][0-9])?[0-9][0-9]$"),day))
    {
    	bio=bio.replaceAll("01/01/2016", day);
    }
  
    System.out.println(bio);
 }
}
