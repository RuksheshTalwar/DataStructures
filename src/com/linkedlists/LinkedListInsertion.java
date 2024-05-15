package com.linkedlists;

/**
 * 
 * @author rukshesh.talwar
 * Custom Linked List insertion at the front
 *
 */
public class LinkedListInsertion {

	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
		
	}
	
	void printList() {
		Node n = head;
		while(n !=null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedListInsertion linkedList = new LinkedListInsertion();
		linkedList.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		linkedList.head.next = second;
		second.next = third;
		System.out.println("******Before pushing node*****");
		linkedList.printList();
		System.out.println();
		System.out.println("******After pushing node*****");
		linkedList.push(4);
		linkedList.printList();
	}
}
