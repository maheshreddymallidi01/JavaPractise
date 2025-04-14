package com.practise.Strivers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermutation {

	public static void main(String[] args) {
		List<Integer> A = new ArrayList<>(Arrays.asList(1,3,2));
		System.out.println(nextGreaterPermutation(A));
	}
	
	public static List<Integer> nextGreaterPermutation(List< Integer > A) {
        // Write your code here.
        int ind1 = -1;
        int ind2 = -1;
        int n = A.size();
        for(int i=n-2;i>=0;i--){
            if(A.get(i)<A.get(i+1)){
                ind1 = i;
                break;
            }
        }

        if(ind1==-1){
            reverse(A,0);
            return A;
        }
        else{
            for(int i=n-1;i>=0;i--){
                if(A.get(i)>A.get(ind1)){
                    ind2 = i;
                    break;
                }
            }
            swap(A, ind1, ind2);
            reverse(A, ind1+1);
        }
        return A;
    }

    public static void reverse(List<Integer> A, int low){
        int high = A.size()-1;
        while(low<high){
            swap(A,low,high);
            low++;
            high--;
        }
    }

    public static void swap(List<Integer> A, int low,int high){
        int temp = A.get(low);
        A.set(low, A.get(high));
        A.set(high, temp);
    }

}
