package arrays;

public class DecompressRunLengthEncode {

    public static void main(String[] args) {
        DecompressRunLengthEncode dc = new DecompressRunLengthEncode();
        int[] nums = {1, 2, 3, 4};
   //     int[] res = dc.decompressRLElist(nums);
        for (int num : dc.decompressRLElist(nums)) {
            System.out.println(num);
        }
    }

    public int[] decompressRLElist(int[] nums) {

        int len=0;
        for(int i=0;i< nums.length;i+=2){
            len+=nums[i];
        }
        int[] result = new int[len];
        int k,j=0;
        for(int i =0; i < nums.length; i+=2){
            k=0;
            while (k < nums[i]){
                result[j] = nums[i+1];
                k++;
                j++;
            }
        }

//        Map<Integer, Integer> myMap = new HashMap();
//        //int[] result = new int[nums.length];
//        int freq;
//
//        for (int i = 0; i < nums.length; i += 2) {
//            myMap.put(nums[i], nums[i + 1]);
//        }
//
//        for (Map.Entry me : myMap.entrySet()) {
//            System.out.println("Key: " + me.getKey() + " & Value: " + me.getValue());
//            freq = (int) me.getKey();
//            for (int i = 0; i < freq; i++) {
//                result[i] = (int) me.getValue();
//            }
//        }
        return result;
    }
}
