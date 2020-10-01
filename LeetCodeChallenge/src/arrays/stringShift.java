package arrays;

import javax.swing.*;

public class stringShift {

    public static String stringShift(String s, int[][] shift) {
        int len = s.length();
        for (int[] a : shift) {
            if (a[0] == 0)
                s = s.substring(a[1]) + s.substring(a[0], a[1]);
            else
                s = s.substring(len - a[1]) + s.substring(0, len - a[1]);
        }
        return s;
    }

    public static void main(String[] args) {
//        String s = "abc";
//        int [][] shift = {{0,1},{1,2}};

        String s = "abcdefg";
        int[][] shift = {{1, 1}, {1, 1}, {0, 2}, {1, 3}};
        System.out.println(stringShift(s, shift));
    }
}
