package com.practise.Sorting;

public class QuickSort {

	public static void main(String[] args) {
		int[] input = {2,6,8,5,3};
		quickSort(input, 0, 4);
		for(int i:input) {
			System.out.print(i+" ");
		}
	}

	public static void quickSort(int[] input,int startIndex, int endIndex) {
		 if(startIndex<endIndex){
			 int pivot = posOfNum(input,startIndex,endIndex);
			 quickSort(input,startIndex,pivot-1);
			 quickSort(input,pivot+1,endIndex);
		 }
		
	}

	public static int posOfNum(int[] input,  int low, int high){
		int p = input[low];
		int i = low;
		int j = high;
		while(i<j){
			while(input[i]<=p&&i<=high-1){
				i++;
			}
			while(input[j]>p&&j>=low+1){
				j--;
			}
			if(i<j){
				int temp = input[j];
				input[j] = input[i];
				input[i] = temp;
			}
		}
		int t = input[low];
		input[low] = input[j];
		input[j] = t;
		return j;
	}
}
