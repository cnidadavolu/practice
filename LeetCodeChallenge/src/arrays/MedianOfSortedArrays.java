package arrays;

import java.util.Collections;

public class MedianOfSortedArrays {
    public static void main(String[] args) {
        MedianOfSortedArrays msa = new MedianOfSortedArrays();
        //   int[] nums1 = {3}; //{1,2};
        //   int[] nums2 = {-2,-1}; //{3,4};

        double d = 10 / -0;
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(msa.findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median;
        int m = nums1.length, n = nums2.length;
        int[] mergeArr = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                mergeArr[k++] = nums1[i++];
            } else {
                mergeArr[k++] = nums2[j++];
            }
        }

        while (i < m) {
            mergeArr[k++] = nums1[i++];
        }
        while (j < n) {
            mergeArr[k++] = nums2[j++];
        }

        int mergeLen = mergeArr.length;

        if (mergeLen % 2 == 0) {
            median = (mergeArr[mergeLen / 2] + mergeArr[mergeLen / 2 - 1]) / 2.0;
        } else {
            median = mergeArr[mergeLen / 2];
        }

        return median;
    }


}
