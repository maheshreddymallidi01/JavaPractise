package com.practise.StacksAndQueues;

import java.util.Queue;
import java.util.LinkedList;

public class StackUsingQueue {
	public static void main(String[] args) {
        StackWithQueue s = new StackWithQueue();
        s.push(3);
        s.push(2);
        s.push(4);
        s.push(1);
        System.out.println("Top of the StackWithQueue: " + s.top());
        System.out.println("Size of the StackWithQueue before removing element: " + s.size());
        System.out.println("The deleted element is: " + s.pop());
        System.out.println("Top of the StackWithQueue after removing element: " + s.top());
        System.out.println("Size of the StackWithQueue after removing element: " + s.size());
    }

}
class StackWithQueue {
    Queue<Integer> q = new LinkedList<>();
    void push(int x) {
        q.add(x);
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
    }
    int pop() {
        return q.remove();
    }
    int top() {
        return q.peek();
    }
    int size() {
        return q.size();
    }
}