import java.util.Arrays;
import java.util.HashMap;

public class MissingNumber {

    public static void main(String[] args) {
        int [] nums = {3,0,1};
        MissingNumber mn = new MissingNumber();
        System.out.println(mn.missingNumber(nums));

    }

    public int missingNumber(int[] nums) {

        HashMap<Character, Integer> myMap = new HashMap();
        myMap.put('a',1);
        Arrays.sort(nums);
        int len = nums.length;
        int maxVal = nums[len-1];
        int i = maxVal;
        while (i >= 0){
            if(!Arrays.asList(nums).contains(i)){
                return i;
            }
            i--;
        }
//        for(int i=maxVal; i <= maxVal && i>=0; i--){
//            boolean test = Arrays.asList(nums).contains(i);
//            if(test){
//               return i;
//            }
//        }
        return -1;
    }






}
