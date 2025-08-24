package com.practise.LinkedListPractise;

public class FindInterSectionOfLL {

	public static void main(String[] args) {
		Node list1 = new Node(1);
		Node two = new Node(2);
		Node eight = new Node(8);
		Node seven = new Node(7);
		Node six = new Node(6);
		Node list2 = new Node(2);
		Node eighth = new Node(8);
		Node three = new Node(3);
		Node five = new Node(5);
		
		list1.next=two;
		two.next=eight;
		eight.next=seven;
		seven.next=six;
		
		list2.next=eighth;
		eighth.next=three;
		three.next=five;
		five.next=eight;
		
		Node intersectingNode = findInterSectingNode(list1,list2);
		SinglyLinkedList.printLL(intersectingNode);
	}
	
	private static Node findInterSectingNode(Node list1,Node list2) {
		Node a = list1;
		Node b = list2;
		
		while(a!=b) {
			a=a.next==null?list2:a.next;
			b=b.next==null?list1:b.next;
		}
		return a;
	}

}
