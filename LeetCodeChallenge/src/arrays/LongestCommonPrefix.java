package arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        //String[] input = {"flower", "flow", "flight","found"};
        String[] input = {"cadog", "caracecar", "car"};

        LongestCommonPrefix lprefix = new LongestCommonPrefix();
        //  System.out.println(lprefix.longestCommonPrefix(input));
        System.out.println(lprefix.longestCommonPrefix1(input));
    }

    public String longestCommonPrefix1(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            StringBuffer sb = new StringBuffer();
            int len = (strs[i].length() < prefix.length() ? strs[i].length() : prefix.length());
            while (j < len) {
                if (prefix.charAt(j) == strs[i].charAt(j)) {
                    sb.append(prefix.charAt(j));
                }
                j++;
            }
            prefix = sb.toString();
            //   System.out.println(prefix);
            if (prefix.isEmpty()) return "";
        }
        return prefix;
    }


    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                System.out.println(prefix);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }


}
