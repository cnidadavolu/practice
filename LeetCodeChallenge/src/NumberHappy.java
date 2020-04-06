public class NumberHappy {

    // Returns sum of squares of
    // digits of a number n. For
    // example for n = 12 it
    // returns 1 + 4 = 5
    static int sumDigitSquare(int n) {
        int sq = 0;
        while (n != 0) {
            int digit = n % 10;
            sq += digit * digit;
            n = n / 10;
        }
        return sq;
    }

    // Returns true if n is Happy
    // number else returns false.
    static boolean isHappy(int n) {
        // Keep replacing n with
        // sum of squares of digits
        // until we either reach 1
        // or we end up in a cycle
        while (true) {

            // Number is Happy if
            // we reach 1
            if (n == 1)
                return true;

            // Replace n with sum
            // of squares of digits
            n = sumDigitSquare(n);

            // Number is not Happy
            // if we reach 4
            if (n == 4)
                return false;
        }

    }

    // Driver code
    public static void main(String args[]) {
        int n = 19;
        if (isHappy(n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}