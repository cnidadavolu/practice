package arrays;

import java.util.ArrayList;
import java.util.List;

public class MaximumCandies {

    public static void main(String[] args) {
        MaximumCandies mc = new MaximumCandies();
        int[] candies = {2, 3, 5, 1, 3};
        List<Boolean> res = mc.kidsWithCandies(candies, 3);

        for (Boolean l : res) {
            System.out.println(l);
        }
    }

//    Input: candies = [2,3,5,1,3], extraCandies = 3
//    Output: [true,true,true,false,true]

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList();
        int maxVal = getMax(candies);

        for (int j = 0; j < candies.length; j++) {
            if (candies[j] + extraCandies >= maxVal) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

    public int getMax(int[] inputArray) {
        // int max = inputArray[0];
        int max = -1;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > max) {
                max = inputArray[i];
            }
        }
        return max;
    }
}
