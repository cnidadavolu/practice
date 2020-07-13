public class ToLowerCase {

    public String toLowerCase(String str) {

        String result="";

        for(int i=0; i < str.length(); i++){
            char lChar = str.charAt(i);
            if(65 <= lChar && lChar <= 90 ){
                lChar = (char)((lChar+32));
            }
            result += lChar;
        }
        return result;
    }

    public static void main(String[]args){
        String input = "Hello wOrLD";
        ToLowerCase toLow = new ToLowerCase();
        System.out.println(toLow.toLowerCase(input));
    }
}
