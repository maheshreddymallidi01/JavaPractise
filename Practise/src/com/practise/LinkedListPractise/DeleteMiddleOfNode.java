package com.practise.LinkedListPractise;

public class DeleteMiddleOfNode {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		Node head = SinglyLinkedList.convertToLL(arr);
		Node afterDelete = deleteMiddleOfNode(head);
		SinglyLinkedList.printLL(afterDelete);
	}

	private static Node deleteMiddleOfNode(Node head) {
		if(head==null||head.next==null) {
			return null;
		}
		
		Node slow = head;
		Node fast = head.next.next;
		
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		
		slow.next=slow.next.next;
		return head;
	}
}
