package LeetCode150Questions;

import java.util.HashSet;
import java.util.Set;

/*
80. Remove Duplicates from Sorted Array II  Medium

Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that
 each unique element appears at most twice. The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have
 the result be placed in the first part of the array nums. More formally, if there are k elements
 after removing the duplicates, then the first k elements of nums should hold the final result. It
 does not matter what you leave beyond the first k elements.

 Input: nums = [0,0,1,1,1,1,2,3,3]
Output: 7, nums = [0,0,1,1,2,3,3,_,_]
Explanation: Your function should return k = 7, with the first seven elements of nums
being 0, 0, 1, 1, 2, 3 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */

public class removeDuplicatesfromSortedArrayII {

    public static int RemoveDuplicatesfromSortedArrayII(int[] nums) {


        int i = 0;
        for (int n : nums) {
            if (i < 2 || n != nums[i - 2]) {  //n == nums[i - 2] , jsut it will continue the array
                nums[i] = n;
                i++;
            }
        }

        return i;

    }

    public static void main(String[] args) {
        //int[] nums = {1, 1, 2};
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};

        System.out.println(RemoveDuplicatesfromSortedArrayII(nums));

    }


    public static int removeDuplicatesfromSortedArraySets(int[] nums) {

        int counter = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            set.add(nums[i]);

        }

        return set.size();
    }
}
