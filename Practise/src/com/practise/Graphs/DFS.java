package com.practise.Graphs;

import java.util.ArrayList;
import java.util.List;

public class DFS {

	public static void main(String[] args) {
		List<List<Integer>> graph = new ArrayList<>();
		
		for(int i=0;i<6;i++) {
			graph.add(new ArrayList<>());
		}
		
		graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(2).add(4);
        graph.get(3).add(5);
        
        boolean[] visited = new boolean[graph.size()];
        dfs(0,graph,visited);
	}

	private static void dfs(int node, List<List<Integer>> graph, boolean[] visited) {
		visited[node] = true;
		System.out.print(node+" ");
		
		for(int val:graph.get(node)) {
			if(!visited[val]) {
				dfs(val,graph,visited);
			}
		}
	}
	
	
	/*public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 4);
        addEdge(graph, 3, 5);

        Set<Integer> visited = new HashSet<>();
        dfs(0, graph, visited);
    }

    private static void addEdge(Map<Integer, List<Integer>> graph, int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    private static void dfs(int node, Map<Integer, List<Integer>> graph, Set<Integer> visited) {
        visited.add(node);
        System.out.print(node + " ");

        for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, graph, visited);
            }
        }*/
    

}
