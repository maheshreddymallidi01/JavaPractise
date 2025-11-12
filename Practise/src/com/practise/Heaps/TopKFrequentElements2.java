package com.practise.Heaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements2 {

	public static void main(String[] args) {
		int[] arr = {1,1,1,2,2,3};
		int k = 2;
		int[] result = topKFrequentElements(arr,k);
		for(int i:result) {
			System.out.print(i+" ");
		}
	}
	
	private static int[] topKFrequentElements(int[] arr,int k) {
		int n = arr.length;
		
		Map<Integer, Integer> freqMap = new HashMap<>();
		for(int num:arr) {
			freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
		}
		
		List<List<Integer>> bucketList = new ArrayList<>(n+1);
		for(int i=0;i<=n;i++) {
			bucketList.add(new ArrayList<>());
		}
		
		for(Map.Entry<Integer, Integer> entry:freqMap.entrySet()) {
			int freq = entry.getValue();
			int num = entry.getKey();
			bucketList.get(freq).add(num);
		}
		
		List<Integer> resultList = new ArrayList<>();
		for(int i=n;i>=1&&resultList.size()<k;i--) {
			if(!bucketList.get(i).isEmpty()) {
				resultList.addAll(bucketList.get(i));
			}
		}
		
		int[] result = new int[k];
		for(int i=0;i<k;i++) {
			result[i] = resultList.get(i);
		}
		return result;
		
	}

}
