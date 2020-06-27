import java.util.Arrays;

public class AnagramsStrings {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        AnagramsStrings anagramsStrings = new AnagramsStrings();
        System.out.println(anagramsStrings.isAnagram(s, t));
    }

    public boolean isAnagram(String s, String t) {

        // if((s == null && t != null) || (s != null && t == null)){
        //     return false;
        // }

        // if(s == null && t == null){
        //     return true;
        // }

        if (s.length() != t.length()) {
            return false;
        }

        char[] cs = s.toCharArray();
        Arrays.sort(cs);

        char[] ct = t.toCharArray();
        Arrays.sort(ct);

        // if(Arrays.equals(cs,ct)){
        //     return true;
        // }
        return Arrays.equals(cs, ct);
    }
}
