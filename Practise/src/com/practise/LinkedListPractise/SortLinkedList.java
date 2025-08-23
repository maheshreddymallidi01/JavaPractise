package com.practise.LinkedListPractise;

public class SortLinkedList {

	public static void main(String[] args) {
		int[] arr = {2,4,7,5,3,8,6};
		Node head = SinglyLinkedList.convertToLL(arr);
		Node afterSort = sortLL(head);
		SinglyLinkedList.printLL(afterSort);
	}

	private static Node sortLL(Node head) {
		if(head==null||head.next==null) {
			return head;
		}
		Node middle = findMiddle(head);
		Node left = head;
		Node right = middle.next;
		middle.next=null;
		left=sortLL(left);
		right=sortLL(right);
		return mergeLL(left,right);
	}
	
	private static Node mergeLL(Node left,Node right) {
		Node dummy = new Node(-1);
		Node temp=dummy;
		while(left!=null&&right!=null) {
			if(left.data<right.data) {
				temp.next=left;
				temp=left;
				left=left.next;
			}else {
				temp.next=right;
				temp=right;
				right=right.next;
			}
		}
		if(left!=null) {
			temp.next=left;
		}else {
			temp.next=right;
		}
		return dummy.next;
	}
	
	private static Node findMiddle(Node head) {
		Node slow = head;
		Node fast = head.next;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
}
