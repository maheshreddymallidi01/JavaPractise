package com.practise.LinkedListPractise;

public class Palindrome {

	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(2);
		Node fifth = new Node(1);
		
		head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		
		System.out.println(palindrome(head));
	}
	
	private static boolean palindrome(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast.next!=null&&fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		Node newHead = reverse(slow.next);
		Node first = head;
		Node second = newHead;
		while(second!=null) {
			if(first.data!=second.data) {
				reverse(newHead);
				return false;
			}
			first=first.next;
			second=second.next;
		}
		reverse(newHead);
		return true;
	}
	
	private static Node reverse(Node head) {
		if(head==null||head.next==null) {
			return head;
		}
		Node newHead = reverse(head.next);
		Node front = head.next;
		front.next=head;
		head.next=null;
		return newHead;
	}

}
