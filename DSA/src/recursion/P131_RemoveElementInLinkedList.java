package recursion;

import org.junit.Test;

import linkedList.Node;

public class P131_RemoveElementInLinkedList {
	/*
		Problem Statement
		Given the head of a linked list and an integer val, remove all the nodes of the linked
	    list that has Node.val == val, and return the new head.
	
	*/

	/*
	   1. 
	  	  Input(s) ? LinkedList Head, int val 
		  Output ?  LinkedList Head
		  Constraint(s) ? Using recursion
	   
	   2. Test data
			Positive : 1,2,3,4,5,4  val = 4 
			Negative :	1,1,1,1 val  = 2
			Edge     : 1,1,1,1 val  = 1
	
	   3.  Approaches Known 
			 Approach 1 : Using LinkedList extra new nodes
	
	   4.  O - Notation 
			 Approach 1 : 
	
	   5.  Pseudocode		
	
	 */

	// Test data(s)
	@Test
	public void testData01()
	{
		Node head = new Node(1);
		head.next = head.addNode(2);
		head.next.next = head.addNode(3);
		head.next.next.next = head.addNode(4);
		head.next.next.next.next = head.addNode(5);
		head.next.next.next.next.next = head.addNode(4);
		int val = 4;
		Node res = removeNodeUsingRecursion(head, val);
		head.printAllNodes(res);
		
	}
	
	@Test
	public void testData02()
	{
		Node head = new Node(1);
		head.next = head.addNode(1);
		head.next.next = head.addNode(1);
		head.next.next.next = head.addNode(1);
		int val = 2;
		Node res = removeNodeUsingRecursion(head, val);
		head.printAllNodes(res);
	}
	
	@Test
	public void testData03()
	{
		Node head = new Node(0);
		head.next = head.addNode(1);
		head.next.next = head.addNode(1);
		head.next.next.next = head.addNode(1);
		int val = 1;
		Node res = removeNodeUsingRecursion(head, val);
		head.printAllNodes(res);
	}
	
	Node node = new Node(0);
	Node moveNode = node;
	private Node removeNodeUsingRecursion(Node head, int val) {
	   moveNode.next = null;
       if(head==null) return node.next;
       if(head.value != val) {
    	   moveNode.next = head;
           moveNode = moveNode.next;   
       }
       return removeNodeUsingRecursion(head.next, val);
	}
	
	
}
