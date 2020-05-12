import java.util.Stack;

public class ParanthesisBalanced {

    public static boolean checkValidString(String s) {
        Stack<Character> st = new Stack();


        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);

            if (ch == '{' || ch == '(' || ch == '[')
                st.push(ch);

            if (ch == '}' || ch == ')' || ch == ']') {

                if (st.isEmpty())
                    return false;

                if (st.peek() == '{' && ch == '}') {
                    return true;
                } else if (st.peek() == '[' && ch == ']') {
                    return true;
                } else if (st.peek() == '(' && ch == ')') {
                    return true;
                } else {
                    return false;
                }
            }
        }
        if (st.isEmpty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String str = "("; //"(*))"; //"()";
        System.out.println(checkValidString(str));
    }
}