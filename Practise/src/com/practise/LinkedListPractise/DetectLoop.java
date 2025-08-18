package com.practise.LinkedListPractise;

public class DetectLoop {

	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		Node sixth = new Node(6);
		Node seventh = new Node(7);
		Node eighth = new Node(8);
		Node ninth = new Node(9);
		
		head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth;
		sixth.next=seventh;
		seventh.next=eighth;
		eighth.next=ninth;
		ninth.next=third;
		
		System.out.println(detectLoop(head));
		
		Node temp = detectStartOfLoop(head);
		System.out.println(temp.data);
		
		System.out.println(findLengthOfLoop(head));
	}
	
	private static int findLengthOfLoop(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				return findLength(slow,fast);
			}
		}
		return 0;
	}
	
	private static int findLength(Node slow,Node fast) {
		int cnt=1;
		fast=fast.next;
		while(slow!=fast) {
			cnt++;
			fast=fast.next;
		}
		return cnt;
	}
	
	private static Node detectStartOfLoop(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				slow = head;
				while(slow!=fast) {
					slow=slow.next;
					fast=fast.next;
				}
				return slow;
			}
		}
		return null;
	}
	
	private static boolean detectLoop(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;
	}

}
