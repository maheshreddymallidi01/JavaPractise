package com.practise.Strivers;

public class Rotation {

	public static void main(String[] args) {
		int[] arr = {3,4,5,1,2};
		System.out.println(findKRotation(arr));
	}

	public static int findKRotation(int []arr){
        // Write your code here.
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[low]<=arr[high]){
                if(arr[low]<ans){
                    ans = arr[low];
                    index = low;
                }
                low = mid+1;
                break;
            }else if(arr[low]<=arr[mid]){
                if(arr[low]<ans){
                    ans = arr[low];
                    index = low;
                }
                low = mid+1;
            }else{
                if(arr[mid]<ans){
                    ans = arr[mid];
                    index = mid;
                }
                high = mid-1;
            }
        }
        return index;
    }
}
