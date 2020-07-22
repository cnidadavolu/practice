package hashmap;

import java.util.HashMap;
        import java.util.Map;

public class UniqueNumber {

    public int singleNumber(int[] nums) {

        Map<Integer, Integer> myHash = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (myHash.containsKey(nums[i])) {
                myHash.put(nums[i], myHash.get(nums[i]) + 1);
            } else {
                myHash.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : myHash.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }

}
