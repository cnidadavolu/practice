package strings;

import java.util.Stack;

public class BackspaceStringCompare {
        public static boolean backspaceCompare(String S, String T) {

//            String str1 = removeHash(S);
//            String str2 = removeHash(T);
//
//            System.out.println("str1" + str1);
//            System.out.println("str2" + str2);
//
//            return str1.equals(str2);

            return removeHash(S).equals(removeHash(T));
        }

        public static String removeHash(String str){
            Stack<Character> s = new Stack<>();

            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) != '#'){
                    s.push(str.charAt(i));
                }else {
                    if (s.empty()) continue;
                    s.pop();
                }
            }
            return s.toString();
        }

        public static void main(String [] args){
            String S = "a##c", T = "#a#c"; //"ab#c";
          //  String S = "ab#c", T = "ad#c"; //"ad#c";
 //           String S = "a#c", T = "b";

            if(backspaceCompare(S,T)){
                System.out.println("Strings are equal");
            }else {
                System.out.println("Strings are not equal");
            }
        }
}
