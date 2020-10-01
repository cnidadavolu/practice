package strings;

public class ReverseString {

    public static void main(String[] args) {
        char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
        ReverseString rs = new ReverseString();
        rs.reverseString(s);
        rs.reverseString2(s);
        for (char ch : s) {
            System.out.println(ch);
        }
    }

    public void reverseString(char[] s) {

        int i = 0, j = s.length - 1;

        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }

    public void reverseString2(char[] s) {
        StringBuffer sb = new StringBuffer();
        for (int i = s.length - 1; i >= 0; i--) {
            sb.append(s[i]);
        }
        s = sb.toString().toCharArray();
    }
}
