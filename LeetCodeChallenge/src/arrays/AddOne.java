package arrays;

public class AddOne {

    public int[] plusOne(int[] digits) {

        StringBuffer sb = new StringBuffer();
        for(int i=0; i < digits.length; i++){
            sb.append(digits[i]);
        }

        Long result = Long.parseLong(sb.toString()) + 1;
        int [] plusOne = new int[Long.toString(result).length()];

        for(int i = plusOne.length-1; i >= 0; i--){

            plusOne[i] = (int) (result % 10);
            result = result/10;

        }
        return plusOne;
    }

    public static void main(String[] args) {

    }

}
