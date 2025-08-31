package com.practise.LinkedListPractise;

public class RemoveDuplicatesInDLL {

	public static void main(String[] args) {
		int[] arr = {1,1,1,2,2,3};
		Struct head = DoublyLinkedList.convertToDLL(arr);
		Struct afterRemoving = removeDuplicates(head);
		DoublyLinkedList.printDLL(afterRemoving);
	}

	private static Struct removeDuplicates(Struct head) {
		Struct temp = head;
		while(temp!=null&&temp.next!=null) {
			Struct newNode = temp.next;
			while(newNode!=null && newNode.data==temp.data) {
				newNode=newNode.next;
			}
			temp.next=newNode;
			if(newNode!=null) {
				newNode.back=temp;
			}
			temp=temp.next;
		}
		return head;
	}
}
