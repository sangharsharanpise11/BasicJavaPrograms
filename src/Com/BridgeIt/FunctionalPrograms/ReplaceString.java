/** created by: Sangharsha Ranpise.
 * Date: 28/02/2019.
 * Purpose: User Input and Replace String Template “Hello <<UserName>>, How are you?”
 *  I/P -> Take User Name as Input. Ensure UserName has min 3 char
    Logic -> Replace <<UserName>> with the proper name
    O/P -> Print the String with User Name  
*/
package Com.BridgeIt.FunctionalPrograms;

import java.util.Scanner;

import Com.BridgeIt.Utility.FunctionalUtility;

public class ReplaceString 
{
	/*main method*/
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		/*taking string from user*/
		
		System.out.println("Enter the Your name :");
		String string=sc.next();
		
		FunctionalUtility.replaceString(string);
	}
}