public class HappyNumber {

    static int squareOfDigits(int num) {
        int sq = 0;
        while (num != 0) {
            int x = num % 10;
            sq += x * x;
            num = num / 10;
        }
        return sq;
    }

    public static boolean isHappy(int n) {
        while (true) {
            if (n == 1) return true;
            n = squareOfDigits(n);
            if (n == 4) return false;
        }
    }

    public static void main(String args[]) {

        int num = 2;
        if (isHappy(num)) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Non Happy Number");
        }
    }
}
