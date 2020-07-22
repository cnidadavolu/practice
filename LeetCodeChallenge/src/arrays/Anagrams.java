package arrays;

import java.util.*;

//
// ["eat","tea","tan","ate","nat","bat"]
public class Anagrams {

    public static List<List<String>> groupAnagrams(String[] strns) {

        Map<String, List> result = new HashMap();

        for (int i = 0; i < strns.length; i++) {
            char [] strChars = strns[i].toCharArray();
            Arrays.sort(strChars);
            String key = String.valueOf(strChars);
            if(!result.containsKey(key))
                result.put(key, new ArrayList());
            result.get(key).add(strChars);
        }
        return new ArrayList(result.values());
    }

    public static  void main(String [] args){
        String[] strns = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strns).toString());
    }

}
