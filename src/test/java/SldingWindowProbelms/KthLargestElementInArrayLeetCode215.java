package SldingWindowProbelms;


import java.util.Arrays;

/*
Given an integer array nums and an integer k, return the kth largest element in the array.
Note that it is the kth largest element in the sorted order, not the kth distinct element.
Can you solve it without sorting?
Example 1: Input: nums = [3,2,1,5,6,4], k = 2 Output: 5
Example 2: Input: nums = [3,2,3,1,2,4,5,5,6], k = 4 Output: 4

 */
public class KthLargestElementInArrayLeetCode215 {

    public static int kthLargestElementInArray(int[] nums, int k) {

        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums[n - k];


    }

    public static void main(String[] args) {
        //int[] nums =   {2,1,5,1,3,2};
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        System.out.println(kthLargestElementInArray(nums, k));
    }
}
