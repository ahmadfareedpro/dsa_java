package problems.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinStackV1 {
    Deque<Integer> stack;
    Deque<Integer> minStack;

    public MinStackV1() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        minStack.pop();
        stack.pop();

    }

    public int top() {
        if (stack.isEmpty()) return -1;
        return stack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) return Integer.MIN_VALUE;
        return minStack.peek();
    }
}
