/**
 * created by:Sangharsha Ranpise.
 * Date :20/03/2019.
 * Purpose :Commercial data processing - StockAccount.java implements a data type that might be used by a financial 
 * institution to keep track of customer information. The StockAccount class implements following methods
 * The StockAccount class also maintains a list of CompanyShares object which has Stock Symbol and Number of Shares as
 *  well as DateTime of the transaction. When buy or sell is initiated StockAccount checks if CompanyShares are available 
 *  and accordingly update or create an Object. 
 */
package Com.BridgeIt.ObjectOrientedPrograms.CommercialDataProcessing;

import java.util.Scanner;

public class CommercialLL
{
	public static void main(String[] args) throws Exception 
	{
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		CommercialLLMethods stock = new CommercialLLMethods();
		char ch;
		do
		{
			System.out.println("1. Add Details\n2. Buy\n3. Sell\n4. Print Report ");
			int choice = utility.inputInteger();			
			switch(choice)
			{
				case 1 : 
					stock.addDetails();
					break;
				case 2 : 
					stock.buyStock();
					stock.linkedlist();
					break;
				case 3:
					stock.sellStock();
					stock.linkedlist();
					break;
				case 4 : 
					stock.printReport();
					break;							
				default :
					System.out.println("Invalid Choice..!!!");
					break;			
			}
			System.out.println("Do you wants to continue...(Y/N)");
			ch = scanner.next().charAt(0);
		}while(ch=='Y' || ch == 'y');
	}

}
