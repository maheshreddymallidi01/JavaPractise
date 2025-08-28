package com.practise.LinkedListPractise;

import java.util.ArrayList;
import java.util.List;

public class FindSumOfPairsDLL {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,9};
		int sum = 5;
		Struct head = DoublyLinkedList.convertToDLL(arr);
		List<List<Integer>> res= findSumOfPairs(head,sum);
		System.out.println(res);
	}
	
	private static List<List<Integer>> findSumOfPairs(Struct head,int sum){
		List<List<Integer>> res= new ArrayList<>();
		Struct left = head;
		Struct right = findTail(head);
		while(left.data<right.data) {
			if(left.data+right.data==sum) {
				res.add(List.of(left.data,right.data));
				left=left.next;
				right=right.back;
			}else if(left.data+right.data>sum) {
				right=right.back;
			}else {
				left=left.next;
			}
		}
		return res;
	}
	
	private static Struct findTail(Struct head) {
		Struct temp = head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		return temp;
	}

}
