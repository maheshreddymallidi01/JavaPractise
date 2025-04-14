package com.practise.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {8,6,2,5,1};
		selectionSort(arr);
	}

	private static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int mini = i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;            
        }
        for(int a:arr) {
        	System.out.print(a+" ");
        }
    }
}
