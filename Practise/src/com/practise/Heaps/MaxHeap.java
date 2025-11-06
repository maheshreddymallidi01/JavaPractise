package com.practise.Heaps;

public class MaxHeap {

	int[] heap;
	int capacity;
	int size;
	
	public MaxHeap(int capacity) {
		this.capacity = capacity;
		heap = new int[capacity];
		size = 0;
	}
	
	private int parent(int index) {
		return (index-1)/2;
	}
	
	private void swap(int i, int j) {
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}
	
	private void insert(int value) {
		if(size==capacity) {
			System.out.println("Heap is full");
			return;
		}
		
		heap[size] = value;
		int current = size;
		size++;
		
		while(current>0&&heap[current]>heap[parent(current)]) {
			swap(current,parent(current));
			current = parent(current);
		}
	}
	
	public void printHeap() {
		for(int i=0;i<size;i++) {
			System.out.print(heap[i]+" ");
		}
		System.out.println();
	}
	
	private int getMaxValue() {
		if(size==0) {
			System.out.println("Heap is Empty");
			return -1;
		}
		
		return heap[0];
	}
	
	private int removeMax() {
		if(size==0) {
			System.out.println("Heap is Empty");
			return -1;
		}
		
		int min = heap[0];
		heap[0] = heap[size-1];
		size--;
		
		heapifyDown(0);
		
		return min;
	}
	
	private void heapifyDown(int index) {
		int largest = index;
		
		while(true) {
			int left = 2*index+1;
			int right = 2*index+2;
			
			if(left<size&&heap[left]>heap[largest]) {
				largest = left;
			}
			
			if(right<size&&heap[right]>heap[largest]) {
				largest=right;
			}
			
			if(largest==index) {
				break;
			}
			
			swap(index,largest);
			index = largest;
		}
	}
	
	public static void main(String[] args) {
		MaxHeap maxHeap = new MaxHeap(8);
		
		maxHeap.insert(2);
		maxHeap.insert(3);
		maxHeap.insert(4);
		maxHeap.insert(5);
		maxHeap.insert(6);
		maxHeap.insert(1);
		
		maxHeap.printHeap();
		System.out.println("Max Value in Heap::"+maxHeap.getMaxValue());
		
		System.out.println("Removed Max Value in Heap::"+maxHeap.removeMax());
		System.out.println("Max Value in Heap::"+maxHeap.getMaxValue());
	
		maxHeap.printHeap();
	}

}
