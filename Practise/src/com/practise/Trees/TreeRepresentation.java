package com.practise.Trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        List<Integer> preOrder = new ArrayList<>();
        preOrder(root,preOrder);
        
        System.out.println("PreOrder::"+preOrder);
        
        List<Integer> inOrder = new ArrayList<>();
        inOrder(root,inOrder);
        
        System.out.println("InOrder::"+inOrder);
        
        List<Integer> postOrder = new ArrayList<>();
        postOrder(root,postOrder);
        
        System.out.println("PostOrder::"+postOrder);
     
        List<Integer> levelOrder = levelOrder(root);
        System.out.println("LevelOrder::"+levelOrder);
        
        List<List<Integer>> levelOrderByLevels = levelOrderByLevels(root);
        System.out.println("LevelOrderByLevels::"+levelOrderByLevels);
	}
	
	private static void preOrder(Node root,List<Integer> arr){
		if(root==null) {
			return;
		}
		
		arr.add(root.data);
		preOrder(root.left,arr);
		preOrder(root.right,arr);
	}
	
	private static void inOrder(Node root,List<Integer> arr){
		if(root==null) {
			return;
		}
		
		inOrder(root.left,arr);
		arr.add(root.data);
		inOrder(root.right,arr);
	}

	private static void postOrder(Node root,List<Integer> arr){
		if(root==null) {
			return;
		}
		
		postOrder(root.left,arr);
		postOrder(root.right,arr);
		arr.add(root.data);
	}
	
	private static List<Integer> levelOrder(Node root){
		List<Integer> res = new ArrayList<>();
		Queue<Node> q = new ArrayDeque<>();
	
		q.offer(root);
		while(!q.isEmpty()) {
			Node current = q.poll();
			res.add(current.data);
			
			if(current.left!=null) q.offer(current.left);
			if(current.right!=null) q.offer(current.right);
		}
		return res;
	}
	
	private static List<List<Integer>> levelOrderByLevels(Node root){
		List<List<Integer>> res = new ArrayList<>();
		Queue<Node> q = new ArrayDeque<>();
		
		q.offer(root);
		while(!q.isEmpty()) {
			int size = q.size();
			List<Integer> level = new ArrayList<>();
			
			for(int i=0;i<size;i++) {
				Node current = q.poll();
				
				level.add(current.data);
				
				if(current.left!=null) q.offer(current.left);
				if(current.right!=null) q.offer(current.right);
			}
			
			res.add(level);
		}
		return res;
	}
}

