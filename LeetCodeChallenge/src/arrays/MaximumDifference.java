package arrays;

public class MaximumDifference {

    public static void main(String args[]) throws Exception {

        MaximumDifference md = new MaximumDifference();

        int[] arr1 = {2, 3, 10, 2, 4, 8, 1};
        System.out.println(md.maxDiff(arr1)); //8

        int[] arr2 = {7, 9, 5, 6, 3, 2};
        System.out.println(md.maxDiff(arr2)); //2

        int[] arr3 = {-1, -2, -3, -4, -5, -6};
        System.out.println(md.maxDiff(arr3)); //-1

    }

    public int maxDiff(int[] arr) {

        int maximumDiff = -1;
        int currDiff = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    currDiff = arr[j] - arr[i];
                }
                if (currDiff > maximumDiff) {
                    maximumDiff = currDiff;
                }
            }
        }
        return maximumDiff;
    }

}
