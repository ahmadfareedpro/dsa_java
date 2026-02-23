package problems.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinStackV2 {
    Deque<Long> stack;
    long min;

    public MinStackV2() {
        stack = new ArrayDeque<>();
        min = -1;
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push((long)val);
            min = val;
        } else if (val < min) {
            stack.push(2L*val - min);
            min = val;
        } else {
            stack.push((long)val);
        }
    }

    public void pop() {
        if (stack.isEmpty())
            return;
        long top = stack.pop();
        if (top < min)
            min = 2*min - top;
    }

    public int top() {
        if (stack.isEmpty())
            return -1;
        long top = stack.peek();
        return (min > top) ? (int)min : (int)top;
    }

    public int getMin() {
        if (stack.isEmpty())
            return -1;
        return (int)min;
    }
}
