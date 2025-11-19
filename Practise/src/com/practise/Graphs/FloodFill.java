package com.practise.Graphs;

public class FloodFill {

	public static void main(String[] args) {
		int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
		
		
		int sr = 1;
		int sc = 1;
		int newColour = 2;
		int[][] result = floodFill(image,sr,sc,newColour);
		printImage(result);
	}

	private static int[][] floodFill(int[][] image, int sr, int sc, int newColour) {
		int oldColour = image[sr][sc];
		if(oldColour==newColour) return image;
		
		dfs(image,sr,sc,oldColour,newColour);
		return image;
	}

	private static void dfs(int[][] image, int i, int j, int oldColour, int newColour) {
		if(i<0||i>=image.length||j<0||j>=image[0].length||image[i][j]!=oldColour)
			return;
		
		image[i][j]=newColour;
		
		dfs(image,i+1,j,oldColour,newColour);
		dfs(image,i-1,j,oldColour,newColour);
		dfs(image,i,j+1,oldColour,newColour);
		dfs(image,i,j-1,oldColour,newColour);
	}

	private static void printImage(int[][] result) {
		if(result==null||result.length==0)
			return;
		
		for(int[] row:result) {
			for(int pixel:row) {
				System.out.print(pixel+" ");
			}
			System.out.println();
		}
	}
}
