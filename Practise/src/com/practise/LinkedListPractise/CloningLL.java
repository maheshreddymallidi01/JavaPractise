package com.practise.LinkedListPractise;

class NodeC {
    // Data stored in the NodeC
    int data;
    // Pointer to the next NodeC
    NodeC next;
    // Pointer to a random
    // NodeC in the list
    NodeC random;

    // Constructors for NodeC class
    NodeC() {
        // Default constructor
        this.data = 0;
        this.next = null;
        this.random = null;
    }

    NodeC(int x) {
        // Constructor with data
        this.data = x;
        this.next = null;
        this.random = null;
    }

    NodeC(int x, NodeC nextNodeC, NodeC randomNodeC) {
        // Constructor with data,
        // next, and random pointers
        this.data = x;
        this.next = nextNodeC;
        this.random = randomNodeC;
    }
}

public class CloningLL {

	private static NodeC cloneLL(NodeC head) {
		if(head==null) {
			return null;
		}
		insertCopyInBetween(head);
		connectRandomPointers(head);
		return getDeepCopyList(head);
	}
	
	private static void insertCopyInBetween(NodeC head) {
		NodeC temp = head;
		while(temp!=null) {
			NodeC copyNode = new NodeC(temp.data);
			NodeC nextNode = temp.next;
			
			temp.next=copyNode;
			copyNode.next=nextNode;
			
			temp=nextNode;
		}
	}
	
	private static void connectRandomPointers(NodeC head) {
		NodeC temp = head;
		while(temp!=null) {
			NodeC copyNode = temp.next;
			if(temp.random!=null) {
				copyNode.random=temp.random.next;
			}else {
				copyNode.random=null;
			}
			temp=temp.next.next;
		}
	}
	
	private static NodeC getDeepCopyList(NodeC head) {
		NodeC temp = head;
		NodeC dummy = new NodeC(-1);
		NodeC res = dummy;
		while(temp!=null) {
			res.next=temp.next;
			res=res.next;
			
			temp.next=temp.next.next;
			temp=temp.next;
		}
		return dummy.next;
	}
	
	// Function to print the cloned linked list
	public static void printClonedLinkedList(NodeC head) {
	    while (head != null) {
	        System.out.print("Data: " + head.data);
	        if (head.random != null) {
	            System.out.print(", Random: " + head.random.data);
	        } else {
	            System.out.print(", Random: null");
	        }
	        System.out.println();
	        // Move to the next NodeC
	        head = head.next;
	    }
	}

	// Main function
	public static void main(String[] args) {
	    // Example linked list: 7 -> 14 -> 21 -> 28
	    NodeC head = new NodeC(7);
	    head.next = new NodeC(14);
	    head.next.next = new NodeC(21);
	    head.next.next.next = new NodeC(28);

	    // Assigning random pointers
	    head.random = head.next.next;
	    head.next.random = head;
	    head.next.next.random = head.next.next.next;
	    head.next.next.next.random = head.next;

	    System.out.println("Original Linked List with Random Pointers:");
	    printClonedLinkedList(head);

	    // Clone the linked list
	    NodeC clonedList = cloneLL(head);

	    System.out.println("\nCloned Linked List with Random Pointers:");
	    printClonedLinkedList(clonedList);
	}
}
