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

        return null;
    }
}
