package com.practise.Trees;

public class MaximumPathSum {

	static int maximum = 0;
	public static void main(String[] args) {
		Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        
        findMax(root);
        System.out.println(maximum);
	}

	private static int findMax(Node node) {
		if(node==null) {
			return 0;
		}
		
		int left = Math.max(0, findMax(node.left));
		int right = Math.max(0, findMax(node.right));
		
		maximum = Math.max(maximum, node.data+left+right);
		
		return node.data+Math.max(left, right);
	}
}
