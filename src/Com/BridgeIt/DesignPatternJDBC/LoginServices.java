package Com.BridgeIt.DesignPatternJDBC;

import java.util.Scanner;

public class LoginServices
{
		static Scanner scanner=new Scanner(System.in);
		public static String stringInput() 
		{
		    String Stringinput=scanner.next();
		    return Stringinput;
		}
		public static int integerInput() 
		{
		    int integerinput=scanner.nextInt();
		    return integerinput;
		}

}