public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1534236469;
        ReverseNumber rev = new ReverseNumber();
        System.out.println(rev.reverse(num));
    }
//-2147483648 to 2147483647
    public int reverse(int x) {
        int rev_num = 0;
        boolean negNum = false;

        if(x<0){
            negNum = true;
            x = -x;
        }
        while(x > 0){
            if(Math.abs(rev_num)/10 > Integer.MAX_VALUE){
                return 0;
            }
            rev_num = (rev_num * 10) + x % 10;
            x = x/10;
        }
//        if(!(minVal < rev_num && rev_num < maxVal)){
//            return 0;
//        }
        return (negNum == true) ? -rev_num : rev_num;
    }
}
