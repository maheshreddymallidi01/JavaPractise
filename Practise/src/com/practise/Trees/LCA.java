package com.practise.Trees;

public class LCA {

	public static void main(String[] args) {
		Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        Node p = root.left.left;
        Node q = root.right.right;
        
        Node lca = findLowestCommonAncestor(root,p,q);
        System.out.println(lca.data);
	}
	
	private static Node findLowestCommonAncestor(Node root, Node p, Node q) {
		if(root==null||root==p||root==q) {
			return root;
		}
		
		Node left = findLowestCommonAncestor(root.left,p,q);
		Node right = findLowestCommonAncestor(root.right,p,q);
		
		if(left==null) {
			return right;
		}else if(right==null) {
			return left;
		}else {
			return root;
		}
	}

}
