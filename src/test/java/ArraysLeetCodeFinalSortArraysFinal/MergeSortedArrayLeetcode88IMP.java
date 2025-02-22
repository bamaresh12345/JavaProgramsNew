package ArraysLeetCodeFinalSortArraysFinal;

import java.util.Arrays;
/*

You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be
merged,and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3  Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

Example 2:Input: nums1 = [1], m = 1, nums2 = [], n = 0 Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
 */

public class MergeSortedArrayLeetcode88IMP {

    public static void mergeSortedArray(int[] nums1, int[] nums2, int m, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = m + n - 1;

        while (p3 >= 0)  //j>= is imp
        {
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

        System.out.println(Arrays.toString(nums1));

    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};

        int[] nums2 = {2, 5, 6};

        int m = 3;
        int n = 3;

        mergeSortedArray(nums1, nums2, m, n);

        System.out.println("Integer.MIN_VALUE= " + Integer.MIN_VALUE);


    }
}
