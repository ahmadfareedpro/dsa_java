package problems.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
    /*
     * if length of the string is not even then return false
     * create a stack, start a for loop upto the length of the string and check char by char
     * if char matches '(' then push ')', else if '{' then push '}', else if '[' then push ']' into the stack
     * else if stack is empty or current char is not equal to top element of the stack return false
     * if not returned yet, and we've looped over then return stack.isEmpty()
     * because empty stack means parentheses were valid.
     */
}
