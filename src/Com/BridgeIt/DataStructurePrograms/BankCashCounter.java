/**
 * Creadted By :Sangharsha Ranpise.
 * Date :14/03/2019.
 * Purpose : Create a Program which creates Banking Cash Counter where people come in to deposit Cash and withdraw Cash.
 *  Have an input panel to add people to Queue to either deposit or withdraw money and dequeue the people.
  Maintain the Cash Balance.
*/
package Com.BridgeIt.DataStructurePrograms;

import Com.BridgeIt.Utility.DataStructureUtility;

public class BankCashCounter 
{
		static Queue<Integer>queue = new Queue();

		public static  int Start=0;
		public static int End=0;

		public static int BankBalance=10000;
		public static int size=0;


        //this method is used for deposit
		public static void deposit(int amount)
		{

			BankBalance +=amount;

		}
		  //this method is used for withdraw
		public static void withdraw(int amount) 
		{
			if(amount<BankBalance)
			{
				BankBalance -=amount;

			}
			else
			{
				System.out.println("Sorry!!! Insufficient amount :-(");
			}
		}
		  //this method is used for option
		public static  void Option()
		{
			if(End<Start)
			{
				System.out.println("Queue is empty");
			}
			else
			{
				//again asks for option 1 or 2
				System.out.println("Enter 1. for deposit");
				System.out.println("Enter 2. to withdraw");
				
				int Transcation = DataStructureUtility .inputInteger();
				if (Transcation == 1) 
				{
					//if option is 1 then deposite amount
					System.out.println("Enter the amount ");
					int amount =  DataStructureUtility .inputInteger();
					deposit(amount);

				} else if (Transcation == 2) 
				{
					//if option is 1 then withdraw amount
					System.out.println("Enter the amount to be withdrawn:");
					int amount =  DataStructureUtility .inputInteger();
					withdraw(amount);
				}
				Start++;
			}

		}
		//this method will display bank balance
		public static void Print() 
		{
			System.out.println("Bank Balance:" + BankBalance);
		}

		//this method will display length of queue
		public static void Length() {

			System.out.println("Size of Queue is:" + (End - Start));

		}
       
		//this method will used to enter range 
		public static int enterqueue(int range)
		{
			End=End+range;
			System.out.println("persons added in the queue are "+range);
			return range;

		}
       
		// main method of program
		public static void main(String[] args) 
		{

			int choice = 0;
			int choice2= 0;
			int choice3= 0;
			System.out.println();
			System.out.println("***************Banking Cash Counter**************");
			System.out.println("1.for adding the persons in the bank queue:");

			System.out.println("4.Exit");
			System.out.println();
			System.out.println("Enter your choice: ");
            
			//choice is between 1 to 5
			choice =DataStructureUtility .inputInteger();
			while(choice <= 5 || choice <= 0)
			{
				//if choice is 1
				if(choice==1)
				{
					System.out.println("Enter the persons to be added to queue");
					int person=enterqueue(DataStructureUtility .inputInteger());
					Print();
					for( int i=1;i<=person;i++)
					{
						System.out.println("Transaction for "+i+"person");

						System.out.println("2.for perfoming transaction Withdraw/deposit");
						System.out.println("3.for checking number of people in the queue ");
						Print();

						choice2 =DataStructureUtility .inputInteger();

						if(choice2==2)
						{
							//if choice is 2 then 
							Option();
							Print();
						}

						else if(choice2==3)
						{
							//if choice is 3 then 
							queue.deque();
							Length();
							break;
						}
					}
				}
				else if(choice==4)
				{
					//if choice is 4 then 
					System.out.println("You have been removed from the queue");
					break;
				}


			}
		}
	}


	