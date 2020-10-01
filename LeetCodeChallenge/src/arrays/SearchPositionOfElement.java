package arrays;

import java.util.ArrayList;
import java.util.List;

public class SearchPositionOfElement {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        //int [] nums = {};
        int target = 7;
        SearchPositionOfElement sp = new SearchPositionOfElement();
        for (int i : sp.searchRange(nums, target)) {
            System.out.println(i);
        }

        try {

            System.out.println("a");
        } catch (Exception ex) {
            System.out.println("b");
        } finally {
            System.out.println("c");
        }
        System.out.println();
    }

    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        int left = 0, right = nums.length;
        int temp;
        if (nums.length == 0) return result;

        if ((left == nums.length - 1 && nums[0] != target)) {
            return result;
        }

        while (left <= right) {
            int middle = (left + right) / 2;

            if (nums[middle] == target) {
//                if (nums[middle - 1] == target) {
//                    result[0] = middle - 1;
//                    result[1] = middle;
//                    return result;
//                } else {
//                    result[0] = middle;
//                    result[1] = middle + 1;
//                    return result;
//                }
                if (middle < right) {
                    result[0] = middle;
                    result[1] = middle + 1;
                }
                return result;
            }

            if (nums[middle] < target) {
                left = middle + 1;
            }

            if (nums[middle] > target) {
                right = middle - 1;
            }
        }

        return result;
    }
}
