package arrays;

public class HammingWeights {

    public int hammingWeight(int n) {

        char[] ch = String.valueOf(n).toCharArray();
        int count = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
        HammingWeights hw = new HammingWeights();
        System.out.println(hw.hammingWeight(n));
    }


}
