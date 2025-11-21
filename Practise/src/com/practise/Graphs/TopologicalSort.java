package com.practise.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class TopologicalSort {

	public static void main(String[] args) {
		int n = 6;
		List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(5).add(2);
        graph.get(5).add(0);
        graph.get(4).add(0);
        graph.get(4).add(1);
        graph.get(2).add(3);
        graph.get(3).add(1);

        System.out.println(topoSortBFS(n,graph));
        System.out.println(topoSortDFS(n,graph));
	}

	private static List<Integer> topoSortBFS(int n, List<List<Integer>> graph) {
		int[] degree = new int[n];
		
		for(int i=0;i<n;i++) {
			for(int neigh:graph.get(i)) {
				degree[neigh]++;
			}
		}
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i=0;i<n;i++) {
			if(degree[i]==0) {
				queue.add(i);
			}
		}
		
		List<Integer> result = new ArrayList<>();
		while(!queue.isEmpty()) {
			int current = queue.poll();
			result.add(current);
			
			for(int neigh:graph.get(current)) {
				degree[neigh]--;
				if(degree[neigh]==0) {
					queue.add(neigh);
				}
			}
		}
		
		return result;
	}
	
	private static List<Integer> topoSortDFS(int n,List<List<Integer>> graph){
		boolean[] visited = new boolean[n];
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<n;i++) {
			if(!visited[i]) {
				dfs(i,graph,visited,stack);
			}
		}
		
		List<Integer> result = new ArrayList<>();
		while(!stack.isEmpty()) {
			result.add(stack.pop());
		}
		
		return result;
	}

	private static void dfs(int i, List<List<Integer>> graph, boolean[] visited, Stack<Integer> stack) {
		visited[i]=true;
		
		for(int neigh:graph.get(i)) {
			if(!visited[neigh]) {
				dfs(neigh,graph,visited,stack);
			}
		}
		
		stack.push(i);
	}

}
