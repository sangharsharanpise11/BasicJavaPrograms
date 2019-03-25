/**
 * Created by :Sangharsha Ranpise.
 * Date :14/03/2019.
 * Purpose :Add the Prime Numbers that are Anagram in the Range of 0 - 1000 in a Stack using the Linked List 
 * and Print the Anagrams in the Reverse Order. Note no Collection Library can be used.

 */
package Com.BridgeIt.DataStructurePrograms;

import Com.BridgeIt.Utility.DataStructureUtility;

public class PrimeAnagramStackLinkedList 
{
	//main meethod of class.
   public static void main(String[] args)
	{
	        Stack<Integer>stack=new Stack<Integer>();
			int res[]=DataStructureUtility .primeAnagrams(1000);
			for(int i=res.length-1;i>=0;i--)
				//result  push in stack
				stack.push(res[i]);
			   //stack will display here
				stack.display();
		}
	}


