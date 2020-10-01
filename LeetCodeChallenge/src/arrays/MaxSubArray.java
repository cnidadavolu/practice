package arrays;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = nums[0];

        for (int i : nums) {
            currentSum = Math.max(i, currentSum + i);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;

    }

    public static void main(String args[]) {

        int num = 2;
    }
}
