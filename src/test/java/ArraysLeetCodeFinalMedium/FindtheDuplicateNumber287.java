package ArraysLeetCodeFinalMedium;

import java.util.HashSet;
import java.util.Set;

/* 287. Find the Duplicate Number
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and using only constant extra space.

Example 1: Input: nums = [1,3,4,2,2] Output: 2
Example 2: Input: nums = [3,1,3,4,2] Output: 3
 */
public class FindtheDuplicateNumber287 {

    //Works fine in leetcode
    public static int findDuplicateUsingSet(int[] nums) {

        Set<Integer> set = new HashSet<>();  //  Set<String>  if its String array

        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i]))  // *** IMP !set.add(nums[i])  or set.add(nums[i])==false
            {

                return nums[i]; // only if one duplicate element to find
            }
        }


        return -1;

    }


    public static void main(String[] args) {

        int[] nums = {1, 3, 4, 2, 2}; // 2

        System.out.println(findDuplicateBruteForce(nums));
        System.out.println(findDuplicateUsingSet(nums));
    }


    // Exceed limit in Leetcode, stil its ok to write
    public static int findDuplicateBruteForce(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {

                    return nums[i];

                }
            }


        }
        return -1;
    }

}

