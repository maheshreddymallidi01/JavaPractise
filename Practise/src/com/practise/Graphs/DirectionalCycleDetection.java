package com.practise.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DirectionalCycleDetection {

	static List<List<Integer>> graph;
	static boolean[] visited;
	static boolean[] recStack;
	
	public static void main(String[] args) {
		int n = 5;
		graph = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			graph.add(new ArrayList<>());
		}
		
		addEdge(0,1);
		addEdge(1,2);
		addEdge(2,0);
		addEdge(2,3);
		
        if(containsCycle(n)) {
        	System.out.println("Cycle is Detected");
        }else {
        	System.out.println("Cycle is not detected");
        }

        
        if(containsCycleBFS(n)) {
        	System.out.println("Cycle is Detected");
        }else {
        	System.out.println("Cycle is not detected");
        }
	}
	
	private static boolean containsCycle(int n) {
		visited = new boolean[n];
		recStack = new boolean[n];
		
		for(int i=0;i<n;i++) {
			if(!visited[i]) {
				if(dfs(i)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	
	private static boolean dfs(int node) {
		visited[node] = true;
		recStack[node] = true;
		
		for(int neigh:graph.get(node)) {
			if(!visited[neigh]) {
				if(dfs(neigh)) {
					return true;
				}
			}
			else if(recStack[neigh]==true) {
				return true;
			}
		}
		
		recStack[node] = false;
		return false;
	}
	
	
	private static boolean containsCycleBFS(int n) {
		int[] inDegree = new int[n];
		
		for(int i=0;i<n;i++) {
			for(int neigh:graph.get(i)) {
				inDegree[neigh]++;
			}
		}
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=0;i<n;i++) {
			if(inDegree[i]==0) {
				queue.add(i);
			}
		}
		
		int count = 0;
		
		while(!queue.isEmpty()) {
			int node = queue.poll();
			count++;
			
			for(int neigh:graph.get(node)) {
				inDegree[neigh]--;
				if(inDegree[neigh]==0) {
					queue.add(neigh);
				}
			}
		}
		
		return count!=n;
	}
	
	
	private static void addEdge(int u,int v) {
		graph.get(u).add(v);
	}

}
