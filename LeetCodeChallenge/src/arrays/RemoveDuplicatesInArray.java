package arrays;

public class RemoveDuplicatesInArray {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2};

        RemoveDuplicatesInArray removeDuplicatesInArray = new RemoveDuplicatesInArray();
        int newLen = removeDuplicatesInArray.removeDuplicates(arr);
        for(int i=0; i < newLen; i++){
            System.out.println(arr[i]);
        }
    }

    public int removeDuplicates(int[] nums) {

        int len = nums.length;
        int pos = 0;

        if (len == 0) {
            return 0;
        }

        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[pos]) {
                pos++;
                nums[pos] = nums[i];
            }
        }
        System.out.println(nums);
        return pos + 1;
    }
}
