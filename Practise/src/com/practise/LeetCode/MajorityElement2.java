package com.practise.LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MajorityElement2 {

	public static void main(String[] args) {
		int[] nums = {2,2,2,1,1,1,3,3};
		for(int r:majorityElement(nums)) {
			System.out.print(r+" ");
		}
	}

	private static List<Integer> majorityElement(int[] nums) {
        List<Integer> r = new ArrayList<>();
        int c1 = 0,c2 = 0,e1 = Integer.MIN_VALUE,e2 = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(c1 == 0 && nums[i]!=e2){
                c1 = 1;
                e1 = nums[i];
            }else if(c2 ==0 && nums[i]!=e1){
                c2 = 1;
                e2 = nums[i];
            }else if(e1 == nums[i]){
                c1++;
            }else if(e2 == nums[i]){
                c2++;
            }else{
                c1--;
                c2--;
            }
        }
        c1 = 0;c2 = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==e1){
                c1++;
            }
            if(nums[i]==e2){
                c2++;
            }
        }
        int m = (int)(nums.length/3)+1;
        if(c1>=m){
            r.add(e1);
        }
        if(c2>=m){
            r.add(e2);
        }
        return r.stream().sorted().collect(Collectors.toList());
    }
}
