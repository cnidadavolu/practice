import java.util.ArrayList;
import java.util.List;

public class AddFive {

    public static void main(String[] args) {
        System.out.println(addFive(268));
        System.out.println(addFive(670));
        System.out.println(addFive(0));
        System.out.println(addFive(-999));
        System.out.println(addFive(-945));
        System.out.println(addFive(-439));

        System.out.println("***************************");

        System.out.println(MaximumPossibleValue(268));
        System.out.println(MaximumPossibleValue(670));
        System.out.println(MaximumPossibleValue(0));
        System.out.println(MaximumPossibleValue(-999));
        System.out.println(MaximumPossibleValue(-945));
        System.out.println(MaximumPossibleValue(-439));

        System.out.println("***************************");

        System.out.println(largestNumber(268));
        System.out.println(largestNumber(670));
        System.out.println(largestNumber(0));
        System.out.println(largestNumber(-999));
        System.out.println(largestNumber(-945));
        System.out.println(largestNumber(-439));
    }

    private static int addFive(int num) {
        boolean isNegative = num < 0;
        String result = "";

        if (num == 0) {
            result += "5";
        }

        if (!isNegative) {
            String numStr = String.valueOf(num);
            for (int i = 0; i < numStr.length(); i++) {
                int digit = Integer.parseInt(String.valueOf(numStr.charAt(i)));
                if (5 > digit) {
                    result = numStr.substring(0, i) + "5" + numStr.substring(i);
                    break;
                }
            }
        } else {
           String numStr = String.valueOf(num * -1);
            for (int i = 0; i < numStr.length(); i++) {
                int digit = Integer.parseInt(String.valueOf(numStr.charAt(i)));
                if (5 < digit) {
                    result = numStr.substring(0, i) + "5" + numStr.substring(i);
                    break;
                }

            }
        }
//        for (int i = 0; i < temp.length(); i++) {
//            int digit = Integer.parseInt(String.valueOf(temp.charAt(i)));
//            if (5 > digit) {
//                result = temp.substring(0, i) + "5" + temp.substring(i);
//                break;
//            }
//            if(5 < digit){
//                result = temp.substring(0, i) + "5" + temp.substring(i);
//                //break;
//            }
//        }
        return isNegative == true ? Integer.parseInt(result) * -1 : Integer.parseInt(result);
    }

    public static int MaximumPossibleValue(int N) {
        if (N == 0) {
            return 50;
        }
        List<Integer> list = new ArrayList<>();
        boolean isPositive = N > 0;
        N = Math.abs(N);
        while (N > 0) {
            list.add(N % 10);
            N /= 10;
        }
        int k = 0;
        boolean isAdded = false;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (isPositive) {
                if (!isAdded && list.get(i) < 5) {
                    k = k * 10 + 5;
                    isAdded = true;
                }
            } else {
                if (!isAdded && list.get(i) > 5) {
                    k = k * 10 + 5;
                    isAdded = true;
                }
            }

            k = k * 10 + list.get(i);
        }
        if (!isAdded) {
            k = k * 10 + 5;
        }
        return k * (isPositive ? 1 : -1);
    }

    private static int largestNumber(int num) {
        boolean isNegative = num < 0;
        String resStr = "";
        if (!isNegative) {
            String temp = String.valueOf(num);
            for (int i = 0; i < temp.length(); i++) {
                int n = Integer.parseInt(String.valueOf(temp.charAt(i)));
                if (5 > n) {
                    resStr = temp.substring(0, i) + "5" + temp.substring(i);
                    break;
                }
            }
            if (resStr.length() == 0) {
                resStr += "5";
            }
        } else {
            String temp = String.valueOf(num * -1);
            for (int i = 0; i < temp.length(); i++) {
                int n = Integer.parseInt(String.valueOf(temp.charAt(i)));
                if (5 < n) {
                    resStr = temp.substring(0, i) + "5" + temp.substring(i);
                    break;
                }
            }

        }

        return isNegative == true ? Integer.parseInt(resStr) * -1 : Integer.parseInt(resStr);
    }
}
