package strings;

public class Palindrome {


    public static void main(String[] args) {
        String input = "aaabaaaabaa";
        //String input = "";
        Palindrome p = new Palindrome();
        System.out.println(p.isValidPalindrome(input));
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
