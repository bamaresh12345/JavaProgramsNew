package ArraysLeetCodeFinalMedium;
/* https://www.youtube.com/watch?v=BLFvXsBf5uM
26. 80. Remove Duplicates from Sorted Array II (only one solution)
Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique
 element appears at most twice. The relative order of the elements should be kept the same.
Since it is impossible to change the length of the array in some languages, you must instead have the result be
 placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates,
 then the  first k elements of nums should hold the final result. It does not matter what you leave beyond the
  first k elements.

Example 1:
Input: nums = [1,1,1,2,2,3]  Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Return k after placing the final result in the first k slots of nums.

Input: nums = [0,0,1,1,1,1,2,3,3] Output: 7, nums = [0,0,1,1,2,3,3,_,_]

 */

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedArray11Leetcode80 {

    public static int removeDuplicatesFromSortedArrayII(int[] nums) {
        /* USE TWO POINTERS Left and Right

        1. get the length of array n = nums.length
        2. check if n<2 then return n;
        3. declare i=0, to get teh count of unique numbers
        4. run for loop till int n : nums till end of array
        5. check if i < 2 or n!= nums[i-2] ***
        6. if yes assign nums[i] = n
        7.  incrment i++
        8. finally retun i ,which contains remaing unique elements

         */
//=================GOOD ONE============================================
        int i = 0;
        for (int n : nums) {
            if (i < 2 || n != nums[i - 2]) {
                nums[i] = n;
                i++;
            }

        }

        return i;
        //==================================================
    }

    public static void main(String[] args) {


        int[] nums = {1, 1, 1, 2, 2, 3}; //5
        // int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3}; //7

        System.out.println(removeDuplicatesFromSortedArrayII(nums));


    }


}
