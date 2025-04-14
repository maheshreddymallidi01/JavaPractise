package com.practise.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {2,13,4,1,3,6,28};
		int l = 0;
		int r = 6;
		mergeSort(arr, l, r);
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}
	
	public static void mergeSort(int[] arr, int l, int r){
        int mid = (l+r)/2;
        if(l>=r){
            return;
        }
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr,l,mid,r);
    }

    public static void merge(int[] arr, int l, int mid, int r){
        List<Integer> a = new ArrayList<>();
        int left = l;
        int right = mid+1;
        while(left<=mid&&right<=r){
            if(arr[left]<=arr[right]){
                a.add(arr[left]);
                left++;
            }else{
                a.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            a.add(arr[left]);
            left++;
        }
        while(right<=r){
            a.add(arr[right]);
            right++;
        }
        for(int i=l;i<=r;i++){
            arr[i] = a.get(i-l);
        }
    }


}
