package arrays;

public class ShuffleArray {

    public static void main(String[] args) {

//        Input: nums = [2,5,1,3,4,7], n = 3  Output: [2,3,5,4,1,7]
        int[] nums = new int[]{2, 5, 1, 3, 4, 7};
        int n = 3;
        ShuffleArray shuffleArray = new ShuffleArray();
        int[] res = new int[nums.length];
        res = shuffleArray.shuffle(nums, n);
        for (int num : res) {
            System.out.println(num);
        }
    }

    public int[] shuffle(int[] nums, int n) {

        int[] res = new int[nums.length];
        int left = 0;
        int right = n;
        for (int i = 0; i < nums.length; i+=2) {
           res[i] = nums[left++];
           res[i+1] = nums[right++];
        }
        return res;
    }
}
