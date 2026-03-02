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

    /*
     * the approach:
     * we store first value as min when stack was empty
     * when new values comes in we store it as it is, because its grater than min, so min isn't changing
     * if not we need to store it in min as well but to make sure we can get back to previus min
     * we cannot replace min and stack top with this directly we need encoding of some kind
     * so we, encode incoming value and store encoded value in stack, while real val in min as it was less than previous min
     * encoding is important if we don't wanna use two stacks,
     * because of encoding we can decode it from stack when popping element is less than min
     * as it can never be less than min (because min should've had it any way) hence,
     * we decode it and store the decoded value again in the min
     * when popping: we check if it is less than min it means it was encoded
     * we decode it and store the decoded value in min (reverse of push)
     */
}
