/**
 * created by :sangharsha ranpise.
 * Date :23/03/2019.
 * Purpose :Write a Program DeckOfCards.java, to initialize deck of cards having suit 
 * ("Clubs", "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"). 
 * Shuffle the cards using Random method and then distribute 9 Cards to 4 Players and Print the Cards the received by the
 *  4 Players using 2D Array…
 */
package Com.BridgeIt.ObjectOrientedPrograms;

class Cards
{
	static String [] suits= {"Clubs", "Diamonds", "Hearts", "Spades"};
	static  String [] ranks= {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
	static  int noCards=suits.length*ranks.length;   						//noCards=52
	static String [] deck=new String[noCards];
}
class ShuffleCards extends  Cards
{
	void display()
	{
		//shuffle cards
		for(int i=0;i<noCards;i++)
		{
			int r=(int) (i+(Math.random()*(noCards-i)));
			String temp=deck[r];
			deck[r]=deck[i];
			deck[i]=temp;

		}
  for(int i=0;i<ranks.length;i++)										//13
		{			
			for (int j=0;j<suits.length;j++)							//4
			{
				deck[suits.length*i+j]=ranks[i]+" of"+suits[j];	

			}
		}
	}
}


class DistributeCards extends  ShuffleCards
{
	void display1()
	{

		//Distributing cards among 4 person
		for(int i=1;i<5;i++)
		{
			System.out.println();
			System.out.println("Player number "+i+" has cards as ");

			for(int j=0;j<9;j++)											//9 players
			{
				System.out.println(deck[i+j*4]+"(Card"+(i+j*4)+")");		//36 cards are generated
			}
		}
	}
}
class DeckOfCards 
	{
	  public static void main(String[] args)
		{
		  DistributeCards distributeCards=new DistributeCards();
			distributeCards.display();
			distributeCards.display1();
			
		}
	}



