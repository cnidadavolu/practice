package arrays;

import java.util.*;

public class GroupAnagrams {

    //    Input: strs = ["eat","tea","tan","ate","nat","bat"]
    //    Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap();

        for (String str : strs) {
            char[] keyChar = str.toCharArray();
            Arrays.sort(keyChar);
            List<String> anagramsList;
            if (map.containsKey(String.valueOf(keyChar))) {
                anagramsList = map.get(String.valueOf(keyChar));
            } else {
                anagramsList = new ArrayList();
            }
            anagramsList.add(str);
            map.put(String.valueOf(keyChar), anagramsList);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();

        System.out.println(ga.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }


}
