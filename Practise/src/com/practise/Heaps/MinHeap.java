package com.practise.Heaps;

public class MinHeap {

	int[] heap;
	int capacity;
	int size;
	
	public MinHeap(int capacity) {
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
		
		while(current>0&&heap[current]<heap[parent(current)]) {
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
	
	private int getMinValue() {
		if(size==0) {
			System.out.println("Heap is Empty");
			return -1;
		}
		
		return heap[0];
	}
	
	private int removeMin() {
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
		int smallest = index;
		
		while(true) {
			int left = 2*index+1;
			int right = 2*index+2;
			
			if(left<size&&heap[left]<heap[smallest]) {
				smallest = left;
			}
			
			if(right<size&&heap[right]<heap[smallest]) {
				smallest=right;
			}
			
			if(smallest==index) {
				break;
			}
			
			swap(index,smallest);
			index = smallest;
		}
	}
	
	public static void main(String[] args) {
		MinHeap minHeap = new MinHeap(8);
		
		minHeap.insert(2);
		minHeap.insert(3);
		minHeap.insert(4);
		minHeap.insert(5);
		minHeap.insert(6);
		minHeap.insert(1);
		
		minHeap.printHeap();
		System.out.println("Min Value in Heap::"+minHeap.getMinValue());
		
		System.out.println("Removed Min Value in Heap::"+minHeap.removeMin());
		System.out.println("Min Value in Heap::"+minHeap.getMinValue());
	
		minHeap.printHeap();
	}

}
