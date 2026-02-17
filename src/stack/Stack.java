package stack;

public class Stack {
    int[] arr;
    int top;

    public Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return -1;
        }
        return arr[top--];
    }

    public void push(int val) {
        if (top == arr.length) {
            System.out.println("Stack is full");
            return;
        }
        arr[++top] = val;
    }

    public int peek() {
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

}
