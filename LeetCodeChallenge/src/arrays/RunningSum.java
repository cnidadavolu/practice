package arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 1, 2, 10, 1};
        RunningSum runningSum = new RunningSum();

        int[] res = new int[nums.length];
        res = runningSum.runningSum(nums);
        for (int num : res) {
            System.out.println(num);
        }

    }

//    Input: nums = [3,1,2,10,1] //    Output: [3,4,6,16,17]

    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                runningSum[i] = nums[i] + runningSum[i];
            } else {
                runningSum[i] = nums[i] + runningSum[i - 1];
            }
        }
        return runningSum;
    }
}
