package com.practise.LinkedListPractise;

public class RemoveNthNodeFromLast {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int n = 3;
		Node head = SinglyLinkedList.convertToLL(arr);
		Node afterRemoval = removeNthNodeFromLast(head,n);
		SinglyLinkedList.printLL(afterRemoval);
	}

	private static Node removeNthNodeFromLast(Node head,int n) {
		Node slow = head;
		Node fast = head;
		
		for(int i=0;i<n;i++) {
			fast = fast.next;
		}
		
		if(fast==null) {
			return head.next;
		}
		
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next;
		}
		
		slow.next=slow.next.next;
		return head;
	}
}
