package com.practise.StacksAndQueues;

public class StackUsingLL {
	public static void main(String args[]) {
	    StackLL s = new StackLL();
	    s.StackLLPush(10);
	    s.StackLLPush(20);
	    s.printStackLL();
	    System.out.println("Element popped " + s.StackLLPop());
	    System.out.println("StackLL size: " + s.StackLLSize());
	    System.out.println("StackLL is empty or not: " + s.StackLLIsEmpty());

	  }
}

class StackLL {
  private class StackLLNode {
    int data;
    StackLLNode next;
    StackLLNode(int d) {
      data = d;
      next = null;
    }
  }
  StackLLNode top;
  int size;
  StackLL() {
    this.top = null;
    this.size = 0;
  }
  public void StackLLPush(int x) {
    StackLLNode element = new StackLLNode(x);
    element.next = top;
    top = element;
    System.out.println("Element pushed");
    size++;
  }
  public int StackLLPop() {
    if (top == null) return -1;
    int topData = top.data;
    top = top.next;
    return topData;
  }
  public int StackLLSize() {
    return size;
  }
  public boolean StackLLIsEmpty() {
    return top == null;
  }
  public void printStackLL() {
    StackLLNode current = top;
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }
}

