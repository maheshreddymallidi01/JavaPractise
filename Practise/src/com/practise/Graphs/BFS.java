package com.practise.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

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

        bfs(0, graph);
	}
	
	private static void bfs(int start, List<List<Integer>> graph) {
		boolean[] visited = new boolean[graph.size()];
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(start);
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			int current = queue.poll();
			System.out.print(current+" ");
			
			for(int val:graph.get(current)) {
				if(!visited[val]) {
					visited[val] = true;
					queue.add(val);
				}
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

        bfs(0, graph);
    }

    // Add edge — undirected graph
    private static void addEdge(Map<Integer, List<Integer>> graph, int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    // BFS Function
    private static void bfs(int start, Map<Integer, List<Integer>> graph) {

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            // Loop through neighbors
            for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }*/

}
