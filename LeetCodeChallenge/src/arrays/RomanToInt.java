package arrays;

public class RomanToInt {
    public static void main(String[] args) {
        String s = "LVIII";
        RomanToInt rToI = new RomanToInt();
        System.out.println(rToI.romanToInt(s));
    }
    public int romanToInt(String s) {

        int len = s.length();
        int sum = 0;
        int[] inputVal = new int[len];
        System.out.println(s.charAt(0));


        for(int i=0; i < len; i++){
            switch(s.charAt(i)){
                case 'I':
                    inputVal[i] = 1;
                    break;
                case 'V':
                    inputVal[i] = 5;
                    break;
                case 'X':
                    inputVal[i] = 10;
                    break;
                case 'L':
                    inputVal[i] = 50;
                    break;
                case 'C':
                    inputVal[i] = 100;
                    break;
                case 'D':
                    inputVal[i] = 500;
                    break;
                case 'M':
                    inputVal[i] = 1000;
                    break;
            }
        }

        for(int i=0; i< len -1; i++){
            if(inputVal[i] >= inputVal[i+1]){
                sum += inputVal[i];
            }else{
                sum -= inputVal[i];
            }
        }

//         HashMap<Character,Integer> myMap = new HashMap();
//         myMap.put('I',1);
//         myMap.put('V',5);
//         myMap.put('X',10);
//         myMap.put('L',50);
//         myMap.put('C',100);
//         myMap.put('D',500);
//         myMap.put('M',1000);
//
//         int len = s.length();
//         int sum = myMap.get(s.charAt(len-1));
//
//         for(int i=0; i < len-1; i++){
//
//             if(myMap.get(s.charAt(i)) >= myMap.get(s.charAt(i+1))){
//                 sum += myMap.get(s.charAt(i));
//             }else{
//                 sum -= myMap.get(s.charAt(i));
//             }
//         }
//        return sum;
        return sum+=inputVal[inputVal.length-1];
    }
}
