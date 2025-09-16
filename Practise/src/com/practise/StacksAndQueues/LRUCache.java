package com.practise.StacksAndQueues;

import java.util.HashMap;
import java.util.Map;

class Node{
	int key;
	int value;
	Node prev;
	Node next;
	
	Node(int key,int value){
		this.key=key;
		this.value=value;
	}
}

public class LRUCache {
	Node head = new Node(0,0);
	Node tail = new Node(0,0);
	private Map<Integer,Node> map;
	int capacity;
	
	LRUCache(int capacity){
		this.capacity=capacity;
		map = new HashMap<>();
		head.next=tail;
		tail.prev=head;
	}
	
	public int get(int key) {
		if(!map.containsKey(key)) {
			return -1;
		}
		Node node = map.get(key);
		remove(node);
		insert(node);
		return node.value;
	}
	
	public void put(int key, int value) {
		if(map.containsKey(key)) {
			Node node = map.get(key);
			node.value = value;
			remove(node);
			insert(node);
		}else {
			if(map.size()==capacity) {
				remove(tail.prev);
			}
			insert(new Node(key,value));
		}
	}
	
	private void remove(Node node) {
		map.remove(node.key);
		node.prev.next=node.next;
		node.next.prev=node.prev;
	}
	
	private void insert(Node node) {
		map.put(node.key, node);
		node.next=head.next;
		head.next.prev=node;
		head.next=node;
		node.prev=head;
	}
	
	public static void main(String[] args) {
	    LRUCache cache = new LRUCache(4);

	    cache.put(1, 10);
	    cache.put(2, 20);

	    System.out.println(cache.get(1));

	    cache.put(3, 30);

	    System.out.println(cache.get(2));

	    cache.put(1, 100);

	    cache.put(4, 40);

	    System.out.println(cache.get(1));
	    System.out.println(cache.get(3));
	    System.out.println(cache.get(4));
	    System.out.println(cache.get(99));
	}

}
