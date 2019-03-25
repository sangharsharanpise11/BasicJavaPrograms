/**
 * Created by :Sangharsha Ranpise.
 * Date :14/03/2019.
 * Purpose :this class is used in another classes.
 */
package Com.BridgeIt.DataStructurePrograms;

public class Queue<T> 
	{
		Node head;
		int length = 0;
		class Node<T>
		{
			T data;
			Node next;
		    Node(T data)
			{
				this.data = data;
				next = null;
			}
			
		}
		

	//add element in queue

	public Node enque(T data)
	{
		
		Node new_node = new Node(data);  //create new node
		Node temp = head;
		if(head == null)  // if no element present in queue new node will be head
		{
			head = new_node;
			length++;
			return head;
		}
		while(temp.next != null) // traverse till last node
		{
			temp = temp.next;
		}
		temp.next = new_node; // add element after present element
		length++;
		new_node.next = null;
		return head;
	}

	//remove first in element

	public String deque()
	{
		Node temp=head;
		if(length == 0)  //if queue is empty
		{
			System.out.println("No element present in List");
			return " ";
		}
		head = head.next;  //else shift head to next node
		length--;
		return (String) temp.data;
		
	}

	//check queue is empty or not

	public boolean isEmpty()
	{
		return(length == 0);
	}

	//find size 
	public int size()
	{
		return length;
	}

	//return first element from queue

	public <T>T topElement()
	{
		return (T)head.data;
	}

	//print queue
	public void display()
	{
		Node new_node = head;
		int size = size();
		for(int i = 0 ; i <size;i++)  //traverse till last
		{
			System.out.print(new_node.data+" ");
			new_node = new_node.next;
			
		}
		
		return;
	}
}
