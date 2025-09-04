package com.practise.StacksAndQueues;

class QueueNode {
    int val;
    QueueNode next;

    QueueNode(int data) {
        val = data;
        next = null;
    }
}

class QueueUsingLL {
    private QueueNode front, rear;
    private int size;

    // constructor
    public QueueUsingLL() {
        front = rear = null;
        size = 0;
    }

    // Enqueue: add element at rear
    public void push(int newElement) {
        QueueNode newNode = new QueueNode(newElement);

        if (rear == null) { // first element
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("The element pushed is " + newElement);
    }

    // Dequeue: remove element from front
    public int pop() {
        if (front == null) {
            throw new RuntimeException("Queue is empty");
        }
        int popped = front.val;
        front = front.next;

        if (front == null) { // queue became empty
            rear = null;
        }
        size--;
        return popped;
    }

    // Peek: get front element
    public int top() {
        if (front == null) {
            throw new RuntimeException("Queue is empty");
        }
        return front.val;
    }

    // Get current size
    public int size() {
        return size;
    }

    // Check if empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Print all elements (optional helper)
    public void printQueue() {
        QueueNode temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method inside the same class
    public static void main(String[] args) {
        QueueUsingLL q = new QueueUsingLL();

        q.push(4);
        q.push(14);
        q.push(24);
        q.push(34);

        q.printQueue();  // Queue: 4 14 24 34 

        System.out.println("Front element: " + q.top());   // 4
        System.out.println("Removed: " + q.pop());         // 4
        System.out.println("Front element: " + q.top());   // 14
        System.out.println("Queue size: " + q.size());     // 3
    }
}
  