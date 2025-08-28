package com.practise.LinkedListPractise;

public class RemoveKeyFromDLL {

	public static void main(String[] args) {
		int[] arr = {10,4,10,10,6,12,10};
		int key = 10;
		Struct head = DoublyLinkedList.convertToDLL(arr);
		Struct afterRemovingKey = removeKeyFromDLL(head,key);
		DoublyLinkedList.printDLL(afterRemovingKey);
	}

	private static Struct removeKeyFromDLL(Struct head,int key) {
		while(head!=null&&head.data==key) {
			head=head.next;
		}
		
		if(head==null) {
			return null;
		}
		
		head.back=null;
		
		Struct temp = head;
		while(temp!=null) {
			if(temp.data==key) {
				Struct nextNode = temp.next;
				Struct prevNode = temp.back;
				if(nextNode!=null) nextNode.back=prevNode;
				if(prevNode!=null) prevNode.next=nextNode;
			}
			temp = temp.next;
		}
		return head;
	}
}
