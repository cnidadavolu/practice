import java.util.Arrays;

public class BinaryToDecimal {

    public static void main(String[] args) {
        // int[] nums = {1,0,1};
        int[] nums = {1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0};
        BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
        System.out.println(binaryToDecimal.getDecimalValue(nums));
    }

    public int getDecimalValue(int[] binNums) {
        int sum = 0;
        int len = binNums.length;
        for (int i = 0; i < len; i++) {
            sum += binNums[i] * Math.pow(2, (len - i - 1));
        }
        return sum;
    }
}
