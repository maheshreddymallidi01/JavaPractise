package com.practise.Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class Node{
	int val;
	List<Node> neighbors;
	
	public Node() {
		this.val = 0;
		this.neighbors = new ArrayList<>();
	}
	
	public Node(int val) {
		this.val = val;
		this.neighbors = new ArrayList<>();
	}
	
	public Node(int val, ArrayList<Node> neighbors) {
		this.val = val;
		this.neighbors = neighbors;
	}
}

public class CloneGraph {

	public static void main(String[] args) {
		Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);

        node2.neighbors.add(node1);
        node2.neighbors.add(node3);

        node3.neighbors.add(node2);
        node3.neighbors.add(node4);

        node4.neighbors.add(node1);
        node4.neighbors.add(node3);
        
        Node clonedGraph = cloneGraph(node1);
        printClonedGraph(clonedGraph,new HashSet<>());
        
        
        Node clonedGraphBFS = cloneGraphBFS(node1);
        printClonedGraph(clonedGraphBFS,new HashSet<>());
	}
	
	private static Node cloneGraph(Node node) {
		if(node==null)
			return null;
		
		Map<Node, Node> cloneMap = new HashMap<>();
		return dfs(node,cloneMap);
	}

	private static Node dfs(Node node, Map<Node,Node> cloneMap) {
		if(cloneMap.containsKey(node)) {
			return cloneMap.get(node);
		}
		
		Node clone = new Node(node.val);
		
		cloneMap.put(node, clone);
		
		for(Node neighbors:node.neighbors) {
			clone.neighbors.add(dfs(neighbors,cloneMap));
		}
		
		return clone;
	}
	
	private static void printClonedGraph(Node node, Set<Node> visited) {
		if(node==null||visited.contains(node)) {
			return;
		}
		
		visited.add(node);
		
		System.out.print(node.val+" ");
		
		for(Node neighbors:node.neighbors) {
			System.out.print(neighbors.val+" ");
		}
		
		System.out.println();
		
		for(Node neighbors:node.neighbors) {
			printClonedGraph(neighbors, visited);
		}
	}
	
	private static Node cloneGraphBFS(Node node) {
		if(node==null)
			return null;
		
		Map<Node, Node> map = new HashMap<>();
		Queue<Node> queue = new LinkedList<>();
		
		Node clone = new Node(node.val);
		map.put(node, clone);
		queue.add(node);
		
		while(!queue.isEmpty()) {
			Node current = queue.poll();
			Node clonedCurrent = map.get(current);
			
			for(Node neigh:current.neighbors) {
				if(!map.containsKey(neigh)) {
					map.put(neigh, new Node(neigh.val));
					queue.add(neigh);
				}
				clonedCurrent.neighbors.add(map.get(neigh));
			}
		}
		
		return clone;
	}
}
