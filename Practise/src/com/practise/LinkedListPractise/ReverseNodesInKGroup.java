package com.practise.LinkedListPractise;

public class ReverseNodesInKGroup {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int k = 3;
		Node head = SinglyLinkedList.convertToLL(arr);
		Node afterReversing = reverseInKGroup(head,k);
		SinglyLinkedList.printLL(afterReversing);
	}
	
	private static Node reverseInKGroup(Node head,int k) {
		Node temp = head;
		Node prevNode = null;
		while(temp!=null) {
			Node kNode = findKthNode(temp,k);
			if(kNode==null) {
				if(prevNode!=null) {
					prevNode.next=temp;
				}
				break;
			}
			Node nextNode = kNode.next;
			kNode.next=null;
			reverse(temp);
			if(temp==head) {
				head = kNode;
			}else {
				prevNode.next=kNode;
			}
			prevNode=temp;
			temp=nextNode;
		}
		return head;
	}

	private static void reverse(Node head) {
		Node temp = head;
		Node prev = null;
		while(temp!=null) {
			Node front = temp.next;
			temp.next=prev;
			prev=temp;
			temp=front;
		}
	}
	
	private static Node findKthNode(Node temp,int k) {
		k -= 1;
		while(temp!=null&&k>0) {
			temp=temp.next;
			k--;
		}
		return temp;
	}
}
