/**
 * Created By :Sangharsha Ranpise.
 * Date :14/03/2019.
 * Purpose :Add the Prime Numbers that are Anagram in the Range of 0 - 1000 in a Queue using the Linked List and 
 * Print the Anagrams from the Queue Note no Collection Library can be used.
 */
package Com.BridgeIt.DataStructurePrograms;

import Com.BridgeIt.Utility.DataStructureUtility;

public class PrimeAnagramQueueLinkedList 
 {
	//main class of program
	public static void main(String[] args)
	{
		Queue<Integer>queue=new Queue<Integer>();
		//calling prime Anagram method to check prime and anagram.
		int res[]=DataStructureUtility .primeAnagrams(1000);
		for(int i=0;i<res.length;i++)
			//add elements in queue
			queue.enque(res[i]);
		   //display queue
		    queue.display();
	}

}