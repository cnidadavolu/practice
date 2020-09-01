package arrays;

import java.util.Arrays;

public class SmallerThanCurrentNumber {

    public static void main(String[] args) {
        int [] input = {8,1,2,2,3};
        Arrays.sort(input);
        for(int i=0; i < input.length;i++){
            System.out.println("index: " +i +"value: " + input[i]);
        }
    }
}
