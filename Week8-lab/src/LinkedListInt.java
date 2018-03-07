import java.util.ArrayList;
import java.util.Collections;

public class LinkedListInt {

	

	
	//Instance Variables
	private Node head;
	
	
	
	
	public LinkedListInt(int item) { //main constructor
		
	head = new Node();
	head.value=item;
	head.link=null;
	
	}
	

	
	//Appends item to the back of the list
	public boolean insertItemAtBack(int item) {
		
		//If head is null which will be true, add new node to head
		if (head == null && true){ 

			Node empty = new Node(); //create a new node
			empty.value = item;
			head = empty; 
			return true;
			}
			
		//this will start from the node head
			Node curr = head; 
			

			while (curr.link !=null){ //current.link will always be null until the end is reached

			curr = curr.link;
			}
			
			//Now we are at the end of the linked list where we add the new node
			Node newNode = new Node(); //now that we are at the end create a new node that will add item
			newNode.value = item;
			curr.link = newNode;
			
			return true;
	}
	
	
	public boolean insertItemAtFront(int item) { //adds item to fron of the list
	
	
		//Create new head node
		Node frontHead = new Node();
		frontHead.value = item; //it will hold the value of item
		
		//Old head value will move one up to be the second position
		frontHead.link = head;
		
		//change head pointer to link to new head node we created
		head = frontHead;
		return true;
	}
	
	//Delete the number given from the list
	public boolean deleteItem(int item) {
		
		//if head is null, then we reached teh end and nothing we can do
		if (head == null)
			return false;
		if (head.value == item) { //find the item that the user is trying to delete
			head = head.link; //the link will be set between the previous and next head
			return true;
		}
		
		//starting from head 
		Node curr = head;
		
		//
		while (curr.link != null) { //this will loop through the list
		
			if (curr.link.value == item) {//if we have found the node before the node of item
			
				curr.link = curr.link.link; // set the link to the node after item
				return true;
		}
			
			curr = curr.link;
		}
		
		return false;
	
	}
	
	//Print numbers in list
	public void printList() {
	
		//Start from head of list
		Node current = head;
		
		//Cycle through all the list
		while (current !=null) {
			
			//Print value of current node
			System.out.println(current.value);
			
			//move on to next node
			current = current.link;
		}
	}
	
	//Sorts the list into descending order
	public void sortListDesc() {

		//Create array list to store all numbers in list
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		//Start from head of list
Node current = head;

//Cycle through list, adding each number to array list
		
		while (current !=null) {
			
			//add to array list
			list.add(current.value);
			
			//move to next node
			current = current.link;
		}
		
		//sort the array list
		Collections.sort(list);
		
		//reverse the array list
		Collections.reverse(list);
		
		//point to head of list
		current = head;
		
		//starting from first slot in array list, put each number into linked list
		int i = 0;
		
while (current !=null) {
			
	//put value from the array into a linked list
	current.value = list.get(i);
	
	//move to next node
			current = current.link;
			
			//move to next array slot value
			i++;
		}
	}
	public class Node { //class for node
		
		 public int value;
		 Node link;
	}
	
}