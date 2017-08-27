package test;

import java.util.Arrays;

/**
 * Project: LearnJava
 * Package: test
 * Author:  Novemser
 * 2017/3/14
 */
public class ArraySort {
    public static void main(String[] args) {
        int[] intArray = new int[]{4, 1, 3, -23};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length, j, i;

        if (m > n) {
            int temp = m;
            m = n;
            n = temp;

            int[] arr = nums1;
            nums1 = nums2;
            nums2 = arr;
        }
        int imin = 0, imax = m, half = (m + n + 1) / 2;
        while (imin <= imax) {
            i = (imax + imin) >> 1;
            j = half - i;
            if (i > 0 && nums1[i - 1] > nums2[j])
                imax--;
            else if (i < m && nums1[i] < nums2[j - 1])
                imin++;
            else {
                int mL;
                if (i == 0)
                    mL = nums2[j - 1];
                else if (j == 0)
                    mL = nums1[i - 1];
                else
                    mL = Math.max(nums1[i - 1], nums2[j - 1]);


            }
        }
        return 0;
    }
}
