package com.practise.Heaps;

public class KthLargestElement {

	public static void main(String[] args) {
		int[] arr = {3,2,1,5,6,4};
		int k = 2;
		System.out.println(kthLargestElement(arr,k));
	}

	private static int kthLargestElement(int[] arr, int k) {
		int[] heap = new int[k];
		int size = 0;
		
		for(int val:arr) {
			if(size<k) {
				heap[size] = val;
				int current = size;
				size++;
				
				while(current>0&&heap[current]<heap[parent(current)]) {
					swap(heap,current,parent(current));
					current = parent(current);
				}
			}else {
				if(val>heap[0]) {
					heap[0] = val;
					heapifyDown(heap,k,0);
				}
			}
		}
		return heap[0];
	}
	
	
	private static void heapifyDown(int[] heap,int size, int index) {
		int smallest = index;
		
		while(true) {
			int left = 2*index+1;
			int right = 2*index+2;
			
			if(left<size&&heap[left]<heap[smallest]) {
				smallest = left;
			}
			
			if(right<size&&heap[right]<heap[smallest]) {
				smallest = right;
			}
			
			if(smallest==index) {
				break;
			}
			
			swap(heap,smallest,index);
			index = smallest;
		}
	}
	
	private static int parent(int index) {
		return (index-1)/2;
	}
	
	private static void swap(int[] heap,int i,int j) {
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}
}
