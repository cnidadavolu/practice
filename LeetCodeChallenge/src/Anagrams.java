import java.util.*;

//
// ["eat","tea","tan","ate","nat","bat"]
public class Anagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List> result = new HashMap();

        for (int i = 0; i < strs.length; i++) {
            char [] strChars = strs[i].toCharArray();
            Arrays.sort(strChars);
            String key = String.valueOf(strChars);
            if(!result.containsKey(key))
                result.put(key, new ArrayList());
            result.get(key).add(strChars);
        }
        return new ArrayList(result.values());
    }

    public static  void main(String [] args){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs).toString());
    }

}
