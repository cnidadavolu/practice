public class Palindrome {

    public static void main(String[] args) {
        int num = 121;
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(num));
    }

    public boolean isPalindrome(int x) {
        int num = x;
        int rev_num = 0;

        while (x > 0) {
            // if(Math.abs(rev_num) > Integer.MAX_VALUE/10){
            //     return false;
            // }
            rev_num = (rev_num * 10) + num % 10;
            num = num / 10;
        }
        System.out.println(rev_num);
        if (rev_num == x) {
            return true;
        }
        return false;
    }
}
