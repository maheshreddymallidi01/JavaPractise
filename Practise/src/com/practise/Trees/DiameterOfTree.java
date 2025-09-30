package com.practise.Trees;

public class DiameterOfTree {

	public static class Result{
		int maximumDiameter = 0;
	}
	
	public static void main(String[] args) {
		 Node root = new Node(1);
	        root.left = new Node(2);
	        root.right = new Node(3);
	        root.left.left = new Node(4);
	        root.left.right = new Node(5);
	        root.left.right.right = new Node(6);
	        root.left.right.right.right = new Node(7);
	        System.out.println(findDiameter(root));
	}
	
	private static int findDiameter(Node root) {
		Result result = new Result();
		findHeight(root,result);
		return result.maximumDiameter;
	}
	
	private static int findHeight(Node node,Result result) {
		if(node==null) {
			return 0;
		}
		
		int left = findHeight(node.left,result);
		int right = findHeight(node.right,result);
		
		result.maximumDiameter = Math.max(result.maximumDiameter, left+right);
		
		return 1+Math.max(left, right);
	}

}
