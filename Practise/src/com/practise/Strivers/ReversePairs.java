package com.practise.Strivers;

import java.util.ArrayList;

public class ReversePairs {

	public static void main(String[] args) {
		int[] a = {4,1,2,3,1};
		int n = 5;
		System.out.println(team(a, n));
	}
	
	public static int team(int []skill, int n){
        // Write your code here.
        return mergeSort(skill, 0, n-1);
    }
	
	public static int mergeSort(int[] a,int low, int high){
        int cnt = 0;
        if(low>=high){
            return cnt;
        }
        int mid = (low+high)/2;
        cnt += mergeSort(a, low, mid);
        cnt += mergeSort(a, mid+1, high);
        cnt += countPairs(a,low,mid,high);
        merge(a,low,mid,high);
        return cnt;
    }
	
	public static int countPairs(int[] a,int low,int mid,int high) {
		int cnt = 0;
		int right = mid+1;
		for(int i=low;i<=mid;i++) {
			while(right<=high&&a[i]>2*a[right]) {
				right++;
			}
			cnt += right-(mid+1);
		}
		return cnt;
	}

    public static void merge(int[] a, int low,int mid,int high){
        int left = low;
        int right = mid+1;
        ArrayList<Integer> r = new ArrayList<>();
        while(left<=mid&&right<=high){
            if(a[left]<=a[right]){
                r.add(a[left]);
                left++;
            }else{
                r.add(a[right]);
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
    }

}
