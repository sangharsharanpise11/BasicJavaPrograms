/**
 * created by :sangharsha ranpise.
 * Date :23/03/2019.
 * Purpose :Write a Program DeckOfCards.java, to initialize deck of cards having suit 
 * ("Clubs", "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"). 
 * Shuffle the cards using Random method and then distribute 9 Cards to 4 Players and Print the Cards the received by the
 *  4 Players using 2D Array…
 *  
 *  Extend the above program to create a Player Object having Deck of Cards, and having ability to Sort by Rank and maintain 
 *  the cards in a Queue implemented using Linked List. Do not use any Collection Library. Further the Player are also arranged in Queue. 
 *  Finally Print the Player and the Cards received by each Player.
 */
package Com.BridgeIt.ObjectOrientedPrograms;

import java.util.Scanner;

public class DeckOfCardsUsingQueueLinkedList
{  
	public static String[] assigncard()
	{
		String [] cards= {"Clubs","Diamonds","Hearts","Spades"};
		String [] ranks= {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		String [] decksOfCard=new String[52];
		
		int index=0;
		for(int i=0;i<cards.length;i++)
		{
			for(int j=0;j<ranks.length;j++)
			{
				decksOfCard[index++]=ranks[j]+" "+cards[i];
			}
		}
		System.out.println("Before Shuffle the Cards :");
		System.out.println();
		for(int i=0;i<decksOfCard.length;i++)
		{
			System.out.println(decksOfCard[i]);
		}
		System.out.println();
		return decksOfCard;
		
	}
	
	public static String[] shuffleCards(String []decksOfCard)
	{
		for(int i=0;i<decksOfCard.length;i++)
		{
			int random=(int) (Math.random()*52);
			String temp=decksOfCard[i];
			decksOfCard[i]=decksOfCard[random];
			decksOfCard[random]=temp;
		}
		System.out.println("After Shuffle :");
		System.out.println();
		for(int i=0;i<decksOfCard.length;i++)
		  {
			  System.out.print(decksOfCard[i]+" ");
			  System.out.println();
		  }
		
		return decksOfCard;
	}
	
	public  static String[] distributed(String []decksOfCard,int noOfPlayer,int noOfCard)
	{
		System.out.println("Now Distributing 9 cards for each Player.....");
		int count=0;
		String [][] distributedCard=new String[noOfPlayer][noOfCard];
		for(int i=0;i<noOfPlayer;i++)
		{
			for(int j=0;j<noOfCard;j++)
			{
				distributedCard[i][j]=decksOfCard[count++];
			}
		}
		for(int i=0;i<distributedCard.length;i++)
		{
			for(int j=0;j<distributedCard.length;j++)
			{
				System.out.println(distributedCard[i][j]+" ");
			}
			System.out.println();
		}
		return decksOfCard;
	}
	
private static void deckOfCardsQueue(String[] distributedCard, int noOfPlayer, int noOfCard) 
{
		
		
}
	
 public static void main(String[] args)
  {
	   int noOfPlayer = 4;
	   int noOfCard=9;
	   DeckOfCardsUsingQueueLinkedList card=new DeckOfCardsUsingQueueLinkedList();
	   
	   card.assigncard();
	   String decksOfCard[]=card.assigncard();
	   String shuffleCards[]=card.shuffleCards(decksOfCard);
	   String distributedCard[]=card.distributed(decksOfCard, noOfPlayer, noOfCard);
	   System.out.println("Players Cards After Sorting ");
	   DeckOfCardsUsingQueueLinkedList.deckOfCardsQueue(distributedCard, noOfPlayer, noOfCard);

  }


}
