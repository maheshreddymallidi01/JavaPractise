package Practise;

class Node{
	int data;
	Node next;
	
	Node(int data, Node next){
		this.data=data;
		this.next=next;
	}
	
	Node(int data){
		this.data=data;
	}
}

public class LLPractise {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		Node head = convertToLL(arr);
		printLL(head);
		
		int k = 3;
		Node afterDelete = deleteAtK(head,k);
		printLL(afterDelete);
		
		int ins = 3;
		Node afterInsert = insertAtK(head,k,ins);
		printLL(afterInsert);
		
		Node afterReverse = reverseLL(head);
		printLL(afterReverse);
		
		Node afterReverse2 = reverseLL2(afterReverse);
		printLL(afterReverse2);
		
		printLL(head);
		
		int[] arr2 = {1,2,3,2,1};
		Node head2 = convertToLL(arr2);
		System.out.println(isPalindrome(head2));
		
		int[] arr3 = {4,5,9};
		Node head3 = convertToLL(arr3);
		Node afterAddingOne = addOne(head3);
		printLL(afterAddingOne);
		
		int[] n1 = {2,4};
		int[] n2 = {3,8,7};
		Node h1 = convertToLL(n1);
		Node h2 = convertToLL(n2);
		Node afterAdding = addTwoNodes(h1,h2);
		printLL(afterAdding);
	}
	
	private static Node addTwoNodes(Node h1, Node h2) {
		Node l1 = h1;
		Node l2 = h2;
		Node dummy = new Node(-1);
		Node temp = dummy;
		int carry = 0;
		while(l1!=null||l2!=null) {
			int x = l1!=null?l1.data:0;
			int y = l2!=null?l2.data:0;
			
			int sum = x+y+carry;
			
			carry = sum/10;
			
			temp.next = new Node(sum%10);
			temp = temp.next;
			if(l1!=null) {
				l1=l1.next;
			}
			if(l2!=null) {
				l2=l2.next;
			}
		}
		
		if(carry>0) {
			temp.next = new Node(carry);
		}
		return dummy.next;
	}
	
	
	private static Node addOne(Node head) {
		int carry = findCarry(head);
		if(carry==1) {
			Node newNode = new Node(carry,head);
			head = newNode;
		}
		return head;
	}
	
	private static int findCarry(Node head) {
		if(head==null) {
			return 1;
		}
		int carry = findCarry(head.next);
		head.data += carry;
		if(head.data<10) return 0;
		head.data = 0;
		return 1;
	}
	private static boolean isPalindrome(Node head) {
		if(head==null||head.next==null) {
			return true;
		}
		
		Node slow = head;
		Node fast = head;
		
		while(fast.next!=null&&fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		Node newHead = reverseLL(slow.next);
		
		Node front = head;
		Node second = newHead;
		
		while(second!=null) {
			if(front.data!=second.data) {
				reverseLL(newHead);
				return false;
			}
			front=front.next;
			second=second.next;
		}
		reverseLL(newHead);
		
		return true;
		
	}
	
	private static Node reverseLL2(Node head) {
		Node temp = head;
		Node prev = null;
		while(temp!=null) {
			Node front = temp.next;
			temp.next=prev;
			prev = temp;
			temp = front;
		}
		return prev;
	}
	
	private static Node reverseLL(Node head) {
		if(head==null||head.next==null) {
			return head;
		}
		Node newHead = reverseLL(head.next);
		Node front = head.next;
		front.next=head;
		head.next=null;
		return newHead;
	}
	
	private static Node insertAtK(Node head,int k,int ins) {
		if(head==null) {
			if(k==1) {
				return new Node(ins);
			}else {
				return head;
			}
		}
		
		if(k==1) {
			return new Node(ins,head);
		}
		
		int cnt = 1;
		Node temp = head;
		Node prev = null;
		
		while(temp!=null) {
			if(cnt==k) {
				Node newNode = new Node(ins,temp);
				prev.next=newNode;
				break;
			}else {
				prev = temp;
				temp=temp.next;
			}
			cnt++;
		}
		
		return head;
	}
	
	private static Node deleteAtK(Node head,int k) {
		if(head==null||head.next==null) {
			return head;
		}
		if(k==1) {
			head = head.next;
		}
		int cnt = 1;
		Node temp = head;
		Node prev = null;
		while(temp!=null) {
			if(cnt==k) {
				prev.next=temp.next;
				break;
			}else {
				prev = temp;
				temp=temp.next;
			}
			cnt++;
		}
		return head;
	}
	
	private static Node convertToLL(int[] arr) {
		Node head = new Node(arr[0]);
		Node mover = head;
		for(int i=1;i<arr.length;i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = mover.next;
		}
		return head;
	}
	
	private static void printLL(Node head) {
		Node temp  = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}

}
