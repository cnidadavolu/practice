import java.util.HashMap;
import java.util.LinkedList;

public class UniqueCharacter {

    public static void main(String[] args) {
        String s = "leetcode";
        UniqueCharacter uniqueCharacter = new UniqueCharacter();
        System.out.println(uniqueCharacter.firstUniqChar(s));
    }

    public int firstUniqChar(String s) {

        HashMap<Character, Integer> myMap = new HashMap();
        char[] charArr = s.toCharArray();

        if(charArr.length == 0 || s.equals("")){
            return -1;
        }

//        for (char ch : charArr) {
//            int count =1;
//            if (!myMap.containsKey(ch)) {
//                myMap.put(ch, count);
//            } else {
//                count = myMap.get(ch);
//                myMap.put(ch, ++count);
//            }
//        }
        for(int i=0; i < charArr.length; i++){
            myMap.put(charArr[i], myMap.getOrDefault(charArr[i],0)+1);
        }

        LinkedList <String> llist = new LinkedList<>();
        llist.add("chai");
        llist.add("chaitanya")

        for (int j = 0; j < charArr.length; j++) {
            if (myMap.get(charArr[j]) == 1) {
                return j;
            }
        }
        return -1;
    }
}
