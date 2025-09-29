package com.practise.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepth {

	public static void main(String[] args) {
		Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(maximumDepth(root));
	}
	
	private static int maximumDepth(Node root) {
		if(root==null) {
			return 0;
		}
		
		int depth = 0;
		
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i=0;i<size;i++) {
				Node node = q.poll();
				if(node.left!=null) q.offer(node.left);
				if(node.right!=null) q.offer(node.right);
			}
			depth++;
		}
		return depth;
	}
}
