package TwoPointers;
/* https://www.youtube.com/watch?v=BLFvXsBf5uM
26. 80. Remove Duplicates from Sorted Array II (USE MY HASHMAP SOLUTIONS NOT WORK PROPERLY)
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicatesFromSortedArray11Leetcode80 {

    public static int removeDuplicatesFromSortedArrayII(int[] nums) {
        /* USE TWO POINTERS concept with left element
        1. declare left=0 index of array
        2. run for each loop till end of array nums for(int n : nums)
        3. check if left<2 or n!=nums[left-2]
        4. then nums[left] = n;
        5. incment left++ to move to next element
        6. continute till end of array
        7. finally return left.


         */
//=================GOOD ONE============================================

        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            if (left < 2 || nums[right] != nums[left - 2]) {
                nums[left] = nums[right];
                left++;
            }

        }
        return left;

        //==================================================
    }

    public static void main(String[] args) {


        int[] nums = {1, 1, 1, 2, 2, 3}; //5
        // int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3}; //7

        System.out.println(removeDuplicatesFromSortedArrayII(nums));

        int[] nums1 = {1, 1, 1, 2, 2, 3}; //5
        // int[] nums1 = {0, 0, 1, 1, 1, 1, 2, 3, 3}; //7
        System.out.println(removeDuplicatesFromSortedArrayIIHashMap(nums1));


    }

    public static int removeDuplicatesFromSortedArrayIIHashMap(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {

                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        System.out.println(map);
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                count = count + 2;
                list.add(entry.getKey());

            } else if (entry.getValue() == 1) {
                count++;
                list.add(entry.getKey());
            }

        }
        System.out.println("list" + list);
        System.out.println("Count from HashMap ==> : " + count);
        return count;
    }


}
