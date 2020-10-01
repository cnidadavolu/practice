package arrays;

import java.util.HashMap;

public class MaxElementInArray {

    public static void main(String[] args) {
        // int[] arr = {1,2,332,23,553,9999,0,-1};
        int[] arr = {-1, -2, -332, -23, -553, -9999, -11};

        MaxElementInArray maxElementInArray = new MaxElementInArray();
        int newLen = maxElementInArray.maxElement(arr);
        System.out.println(newLen);

    }

    public int maxElement(int[] arr) {

        HashMap<String, String> myMap;


        int maxVal = arr[0];
        for (int elmnt : arr) {
            if (elmnt > maxVal) {
                maxVal = elmnt;
            }
        }
        return maxVal;
    }
}
