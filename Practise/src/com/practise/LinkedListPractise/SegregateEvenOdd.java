package com.practise.LinkedListPractise;

public class SegregateEvenOdd {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		Node head = SinglyLinkedList.convertToLL(arr);
		Node afterEvenOdd = evenOdd(head);
		SinglyLinkedList.printLL(afterEvenOdd);
	}
	
	private static Node evenOdd(Node head) {
		Node oddHead = new Node(-1);
		Node oddTail = oddHead;
		Node evenHead = new Node(-1);
		Node evenTail = evenHead;
		Node current = head;
		Node temp = head;
		while(current!=null) {
			temp = current;
			current=current.next;
			temp.next=null;
			if(temp.data%2!=0) {
				oddTail.next=temp;
				oddTail=oddTail.next;
			}else {
				evenTail.next=temp;
				evenTail=evenTail.next;
			}
		}
		evenTail.next=oddHead.next;
		return evenHead.next;
	}

}
