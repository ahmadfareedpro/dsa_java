package problems.twopointer;

import java.util.Arrays;

public class SumOfPairEqualToTarget {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfPairEqualToTarget(new int[]{2, 7, 11, 15}, 9)));
    }

    public static int[] sumOfPairEqualToTarget(int[] nums, int target) {
      var left = 0;
      var right = nums.length -1;

      while (left < right){
          var sum = nums[left] + nums[right];
          if (sum == target) {
              return new int[]{nums[left], nums[right]};
          } else if (sum < target) {
              left++;
          } else {
              right--;
          }
      }
      return  new int[]{-1, -1};
    };
}
