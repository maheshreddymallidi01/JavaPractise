package com.practise.Trees;

public class HeightOfTree {

	public static void main(String[] args) {
		 Node root = new Node(1);
	        root.left = new Node(2);
	        root.right = new Node(3);
	        root.left.left = new Node(4);
	        root.left.right = new Node(5);
	        root.left.right.right = new Node(6);
	        root.left.right.right.right = new Node(7);
	        
	        System.out.println(maximumHeight(root));
	}

	private static int maximumHeight(Node node) {
		if(node==null) {
			return 0;
		}
		int left = maximumHeight(node.left);
		int right = maximumHeight(node.right);
		
		return 1+Math.max(left, right);
	}
}
