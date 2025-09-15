package com.practise.StacksAndQueues;

import java.util.Stack;

class MinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    // Constructor
    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push element
    public void push(int val) {
        mainStack.push(val);

        // Push into minStack if it is empty or val <= current min
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    // Pop element
    public void pop() {
        if (mainStack.isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        int removed = mainStack.pop();
        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    // Top element
    public int top() {
        if (mainStack.isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return mainStack.peek();
    }

    // Get minimum element in O(1)
    public int getMin() {
        if (minStack.isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return minStack.peek();
    }
}

public class MinimumStack {
	public static void main(String[] args) {
        MinStack stack = new MinStack();

        stack.push(5);
        stack.push(3);
        stack.push(7);
        stack.push(2);

        System.out.println("Top element: " + stack.top());       // 2
        System.out.println("Current Min: " + stack.getMin());    // 2

        stack.pop();
        System.out.println("After popping, Top: " + stack.top()); // 7
        System.out.println("Current Min: " + stack.getMin());     // 3
    }
}
