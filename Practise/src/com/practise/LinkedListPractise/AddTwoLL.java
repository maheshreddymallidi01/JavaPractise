package com.practise.LinkedListPractise;

public class AddTwoLL {

	public static void main(String[] args) {
		int[] arr1 = {2,4};
		int[] arr2 = {3,8,7};
		Node list1=SinglyLinkedList.convertToLL(arr1);
		Node list2=SinglyLinkedList.convertToLL(arr2);
		
		Node afterAdding = addTwoLL(list1,list2);
		SinglyLinkedList.printLL(afterAdding);
	}
	
	private static Node addTwoLL(Node list1,Node list2) {
		Node m1 = list1;
		Node m2 = list2;
		Node dummy = new Node(0);
		Node temp = dummy;
		int carry = 0;
		while(m1!=null||m2!=null) {
			int x = m1!=null?m1.data:0;
			int y = m2!=null?m2.data:0;
			
			int sum = x+y+carry;
			carry = sum/10;
			temp.next=new Node(sum%10);
			temp=temp.next;
			
			if(m1!=null) {
				m1=m1.next;
			}
			if(m2!=null) {
				m2=m2.next;
			}
		}
		if(carry>0) {
			temp.next=new Node(carry);
		}
		return dummy.next;
	}

}
