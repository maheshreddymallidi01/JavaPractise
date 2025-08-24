package com.practise.LinkedListPractise;

public class SortZeroOneTwoInLL {

	public static void main(String[] args) {
		int[] arr = {1,0,2,0,2,1};
		Node head = SinglyLinkedList.convertToLL(arr);
		Node afterSort = sortLL(head);
		SinglyLinkedList.printLL(afterSort);
	}
	
	private static Node sortLL(Node head) {
		Node zeroHead = new Node(-1);
		Node zeroTail=zeroHead;
		Node oneHead = new Node(-1);
		Node oneTail=oneHead;
		Node twoHead = new Node(-1);
		Node twoTail=twoHead;
		Node temp = head;
		while(temp!=null) {
			if(temp.data==0) {
				zeroTail.next=temp;
				zeroTail=temp;
			}else if(temp.data==1){
				oneTail.next=temp;
				oneTail=temp;
			}else {
				twoTail.next=temp;
				twoTail=temp;
			}
			temp=temp.next;
		}
		
		zeroTail.next=oneHead.next!=null?oneHead.next:twoHead.next;
		oneTail.next=twoHead.next;
		twoTail.next=null;
		
		Node newHead = zeroHead.next;
		return newHead;
	}

}
