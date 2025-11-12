package com.practise.Heaps;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

	static class Pair{
		int num;
		int freq;
		
		Pair(int num, int freq){
			this.num = num;
			this.freq = freq;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,1,1,2,2,3};
		int k = 2;
		int[] result = topKFrequentElements(arr,k);
		for(int i:result) {
			System.out.print(i+" ");
		}
	}
	
	private static int[] topKFrequentElements(int[] arr,int k) {
		
		Map<Integer, Integer> freqMap = new HashMap<>();
		for(int val:arr) {
			freqMap.put(val, freqMap.getOrDefault(val, 0)+1);
		}
		
		PriorityQueue<Pair> minHeap = new PriorityQueue<>((a,b)->a.freq-b.freq);
		
		for(Map.Entry<Integer, Integer> entry:freqMap.entrySet()) {
			minHeap.add(new Pair(entry.getKey(), entry.getValue()));
			if(minHeap.size()>k) {
				minHeap.poll();
			}
		}
		
		int i = 0;
		int[] result = new int[k];
		while(!minHeap.isEmpty()) {
			result[i] = minHeap.poll().num;
			i++;
		}
		
		return result;
	}

}
