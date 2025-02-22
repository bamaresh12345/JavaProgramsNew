package TwoPointer;

import java.util.Arrays;

public class MergeSortedArrayLeetcodeMedium {

    public static int[] MergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;

        while (p3 >= 0) {
            int element1 = 0, element2 = 0;
            element1 = (p1 >= 0) ? nums1[p1] : Integer.MIN_VALUE;
            element2 = (p2 >= 0) ? nums2[p2] : Integer.MIN_VALUE;

            if (element1 > element2) {
                nums1[p3] = element1;
                p3--;
                p1--;
            } else {
                nums1[p3] = element2;
                p3--;
                p2--;
            }


        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        System.out.println(Arrays.toString(MergeSortedArray(nums1, m, nums2, n)));
    }
}
