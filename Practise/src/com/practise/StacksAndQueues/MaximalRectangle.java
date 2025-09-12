package com.practise.StacksAndQueues;

import java.util.*;

public class MaximalRectangle {
   
	public static int maximalRectangle(int[][] matrix) {
        if (matrix.length == 0) return 0;

        int n = matrix[0].length;
        int[] heights = new int[n];
        int maxArea = 0;

        for (int[] row : matrix) {
            // Build histogram heights
            for (int j = 0; j < n; j++) {
                if (row[j] == 1) {
                    heights[j] += 1;
                } else {
                    heights[j] = 0;
                }
            }
            // Compute max area for this histogram
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }

        return maxArea;
    }

    // Largest rectangle in histogram
    private static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()]>heights[i]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        
        while(!stack.isEmpty()) {
        	 int height = heights[stack.pop()];
             int width = stack.isEmpty() ? n : n - stack.peek() - 1;
             maxArea = Math.max(maxArea, height * width);
        }
        return maxArea;
    }

    // Example run
    public static void main(String[] args) {
        int[][] matrix = {
            {1,0,1,0,0},
            {1,0,1,1,1},
            {1,1,1,1,1},
            {1,0,0,1,0}
        };

        System.out.println("Maximal Rectangle Area = " + maximalRectangle(matrix));
    }
}
