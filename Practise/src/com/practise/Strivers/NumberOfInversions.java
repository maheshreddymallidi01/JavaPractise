package com.practise.Strivers;

import java.util.ArrayList;

public class NumberOfInversions {

	public static void main(String[] args) {
		int[] a = {5,3,2,1,4};
		int n = 5;
		System.out.println(numberOfInversions(a, n));
	}

	public static int numberOfInversions(int []a, int n) {
        // Write your code here.
        return mergeSort(a,0,n-1);
    }

    public static int mergeSort(int[] a,int low, int high){
        int cnt = 0;
        int mid = (low+high)/2;
        if(low>=high){
            return cnt;
        }
        cnt += mergeSort(a, low, mid);
        cnt += mergeSort(a, mid+1, high);
        cnt += merge(a,low,mid,high);
        return cnt;
    }

    public static int merge(int[] a, int low,int mid,int high){
        int left = low;
        int right = mid+1;
        int cnt = 0;
        ArrayList<Integer> r = new ArrayList<>();
        while(left<=mid&&right<=high){
            if(a[left]<=a[right]){
                r.add(a[left]);
                left++;
            }else{
                r.add(a[right]);
                cnt += mid-left+1;
                right++;
            }
        }

        while(left<=mid){
            r.add(a[left]);
            left++;
        }
        while(right<=high){
            r.add(a[right]);
            right++;
        }

        for(int i=low;i<=high;i++){
            a[i] = r.get(i-low);
        }
        return cnt;
    }
}
