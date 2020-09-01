package arrays;

public class MedianOfSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double sum1 = 0, sum2 = 0;
        int l1 = nums1.length, l2 = nums2.length;

       // double median;

        for (int j : nums1) {
            sum1 += j;
        }
        System.out.println("sum1: "+sum1+"  l1: "+l1);

        for (int i : nums2) {
            sum2 += i;
        }
        System.out.println("sum2: "+sum2+"  l2: "+l2);
        //median = (sum1 + sum2) / (l1 + l2);
        //return median;

        return (sum1 + sum2) / (l1 + l2);

    }

    public static void main(String[] args) {
        MedianOfSortedArrays msa = new MedianOfSortedArrays();
     //   int[] nums1 = {3}; //{1,2};
     //   int[] nums2 = {-2,-1}; //{3,4};

        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(msa.findMedianSortedArrays(nums1, nums2));
    }


}
