package com.practise.Generics;

public class OrderedPair<K,V> implements Pair<K,V> {

	private K key;
	private V value;
	
	
	public OrderedPair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "OrderedPair key "+key+"\'s"+" Value is "+value;
	}
	
}
