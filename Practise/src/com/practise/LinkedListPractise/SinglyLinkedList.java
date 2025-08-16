package com.practise.LinkedListPractise;

class Node{
	int data;
	Node next;
	
	Node(int data,Node next){
		this.data=data;
		this.next=next;
	}
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

public class SinglyLinkedList {

	public static void main(String[] args) {
		int[] arr = {3,5,7,9};
		Node head = convertToLL(arr);
		printLL(head);
		int k = 3;
		deleteElementAtK(head,k);
		printLL(head);
		Node mmr = insertK(head);
		printLL(mmr);
		int element = 6;
		Node elementAtK = insertElementAtK(head,k,element);
		printLL(elementAtK);
		
		int[] arr2 = {1,2,3,4,5};
		Node middle = convertToLL(arr2);
		System.out.println(middleofLL(middle));
	}
	
	private static int middleofLL(Node middle) {
		Node slow = middle;
		Node fast = middle;
		while(fast!=null&&fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
	
	private static Node insertK(Node head) {
		Node temp = new Node(6);
		temp.next=head;
		return temp;
	}
	
	private static Node insertElementAtK(Node head,int k,int element) {
		if(head==null) {
			if(k==1) {
				return new Node(element);
			}
			else {
				return head;
			}
		}
		if(k==1) {
			return new Node(element,head);
		}
		Node temp = head;
		Node prev = null;
		int cnt = 1;
		while(temp!=null){
			if(cnt == k) {
				Node newNode=new Node(element,prev.next);
				prev.next=newNode;
				break;
			}
			else {
				prev = temp;
				temp=temp.next;
			}
			cnt++;
		}
		return head;
	}
	
	private static void deleteElementAtK(Node head, int k) {
		if(head ==null) {
			return;
		}
		if(k==1) {
			head = head.next;
		}
		Node temp = head;
		Node prev = null;
		int cnt = 1;
		while(temp!=null) {
			if(cnt == k) {
				prev.next = prev.next.next;
				temp.next=null;
				break;
			}else {
				prev = temp;
				temp = temp.next;
			}
			cnt++;
		}
	}
	
	private static Node convertToLL(int[] arr) {
		Node head = new Node(arr[0]);
		Node mover = head;
		for(int i=1;i<arr.length;i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = mover.next;
		}
		return head;
	}
	
	private static void printLL(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}

}
