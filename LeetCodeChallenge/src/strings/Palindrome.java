package strings;


import java.util.LinkedList;

public class Palindrome {


    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        //String input = "";

        System.out.println(input.replaceAll("[^\\x00-\\x7F]",""));

        Palindrome p = new Palindrome();
        System.out.println(p.isValidPalindrome(input));


        LinkedList list = new LinkedList();
    }

    public boolean isValidPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        if ("" == s) return false;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
