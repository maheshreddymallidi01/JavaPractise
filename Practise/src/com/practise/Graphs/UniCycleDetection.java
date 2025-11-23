package com.practise.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class NodeParent{
	int node;
	int parent;
	
	public NodeParent(int node,int parent) {
		this.node = node;
		this.parent = parent;
	}
}

public class UniCycleDetection {

	static List<List<Integer>> graph = new ArrayList<>();
	static boolean[] visited;
	
	public static void main(String[] args) {
		int n = 5;
		visited = new boolean[n];
		
		for(int i=0;i<n;i++) {
			graph.add(new ArrayList<>());
		}
		
		addEdge(0,1);
		addEdge(1,2);
		addEdge(2,3);
		addEdge(3,0);
		addEdge(3,4);
		
		if(containsCycleDFS(n)) {
			System.out.println("Cycle Detected");
		}else {
			System.out.println("Cycle not detected");
		}
		
		Arrays.fill(visited, false);
		if(containsCycleBFS(n)) {
			System.out.println("Cycle Detected");
		}else {
			System.out.println("Cycle not detected");
		}
	}

	private static boolean containsCycleDFS(int n) {
		for(int i=0;i<n;i++) {
			if(!visited[i]) {
				if(hasCycleDFS(i,-1)) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean hasCycleDFS(int i,int parent) {
		visited[i] = true;
		
		for(int neigh:graph.get(i)) {
			if(!visited[neigh]) {
				if(hasCycleDFS(neigh, i)) return true;
			}
			else if(neigh!=parent) {
				return true;
			}
		}
		
		return false;
	}
	
	private static boolean containsCycleBFS(int n) {
		for(int i=0;i<n;i++) {
			if(!visited[i]) {
				if(hasCycleBFS(i)) {
					return true;
				}
			}
		}
		return false;
	}
	
	private static boolean hasCycleBFS(int start) {
		visited[start] = true;
		Queue<NodeParent> queue = new LinkedList<>();
		
		queue.add(new NodeParent(start, -1));
		
		while(!queue.isEmpty()) {
			NodeParent current = queue.poll();
			int node = current.node;
			int parent = current.parent;
			
			for(int neigh:graph.get(node)) {
				if(!visited[neigh]) {
					visited[neigh]=true;
					queue.add(new NodeParent(neigh,node));
				}
				else if(neigh!=parent) {
					return true;
				}
			}
		}
		return false;
	}
	
	private static void addEdge(int u,int v) {
		graph.get(u).add(v);
		graph.get(v).add(u);
	}

}
