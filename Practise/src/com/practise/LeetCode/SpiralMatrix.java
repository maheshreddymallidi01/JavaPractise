package com.practise.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{1,3,5,7},{10,11,16,20},{13,30,34,60}};
		List<Integer> result = spiralOrder(matrix);
		for(int r:result) {
			System.out.print(r+" ");
		}
	}

	private static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
		int n = matrix.length;
        int m = matrix[0].length;
        
        int top = 0,right = m-1, bottom = n-1, left = 0;
        while(top<=bottom && left<=right) {
        	for(int i=left;i<=right;i++) {
        		result.add(matrix[top][i]);
        	}
        	top++;
        	for(int i=top;i<=bottom;i++) {
        		result.add(matrix[i][right]);
        	}
        	right--;
        	if(top<=bottom) {
        		for(int i=right;i>=left;i--) {
        			result.add(matrix[bottom][i]);
        		}
        		bottom--;
        	}
        	if(left<=right) {
        		for(int i=bottom;i>=top;i--) {
        			result.add(matrix[i][left]);
        		}
        		left++;
        	}
        }
        return result;
    }
}
