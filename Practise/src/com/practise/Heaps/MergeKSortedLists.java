package com.practise.Heaps;

import java.util.PriorityQueue;

class Node{
	int val;
	Node next;
	
	Node(int val){
		this.val = val;
		this.next = null;
	}
}

public class MergeKSortedLists {

	public static void main(String[] args) {
		Node n1 = new Node(1);
		n1.next = new Node(4);
		n1.next.next = new Node(5);
		
		Node n2 = new Node(1);
		n2.next = new Node(2);
		n2.next.next = new Node(3);
		
		Node n3 = new Node(3);
		n3.next = new Node(6);
		
		Node[] nodeList = {n1,n2,n3};
		Node result = mergedKSortedLists(nodeList);
		
		while(result !=null) {
			System.out.print(result.val+" ");
			result = result.next;
		}
	}

	
	private static Node mergedKSortedLists(Node[] nodeList) {
		PriorityQueue<Node> minHeap = new PriorityQueue<>((a,b)->a.val-b.val);
		
		for(Node head:nodeList) {
			if(head!=null) {
				minHeap.add(head);
			}
		}
		
		Node dummy = new Node(-1);
		Node temp = dummy;
		while(!minHeap.isEmpty()) {
			Node smallest = minHeap.poll();
			temp.next = smallest;
			temp = temp.next;
			
			if(smallest.next!=null) {
				minHeap.add(smallest.next);
			}
		}
		
		return dummy.next;
	}
}
