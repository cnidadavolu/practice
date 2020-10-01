package arrays;

public class IntToRoman {

    public static void main(String[] args) {
        IntToRoman ir = new IntToRoman();
        for (int i = 1; i < 51; i++) {
            System.out.println(i + " --> " + ir.intToRoman(i));
        }
    }

    public String intToRoman(int num) {

        int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] romans = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "CM", "M"};

        StringBuilder res = new StringBuilder();

        for (int i = values.length - 1; i > -1 && num >= 0; i--) {
            while (num >= values[i]) {
                num = num - values[i];
                res.append(romans[i]);
            }
        }
        return res.toString();
    }

}
