package com.practise.LinkedListPractise;

public class RotateLL {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int k = 2;
		Node head = SinglyLinkedList.convertToLL(arr);
		Node afterRotating = rotateToRight(head,k);
		SinglyLinkedList.printLL(afterRotating);
	}
	
	private static Node rotateToRight(Node head,int k) {
		if(head==null||head.next==null||k==0) {
			return head;
		}
		Node temp = head;
		int len = 1;
		while(temp.next!=null) {
			temp=temp.next;
			len++;
		}
		
		temp.next=head;
		k = k%len;
		int end = len-k;
		while(end--!=0) {
			temp=temp.next;
		}
		head=temp.next;
		temp.next=null;
		return head;
	}

}
