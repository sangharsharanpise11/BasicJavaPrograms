/**
 * Creadted By :Sangharsha Ranpise.
 * Date :14/03/2019.
 * Purpose : Read the Text from a file, split it into words and arrange it as Linked List. Take a user input to 
 * search a Word in the List. If the Word is not found then add it to the list, and if it found then remove 
 * the word from the List. In the end save the list into a file
*/
package Com.BridgeIt.DataStructurePrograms;

import java.util.Scanner;

public class BalancedParentheses 
{
 public static void checkForBalancedParenthesis() 
 {
			Scanner sc = new Scanner(System.in);
			Stack<String> stack=new Stack<String>();
			int top = -1, result = 0;
			char Arraystack[] = new char[20]; // create stack
			char a = 0, b = 0;
			
			
			System.out.println("enter your expression:");
			String expression = sc.next(); // get expression as input from user
		
			int size = expression.length(); // get length of expression

			for (int i = 0; i < size; i++) 
			{
               if (expression.charAt(i) == '{' || expression.charAt(i) == '[' || expression.charAt(i) == '(') 
               {
			   top++; // increment top
			   Arraystack[top] = expression.charAt(i);// if true then push it into stack
               }
               else if (expression.charAt(i) == '}' || expression.charAt(i) == ']' || expression.charAt(i) == ')') 
               {
					b = expression.charAt(i);
					a = Arraystack[top]; // pop element from stack
					top--; // decrement top
				}

				result = 0;
				if ((a == '{' && b == '}') || (a == '[' && b == ']') || (a == '(' && b == ')')) // if condition is true set
				result = 1;
			}

			if (result == 1 && top == -1) // if result is 1 and stack is empty then true else false
				System.out.println("expression is balanced..");

			else
				System.out.println("expression is unbalanced...");
		}

		public static void main(String[] args) 
		{
			checkForBalancedParenthesis();
		}

	}
