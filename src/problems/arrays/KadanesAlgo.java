package problems.arrays;

public class KadanesAlgo {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    public static int maxSubArray ( int[] nums){
        int maxSum = nums[0];
        int currSum = nums[0];
        int i = 1;
        if (nums.length == 1) return nums[0];

        while (i < nums.length) {
            // update curr sum max(nums, nums + curr sum)
            if (nums[i] < nums[i] + currSum) {
                currSum += nums[i];
            } else {
                currSum = nums[i];
            }
            if (maxSum < currSum) {
                maxSum = currSum;
            }
            i++;
        }
        return maxSum;
    }
    public int maxSubArray2(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

}
