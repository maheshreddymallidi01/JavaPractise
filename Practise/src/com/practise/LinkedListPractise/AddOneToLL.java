package com.practise.LinkedListPractise;

public class AddOneToLL {

	public static void main(String[] args) {
		int[] arr = {1,5,9};
		Node head = SinglyLinkedList.convertToLL(arr);
		Node afterAddingOne = addOneToLL(head);
		SinglyLinkedList.printLL(afterAddingOne);
	}
	
	private static Node addOneToLL(Node head) {
		int carry = findCarry(head);
		if(carry==1) {
			Node newHead = new Node(1);
			newHead.next=head;
			head=newHead;
		}
		return head;
	}

	private static int findCarry(Node temp) {
		if(temp==null) {
			return 1;
		}
		int carry = findCarry(temp.next);
		temp.data+=carry;
		if(temp.data<10) return 0;
		temp.data=0;
		return 1;
	}
}
