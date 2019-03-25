/** created by: Sangharsha Ranpise.
 * Date: 28/02/2019.
 * Purpose: Write a Program to play a Cross Game or Tic-Tac-Toe Game. Player 1 is the Computer and the Player 2 is the user. 
 * Player 1 take Random Cell that is the Column and Row. 
 */

package Com.BridgeIt.FunctionalPrograms;

import java.util.Random;

import java.util.Scanner;

import Com.BridgeIt.Utility.FunctionalUtility;

public class TicTacToe
{public static void main(String[] args) {
	System.out.println("TIC TAC TOE GAME\n-----------------\n");
	int count=0;
	boolean turn=false;
	Random r=new Random();
	//create empty TIC TAC TOE board
	char[][] board=new char[3][3];
	for(int i=0;i<board.length;i++) {
		for(int j=0;j<board.length;j++) {
			board[i][j]='_';
			
		}
	}

	FunctionalUtility.printBoard(board);
	while(count != 9) {
		//computer's turn
		if(turn) {
			int m=r.nextInt(3);
			int n=r.nextInt(3);
			if(board[m][n]=='_'){
				System.out.println("Computer Played: \n-------------------");
				board[m][n]='O';
				System.out.println();
				FunctionalUtility.printBoard(board);
				count++;
				turn=false;
				System.out.println(count);
			}
			if((board[0][0]=='O'&&board[0][1]=='O'&&board[0][2]=='O') ||
					(board[1][0]=='O'&&board[1][1]=='O'&&board[1][2]=='O')||
					(board[2][0]=='O'&&board[2][1]=='O'&&board[2][2]=='O')||
					(board[0][0]=='O'&&board[1][0]=='O'&&board[2][0]=='O')||
					(board[0][1]=='O'&&board[1][1]=='O'&&board[2][1]=='O')||
					(board[0][0]=='O'&&board[0][1]=='O'&&board[0][2]=='O')||
					(board[0][2]=='O'&&board[1][2]=='O'&&board[2][2]=='O')||
					(board[0][2]=='O'&&board[1][1]=='O'&&board[2][0]=='O')||
					(board[0][0]=='O'&&board[1][1]=='O'&&board[2][2]=='O')) {
				System.out.println("Oops!!! Computer Wins and You Lost.");
				break;
			}
		}
		//Player's Turn
		if(turn==false && count<=8) {
			System.out.println("\nYour turn \n-----------\nEnter the value of row: ");
			int m=FunctionalUtility.getInt();
			System.out.println("Enter the value of column: ");
			int n=FunctionalUtility.getInt();
			if(board[m][n]=='_') {
				board[m][n]='X';
				System.out.println();
				FunctionalUtility.printBoard(board);
				count++;
				turn=true;
				System.out.println(count);
			}
			if((board[0][0]=='X'&&board[0][1]=='X'&&board[0][2]=='X') ||
					(board[1][0]=='X'&&board[1][1]=='X'&&board[1][2]=='X')||
					(board[2][0]=='X'&&board[2][1]=='X'&&board[2][2]=='X')||
					(board[0][0]=='X'&&board[1][0]=='X'&&board[2][0]=='X')||
					(board[0][1]=='X'&&board[1][1]=='X'&&board[2][1]=='X')||
					(board[0][0]=='X'&&board[0][1]=='X'&&board[0][2]=='X')||
					(board[0][2]=='X'&&board[1][2]=='X'&&board[2][2]=='X')||
					(board[0][2]=='X'&&board[1][1]=='X'&&board[2][0]=='X')||
					(board[0][0]=='X'&&board[1][1]=='X'&&board[2][2]=='X')) {
				System.out.println("Congrats!!! You won the game.");
				break;

			}
		}
	}
	if(count==9) {
		System.out.println("No one won.\n \n!!!Game Draw!!!");
	}
}


}