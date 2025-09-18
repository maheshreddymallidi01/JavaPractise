package com.practise.Trees;

class Node{
	int data;
	Node left;
	Node right;
	
	Node(int key){
		this.data=key;
		this.left=null;
		this.right=null;
	}
}

public class TreeRepresentation {

	public static void main(String[] args) {
		Node root = new Node(1);
		
		root.left = new Node(2);
		
		root.right = new Node(3);
		
		root.right.left = new Node(4);
	}

}
