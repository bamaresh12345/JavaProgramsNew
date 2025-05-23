package LeetCode150Questions;
/*
26. Remove Duplicates from Sorted Array  Easy

Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that
 each unique element appears only once. The relative order of the elements should be kept the same.
  Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following
things:

Change the array nums such that the first k elements of nums contain the unique elements in the order
 they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.

Example 1:  Input: nums = [1,1,2] Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesfromSortedArray {

    public static int removeDuplicatesfromSortedArray(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {

            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {  //*** IMP this hosuld be at top else it will give wrong result

                continue;
            } else {

                nums[counter++] = nums[i];
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        //int[] nums = {1, 1, 2};
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};


        int index = removeDuplicatesfromSortedArray(nums); //******VERY OMP
        for (int i = 0; i < index; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.println("\n************");
        int index2 = removeDuplicatesfromSortedArraySets(nums1);   //******VERY OMP
        for (int i = 0; i < index2; i++) {
            System.out.print(" " + nums1[i]);
        }

        System.out.println("\n************");
        int index3 = removeDuplicatesfromSortedArrayTwoPointers(nums2);   //******VERY OMP
        for (int i = 0; i < index3; i++) {
            System.out.print(" " + nums2[i]);
        }
    }


    public static int removeDuplicatesfromSortedArraySets(int[] nums) {

        int counter = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            set.add(nums[i]);

        }

        return set.size();
    }

    public static int removeDuplicatesfromSortedArrayTwoPointers(int[] nums) {

        int n = nums.length;

        if (n < 2)
            return n;

        //define pointers
        int L = 0, R = 0;

        //remove dup in place
        while (R < n) {
            if (nums[L] != nums[R]) {
                L++;
                nums[L] = nums[R];
            }
            R++;
        }

        //return size of array
        return L + 1;
    }
}
