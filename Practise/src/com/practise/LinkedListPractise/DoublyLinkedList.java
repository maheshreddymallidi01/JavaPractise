package com.practise.LinkedListPractise;

class Struct{
	int data;
	Struct next;
	Struct back;
	
	Struct(int data, Struct next, Struct back){
		this.data=data;
		this.next=next;
		this.back=back;
	}
	
	Struct(int data){
		this.data=data;
		this.next=null;
		this.back=null;
	}
}

public class DoublyLinkedList {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		Struct head = convertToDLL(arr);
		printDLL(head);
		
		int k = 3;
		Struct afterDelete = deleteAtK(head,k);
		printDLL(afterDelete);
		
		int num = 66;
		Struct afterInsert = insertAtK(afterDelete,k,num);
		printDLL(afterInsert);
		
		Struct afterReverse = reverseDLL(afterInsert);
		printDLL(afterReverse);
	}
	
	private static Struct reverseDLL(Struct mmr) {
		if(mmr==null||mmr.next==null) {
			return mmr;
		}
		Struct current = mmr;
		Struct prev = null;
		while(current!=null) {
			Struct front = current.next;
			current.next = prev;
			current.back = front;
			prev=current;
			current=front;
		}
		return prev;
	}
	
	private static Struct insertAtK(Struct head,int k,int num) {
		if(k<1) {
			return head;
		}
		Struct newHead = new Struct(num);
		if(k==1) {
			newHead.next=head;
			if(head!=null) {
				head.back=newHead;
			}
			return newHead;
		}
		int cnt = 1;
		Struct current = head;
		while(current!=null&&cnt<k-1) {
			current=current.next;
			cnt++;
		}
		
		if(current==null) {
			return head;
		}
		
		Struct next = current.next;
		newHead.next=next;
		if(next!=null) {
			next.back = newHead;
		}
		
		current.next=newHead;
		newHead.back=current;
		
		return head;
	}
	
	private static Struct deleteAtK(Struct head,int k) {
		if(head==null) {
			return null;
		}
		if(k==1&&head.next!=null) {
			Struct newHead = head.next;
			head.next=null;
			newHead.back=null;
			return newHead;
		}
		Struct current = head;
		int cnt = 1;
		while(current!=null&&cnt<k) {
			current=current.next;
			cnt++;
		}
		
		if(current==null) {
			return head;
		}
		
		Struct prev = current.back;
		Struct next = current.next;
		
		prev.next = next;
		if(next!=null) {
			next.back=prev;
		}

		current.back = null;
		current.next = null;
		return head;
	}
	
	private static Struct convertToDLL(int[] arr) {
		Struct head = new Struct(arr[0]);
		Struct mover = head;
		for(int i=1;i<arr.length;i++) {
			Struct temp = new Struct(arr[i],null,mover);
			mover.next = temp;
			mover = temp;
		}
		return head;
	}
	
	private static void printDLL(Struct head) {
		Struct temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}

}
