package problems.stack;

import java.util.*;

public class NextGreater {
    static int[] nums1 = {4, 1, 3};
    static int[] nums2 = {1, 3, 4, 2};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new LinkedHashMap<>();
        Stack<Integer>st=new Stack<>();
        int lengthNums2=nums2.length;
        for(int i = lengthNums2 - 1; i >= 0 ; i--){
            while(!st.isEmpty() && st.peek() < nums2[i]){
                st.pop();
            }
            if(st.isEmpty()) map.put(nums2[i], -1);
            else map.put(nums2[i], st.peek());
            st.push(nums2[i]);
        }
        int [] res = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            res[i] = map.get(nums1[i]);
        }
        return res;
    }

    /*
     *
     */
}
