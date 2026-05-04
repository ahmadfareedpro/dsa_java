package problems.arrays;

import java.util.Arrays;

public class RevArray {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    revArray(arr);
    }

    public static void revArray(int[] arr) {
        var left = 0;
        var right = arr.length - 1;

        while (left < right) {
            var temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));
    }
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        while ( j < nums.length) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }
}
