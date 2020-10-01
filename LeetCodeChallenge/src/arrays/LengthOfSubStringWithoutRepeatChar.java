package arrays;

import java.util.HashMap;
import java.util.HashSet;

public class LengthOfSubStringWithoutRepeatChar {

    public int lengthOfLongestSubstring(String s) {

        int start = 0, len = 0;
        HashMap<Character, Integer> myMap = new HashMap();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (myMap.containsKey(ch)) {
                if (myMap.get(ch) >= start) {
                    start = myMap.get(ch) + 1;
                }
            }
            len = Math.max(len, i - start + 1);
            myMap.put(ch, i);
        }
        return len;
    }

//    public int lenOfSubString(String s){
//        int len=0, count=0;
//        HashSet<Character> mySet = new HashSet<>();
//        for(int i=0; i< s.length();i++){
//            char ch = s.charAt(i);
//            if(!mySet.contains(ch)){
//                mySet.add(ch);
//                count++;
//            }else{
//                break;
//            }
//        }
//        return count;
//    }

    public static void main(String[] args) {
//        Input : GEEKSFORGEEKS
//        Output : EKSFORG
//
//        Input : ABDEFGABEF
//        Output : BDEFGA
        String s = "GEEKSFORGEEKS";
        LengthOfSubStringWithoutRepeatChar lss = new LengthOfSubStringWithoutRepeatChar();
        System.out.println(lss.lengthOfLongestSubstring(s));
        System.out.println(lss.lengthOfLongestSubstring("ABDEFGABEF"));
        System.out.println(lss.lengthOfLongestSubstring("chaitanya"));
        System.out.println(lss.lengthOfLongestSubstring("priyadarsini"));
//        System.out.println("**************************************");
//        System.out.println(lss.lenOfSubString(s));
//        System.out.println(lss.lenOfSubString("ABDEFGABEF"));
//        System.out.println(lss.lenOfSubString("chaitanya"));
//        System.out.println(lss.lenOfSubString("priyadarsini"));
    }
}
