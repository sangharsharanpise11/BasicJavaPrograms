/**
 * this class for commercial methods.
 */
package Com.BridgeIt.ObjectOrientedPrograms.CommercialDataProcessing;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CommercialLLMethods
{
	
		Utility utility = new Utility();
		LinkedList list ;
		LinkedList list1 ;
		Scanner scanner = new Scanner(System.in);
		String companyFilePath = "/home/bridgelabz/Download/JavaPrograms/src/CommercialDataProcessing/Company.json";
		String userFilePath = "/home/bridgelabz/Download/JavaPrograms/src/CommercialDataProcessing/User.json";
		CompanyPojo companyPojo = new CompanyPojo();
		
		/**
		 * this method add the details. 
		 * @throws Exception
		 */
		public void addDetails() throws Exception
		{
			System.out.println("Enter Whose details you want to add\n1.Company Stock\t2.User Details");
			int choice = utility.inputInteger();
			switch(choice)
			{
				case 1:
					addStockDetails();				
					break;
				case 2:
					addUser();
					break;
				default:
					System.out.println("Invalid choice...!!!");
					System.out.println("Do you wants to enter again...(Y/N)");
					char ch = scanner.next().charAt(0);
					if(ch == 'Y' || ch == 'y')
						addDetails();
			}
		}	
		/**
		 * this method add stock details. and throws this exception.
		 * @throws ParseException
		 * @throws IOException
		 */
		public void addStockDetails() throws ParseException, IOException 
		{
			File file = new File(companyFilePath);
			System.out.println("Enter Stock name : ");
			String stockName = utility.inputString();
			companyPojo.setStockName(stockName);
			
			System.out.println("Enter stock symbol : ");
			String stockSymbol = utility.inputString();
			companyPojo.setStockSymbol(stockSymbol);
			
			System.out.println("Enter no. of share : ");
			String noOfShare = utility.inputString();
			companyPojo.setNoOFShare(noOfShare);
			
			System.out.println("Enter share Price : ");
			String sharePrice = utility.inputString();
			companyPojo.setSharePrice(sharePrice);		
			createCompanyJsonObj(companyPojo ,file);
		}
		@SuppressWarnings("unchecked")
		/**
		 * this method creates json object.
		 * @param companyPojo :taken as parameter
		 * @param file :as a parameter
		 * @throws ParseException
		 * @throws IOException
		 */
		public void createCompanyJsonObj(CompanyPojo companyPojo ,File file) throws ParseException, IOException 
		{
			JSONParser parser = new JSONParser();		 
			JSONObject jsonObj = (JSONObject)parser.parse(new FileReader(file));
			JSONArray jsonArray =(JSONArray)jsonObj.get("StockDetails");
			JSONObject simple = new JSONObject();
			simple.put("StockName",companyPojo.getStockName());
			simple.put("StockSymbol", companyPojo.getStockSymbol());
			simple.put("NoOfShare", companyPojo.getNoOFShare());
			simple.put("SharePrice", companyPojo.getSharePrice());
			jsonArray.add(simple);
			jsonObj.put("StockDetails", jsonArray);
			System.out.println(jsonObj);
			try {
				writeIntoFile(jsonObj , companyFilePath);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
		//using this method write data into file
		private void writeIntoFile(JSONObject jsonObj2 , String filePath)  throws ParseException, IOException 
		{
			File file = new File(filePath);
			FileWriter writer = new FileWriter(file);
			writer.write(jsonObj2.toString());
			writer.flush();
		}	
		
		//addUser() to add user details.
		public void addUser()throws ParseException, IOException 
		{
			UserPojo userPojo = new UserPojo();
			File file = new File(userFilePath);
			System.out.println("Enter User name : ");
			String userName = utility.inputString();
			userPojo.setUserName(userName);
					
			System.out.println("Enter no. of share : ");
			String noOfShare = utility.inputString();
			userPojo.setNoOfShares(noOfShare);
			
			System.out.println("Enter share price : ");
			String sharePrice = utility.inputString();
			userPojo.setPrice(sharePrice);					
			try
			{
				createUserJsonObj(userPojo ,file);
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}	
		@SuppressWarnings("unchecked")
		/**
		 * creates user json object.
		 * @param userPojo
		 * @param file
		 * @throws ParseException
		 * @throws IOException
		 */
		public void createUserJsonObj(UserPojo userPojo , File file) throws ParseException, IOException 
		{
			JSONParser parser = new JSONParser();		 
			JSONObject jsonObj = (JSONObject)parser.parse(new FileReader(file));
			JSONArray jsonArray =(JSONArray)jsonObj.get("UserDetails");
			JSONObject simple = new JSONObject();
			simple.put("UserName",userPojo.getUserName());
			simple.put("NoOfShare", userPojo.getNoOfShares());
			simple.put("SharePrice", userPojo.getPrice());
			jsonArray.add(simple);
			jsonObj.put("UserDetails", jsonArray);
			System.out.println(jsonObj);
			writeIntoFile(jsonObj ,userFilePath );
		}	

		@SuppressWarnings("unchecked")
		/**
		 * buyStock() this method for buy stock.
		 * @throws ParseException
		 * @throws IOException
		 */
		public void buyStock()throws ParseException, IOException 
		{
			File file1 = new File(companyFilePath);
			JSONParser parser1 = new JSONParser();
			JSONObject jsonObj1 = (JSONObject)parser1.parse(new FileReader(file1));
			JSONArray array1 = (JSONArray)jsonObj1.get("StockDetails"); 
			System.out.println(array1);

			File file2 = new File(userFilePath);
			JSONParser parser2 = new JSONParser();
			JSONObject jsonObj2 = (JSONObject)parser2.parse(new FileReader(file2));
			JSONArray array2 = (JSONArray)jsonObj2.get("UserDetails");
			System.out.println(array2);
			JSONObject compareObj1;//for company name
			JSONObject compareObj2;//for user name
			System.out.println("Enter User name : ");
			String userName = utility.inputString();
			for(int i = 0;i<array2.size();i++)
			{
				compareObj2 = (JSONObject)array2.get(i);
				if(compareObj2.get("UserName").equals(userName))
				{
					System.out.print(compareObj2);
					System.out.println("\nFollowing is available stock list");
					for(i=0 ; i<array1.size();i++)
					{
						compareObj1 = (JSONObject)array1.get(i);
						System.out.println(compareObj1);
					}
					System.out.println("Enter Stock Name from above list ");
					String stockName = utility.inputString();
					for(i=0 ; i<array1.size();i++)
					{
						compareObj1 = (JSONObject)array1.get(i);
						if(compareObj1.get("StockName").equals(stockName)) 
						{
							System.out.println(compareObj1);
							System.out.println("Enter how many stocks you want to buy");
							int stocksToBuy = utility.inputInteger();
							
							int companyIntStocks = Integer.parseInt(compareObj1.get("NoOfShare").toString());
							int userIntStocks = Integer.parseInt(compareObj2.get("NoOfShare").toString());
							int userSharePrice = Integer.parseInt(compareObj2.get("SharePrice").toString());
							int companySharePrice = Integer.parseInt(compareObj1.get("SharePrice").toString());
							String stockSymbol = compareObj1.get("StockSymbol").toString();

							int newUserShares = userIntStocks + stocksToBuy;
							int newCompanyShares = companyIntStocks - stocksToBuy;
							
							int priceOfEachShare = companySharePrice / companyIntStocks;
							int newStockCalculation = (priceOfEachShare * stocksToBuy);
							int newComapnySharePrice=  companySharePrice + newStockCalculation ;						
							int newUserSharePrice = userSharePrice - newStockCalculation;
							
							
							if(companyIntStocks > stocksToBuy && userSharePrice > newStockCalculation)
							{						
								compareObj1.remove("NoOfShare");
								compareObj2.remove("NoOfShare");
								compareObj1.remove("SharePrice");
								compareObj2.remove("SharePrice");
								
								compareObj1.put("NoOfShare", newCompanyShares);
								compareObj2.put("NoOfShare", newUserShares);
								compareObj1.put("SharePrice", newComapnySharePrice);
								compareObj2.put("SharePrice", newUserSharePrice);
															
								System.out.println(compareObj1);
								System.out.println(compareObj2);
								
								Date dateObj = new Date();
		                        String date = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a").format(dateObj);
		                        System.out.println("Shares Buy Date & Time : " + date);
							}
							else
								System.out.println("Sorry.!!! Insufficient amount or shares not available....");
						}
					}
				}
			}
			writeIntoFile(jsonObj1, companyFilePath);
			writeIntoFile(jsonObj2, userFilePath);
		}
		/**
		 * for linked list.
		 * @throws ParseException
		 * @throws IOException
		 */
		public void linkedlist() throws ParseException, IOException 
		{
			list = new LinkedList();
			list1 = new LinkedList();
					
			//reading file using JSONParser
			File file1 = new File(companyFilePath);
			JSONParser parser1 = new JSONParser();
			JSONObject jsonObj1 = (JSONObject)parser1.parse(new FileReader(file1));
			//creating JSONArray and store data in array1
			JSONArray array1 = (JSONArray)jsonObj1.get("StockDetails");
			
			//reading file using JSONParser
			File file2 = new File(userFilePath);
			JSONParser parser2 = new JSONParser();
			JSONObject jsonObj2 = (JSONObject)parser2.parse(new FileReader(file2));
			//creating JSONArray and store data in array2
			JSONArray array2 = (JSONArray)jsonObj2.get("UserDetails");
			
			//creating JSONObject
			JSONObject obj;
			//inserting array1 elements in list
			for(int i=0;i<array1.size();i++) 
			{
				//getting elements of array1 and store in obj
				obj = (JSONObject)array1.get(i);
				//store element in string str
				String str = obj.get("NoOfShare").toString();
				//store str elements in list
				list.insert(str);
			}	
			list.show();
			
			for(int i = 0;i<array2.size();i++)
			{
				obj = (JSONObject)array2.get(i);
				String str = obj.get("NoOfShare").toString();
				list1.insert(str);
			}
			//show() display all elements of list1
			list1.show();
		}
		
		@SuppressWarnings("unchecked")
		
		/**
		 * this method is used for sell stock.
		 * @throws ParseException
		 * @throws IOException
		 */
		public void sellStock()throws ParseException, IOException 
		{		
			File file1 = new File(companyFilePath);
			JSONParser parser1 = new JSONParser();
			JSONObject jsonObj1 = (JSONObject)parser1.parse(new FileReader(file1));
			JSONArray array1 = (JSONArray)jsonObj1.get("StockDetails"); 
			System.out.println(array1);		
			File file2 = new File(userFilePath);
			JSONParser parser2 = new JSONParser();
			JSONObject jsonObj2 = (JSONObject)parser2.parse(new FileReader(file2));
			JSONArray array2 = (JSONArray)jsonObj2.get("UserDetails");
			System.out.println(array2);
			JSONObject compareObj1;
			JSONObject compareObj2;
			System.out.println("Enter User name : ");
			String userName = utility.inputString();
			for(int i = 0;i<array2.size();i++)
			{
				compareObj2 = (JSONObject)array2.get(i);
				if(compareObj2.get("UserName").equals(userName))
				{
					//isUserPresent = true;
					System.out.print(compareObj2);
					System.out.println("\nFollowing is available stock list");
					for(i=0 ; i<array1.size();i++)
					{
						compareObj1 = (JSONObject)array1.get(i);
						System.out.println(compareObj1);
					}
					System.out.println("Enter name of stock to whom you want to buy shares ");
					String stockName = utility.inputString();
					for(i = 0 ; i<array1.size();i++)
					{
						compareObj1 = (JSONObject)array1.get(i);
						if(compareObj1.get("StockName").equals(stockName))
						{
							//isStockPresent = true;
							System.out.println(compareObj1);	
							
							System.out.println("How many shares you wants to sell ? ");
							int sellShares = utility.inputInteger();
							
							int companyIntStocks = Integer.parseInt(compareObj1.get("NoOfShare").toString());
							int userIntStocks = Integer.parseInt(compareObj2.get("NoOfShare").toString());
							int userSharePrice = Integer.parseInt(compareObj2.get("SharePrice").toString());
							int companySharePrice = Integer.parseInt(compareObj1.get("SharePrice").toString());
													
							int newUserShares = userIntStocks - sellShares;
							int newCompanyShares = companyIntStocks + sellShares;							
							
							int priceOfEachUserShares = userSharePrice / userIntStocks; 
							int newShareCalculation =  priceOfEachUserShares * sellShares;
							int newUserSharePrice = userSharePrice + newShareCalculation;
							int newCompanySharePrice = companySharePrice - newShareCalculation ; 
							
							if(sellShares < userIntStocks && newShareCalculation < companySharePrice )
							{
								compareObj1.remove("NoOfShare");
								compareObj2.remove("NoOfShare");
								compareObj1.remove("SharePrice");
								compareObj2.remove("SharePrice");
								
								compareObj1.put("NoOfShare", newCompanyShares);
								compareObj2.put("NoOfShare", newUserShares);
								compareObj1.put("SharePrice", newCompanySharePrice);
								compareObj2.put("SharePrice", newUserSharePrice);
								
								System.out.println(compareObj1);
								System.out.println(compareObj2);					

								Date dateObj = new Date();
		                        String date = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a").format(dateObj);
		                        System.out.println("Shares Sell Date & Time : " + date);
							}
						}
					}	
				}
			}		
		}	
		/**
		 * this method is used for print Report.
		 * @throws ParseException
		 * @throws IOException
		 */
		public void printReport() throws ParseException, IOException 
		{
			CommercialLLMethods stock = new CommercialLLMethods();
			System.out.println("Whose data you want to see\n1. Company\t2. User");
			int reportchoice = utility.inputInteger();
			switch (reportchoice) 
			{
			case 1:
				try {
					stock.printCompanyReport();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}						
				break;
			case 2:
				try {
					stock.printUserReport();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			default:
				System.out.println("Invalid choice");
			}		
		}
		/**
		 * this method is used for Print ComapanyReport.
		 * @throws ParseException
		 * @throws IOException
		 */
		public void  printCompanyReport() throws ParseException, IOException 
		{
			File file = new File(companyFilePath);
			JSONParser parser = new JSONParser();
			JSONObject jsonObj = (JSONObject)parser.parse(new FileReader(file));
			JSONArray array = (JSONArray)jsonObj.get("StockDetails");
			System.out.println(array);
		}
		/**
		 * this method is used for print user report.
		 * @throws ParseException
		 * @throws IOException
		 */
		public void printUserReport() throws ParseException, IOException 
		{
			File file = new File(userFilePath);
			JSONParser parser = new JSONParser();
			JSONObject jsonObj = (JSONObject)parser.parse(new FileReader(file));
			JSONArray array = (JSONArray)jsonObj.get("UserDetails");
			System.out.println(array);
		}
	
}
