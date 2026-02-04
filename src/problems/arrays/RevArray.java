package problems.arrays;

public class RevArray {
    public static void main(String[] args) {

    }

    public static void revArray(int[] arr) {
        var left = 0;
        var right = arr.length - 1;

        while (left < right) {
            var temp = arr[left];
            arr[left] = arr[right];
        }
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
}
