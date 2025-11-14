package com.practise.Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {

	public static void main(String[] args) {
		int[] stones = {2,4,1,7,8,1};
		System.out.println(lastStoneWeight(stones));
	}

	private static int lastStoneWeight(int[] stones) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int stone:stones) {
			maxHeap.add(stone);
		}
		
		while(maxHeap.size()>1) {
			int x = maxHeap.poll();
			int y = maxHeap.poll();
			
			if(x!=y) {
				maxHeap.add(x-y);
			}
		}
		
		return maxHeap.isEmpty()?0:maxHeap.peek();
	}
}
