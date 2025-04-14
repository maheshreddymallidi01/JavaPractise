package com.practise.Strivers;

public class NumberOfOccurence {

	public static void main(String[] args) {
		int[] arr = {1,2,3,3,3,4,5};
		int n = arr.length;
		int x = 3;
		System.out.println(count(arr, n, x));
	}

	public static int count(int arr[], int n, int x) {
        //Your code goes here
        int last = lastOccurance(arr, n, x);
        int first = firstOccurance(arr, n, x);
        if(first==-1){
            return 0;
        }
        return last-first+1;
    }

    public static int firstOccurance(int[] arr, int n, int x){
        int ans = -1;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                ans = mid;
                high = mid-1;
            }else if(arr[mid]<x){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }

    public static int lastOccurance(int[] arr, int n, int x){
        int ans = -1;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                ans = mid;
                low = mid+1;
            }else if(arr[mid]<x){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}
