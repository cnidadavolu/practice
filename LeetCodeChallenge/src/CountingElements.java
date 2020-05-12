import java.util.HashSet;

public class CountingElements {

    public static int countElements(int[] arr) {
        int count = 0;
        HashSet<Integer> hSet = new HashSet();
        for (int i : arr) {
            hSet.add(i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (hSet.contains(arr[i] + 1)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2}; //{1, 3, 2, 3, 5, 0};
        System.out.println(countElements(arr));
    }
}
