package problems.stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class NextGreater {
    static int[] nums1 = {4, 1, 3};
    static int[] nums2 = {1, 3, 4, 2};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        var res = new ArrayList<Integer>();
        var stack = new ArrayDeque<Integer>();
        for (int i = 0; i < nums2.length; i++) {
            res.add(-1);
        }

        for (int i = nums2.length -1; i >= 0; i++) {
            if (stack.isEmpty()) {
                stack.push(nums2[i]);
            }
        }

        var res = new ArrayList<Integer>();
        var stack = new ArrayDeque<Integer>();

        for (var n : nums2) {
            res.add(-1);
        }

        for (int i = nums2.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                res.set(i, stack.peek());
            }

            stack.push(nums2[i]);
        }

        return res.stream().mapToInt(i -> i).toArray();
    }

    /*
     * create a stack, and an array with same length as main array with -1 elements
     * start a for loop in reverse and a while loop in it
     * which runs if the stack is not empty and stack top element is less than or equal to current element of the array
     * keep popping stack - in while loop
     * after while loop check if stack is not empty and add top element of the stack to our array
     * after this if condition, push the element into the stack
     * return our array
     */
}
