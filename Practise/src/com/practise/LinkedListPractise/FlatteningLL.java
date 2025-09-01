package com.practise.LinkedListPractise;

class NodeLL {
    int data;
    NodeLL next;
    NodeLL child;

    // Constructors to initialize the
    // data, next, and child pointers
    NodeLL() {
        this.data = 0;
        this.next = null;
        this.child = null;
    }

    NodeLL(int x) {
        this.data = x;
        this.next = null;
        this.child = null;
    }

    NodeLL(int x, NodeLL nextNodeLL, NodeLL childNodeLL) {
        this.data = x;
        this.next = nextNodeLL;
        this.child = childNodeLL;
    }
}

public class FlatteningLL {

	public static void printLinkedList(NodeLL head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.child;
        }
        System.out.println();
    }

    // Print the linked list
    // in a grid-like structure
    public static void printOriginalLinkedList(NodeLL head, int depth) {
        while (head != null) {
            System.out.print(head.data);

            // If child exists, recursively
            // print it with indentation
            if (head.child != null) {
                System.out.print(" -> ");
                printOriginalLinkedList(head.child, depth + 1);
            }

            // Add vertical bars
            // for each level in the grid
            if (head.next != null) {
                System.out.println();
                for (int i = 0; i < depth; ++i) {
                    System.out.print("| ");
                }
            }
            head = head.next;
        }
    }

    public static void main(String[] args) {
        // Create a linked list with child pointers
        NodeLL head = new NodeLL(5);
        head.child = new NodeLL(14);

        head.next = new NodeLL(10);
        head.next.child = new NodeLL(4);

        head.next.next = new NodeLL(12);
        head.next.next.child = new NodeLL(20);
        head.next.next.child.child = new NodeLL(13);

        head.next.next.next = new NodeLL(7);
        head.next.next.next.child = new NodeLL(17);

        // Print the original
        // linked list structure
        System.out.println("Original linked list:");
        printOriginalLinkedList(head, 0);

        // Flatten the linked list
        // and print the flattened list
        NodeLL flattened = flattenLinkedList(head);
        System.out.print("\nFlattened linked list: ");
        printLinkedList(flattened);
    }
    
    private static NodeLL flattenLinkedList(NodeLL head) {
    	if(head==null||head.next==null) {
    		return head;
    	}
    	NodeLL newHead = flattenLinkedList(head.next);
    	return mergeLL(head,newHead);
    }
    
    private static NodeLL mergeLL(NodeLL list1,NodeLL list2) {
    	NodeLL dummy = new NodeLL(-1);
    	NodeLL temp = dummy;
    	while(list1!=null&&list2!=null) {
    		if(list1.data<list2.data) {
    			temp.child=list1;
    			temp=list1;
    			list1=list1.child;
    		}else {
    			temp.child=list2;
    			temp=list2;
    			list2=list2.child;
    		}
    		temp.next=null;
    	}
    	if(list1!=null) {
    		temp.child=list1;
    	}else {
    		temp.child=list2;
    	}
    	return dummy.child;
    }
}

