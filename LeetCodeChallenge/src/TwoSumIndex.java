/*
Given nums = [2, 7, 11, 15], target = 9
        Because nums[0] + nums[1] = 2 + 7 = 9,
        return [0, 1].
*/

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumIndex {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSumIndex twoSumIndex = new TwoSumIndex();
        System.out.println(Arrays.toString(twoSumIndex.twoSum(nums, target)));
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i =0; i < nums.length; i++){
            map.put(nums[i],i);
        }
        // n times


        for (int j =0; j< nums.length;j++){
            int diff = target - nums[j];
            if(map.containsKey(diff) && map.get(diff) != j){
                return new int[]{j,map.get(diff)};
            }
        }
        // n times -> n+n times + space -> o(n)
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSum2(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            int diff = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == diff) {
                    return new int[]{i, j};
                }
            }
        }
//        throw new IllegalArgumentException("No two sum solution");
        return new int[] {-1,-1};
    }

    public int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

//    [3,2,5,12,8,1]; 4 -> nlog(n) + n
//
//    [1,2,3,5,8,12]; 7
//    while(i < j)
//    i = 0 j = 5 -> 1+12 = 13 j--
//    i =0 j = 4 -> 1+8 => 9 j--
//    i =0 j = 3 => 6 i++
//    i = 1 j = 3 -> 7 return true;
}