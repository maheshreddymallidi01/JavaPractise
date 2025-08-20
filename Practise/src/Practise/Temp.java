package Practise;

import java.util.ArrayList;
import java.util.List;

public class Temp {

	public static void main(String[] args) {
		int[] arr = {1,4,3,2,5,7,8};
		int[] arr2 = {4,3,2,5,7,8,6};
		mergeSort(arr,0,arr.length-1);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		quickSort(arr2,0,arr2.length-1);
		for(int i:arr2) {
			System.out.print(i+" ");
		}
	}
	
	private static void mergeSort(int[] arr,int low,int high) {
		int mid = (low+high)/2;
		if(low>=high) {
			return;
		}
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		merge(arr,low,mid,high);
	}
	
	private static void merge(int[] arr,int low,int mid,int high) {
		int left = low;
		int right = mid+1;
		List<Integer> temp = new ArrayList<>();
		while(left<=mid&&right<=high) {
			if(arr[left]<=arr[right]) {
				temp.add(arr[left]);
				left++;
			}else {
				temp.add(arr[right]);
				right++;
			}
		}
		while(left<=mid) {
			temp.add(arr[left]);
			left++;
		}
		while(right<=high) {
			temp.add(arr[right]);
			right++;
		}
		for(int i=low;i<=high;i++) {
			arr[i]=temp.get(i-low);
		}
	}
	
	private static void quickSort(int[] arr, int low,int high) {
		if(low<high) {
			int pIndex = pivot(arr,low,high);
			quickSort(arr,low,pIndex-1);
			quickSort(arr,pIndex+1,high);
		}
	}
	
	private static int pivot(int[] arr,int low,int high) {
		int pivot = arr[low];
		int l = low;
		int r = high;
		while(l<r) {
			while(arr[l]<=pivot&&l<=high-1) {
				l++;
			}
			while(arr[r]>pivot&&r>=low+1) {
				r--;
			}
			if(l<r) {
				swap(arr,l,r);
			}
		}
		swap(arr,low,r);
		return r;
	}

	private static void swap(int[] arr,int l,int r) {
		int temp = arr[l];
		arr[l]=arr[r];
		arr[r]=temp;
	}
}
