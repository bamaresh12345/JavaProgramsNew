package ArraysLeetCodeFinalSortArraysFinal;

import java.util.Arrays;

/* 977 Squares of sorted array
Given an integer array nums sorted in non-decreasing order, return an array of the squares of
each number sorted in on-decreasing order.

Input: nums = [-4,-1,0,3,10] Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Input: nums = [-7,-3,2,3,11] Output: [4,9,9,49,121]


 */
public class SortedArrayofSquaresLt977 {

    public static int[] squaresofSortedArrayBryteForce(int[] nums) {
        /*
        1. run for loop
        2. squear each array value
        3. sor the array.
         */

        for (int i = 0; i < nums.length; i++) {

            nums[i] = nums[i] * nums[i];

        }

        int temp = 0;
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] < nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }


        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {-4, -1, 0, 3, 10};

        //System.out.println(Arrays.toString(squaresofSortedArrayBryteForce(nums)));
        //int[] nums1 = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(squaresofSortedArrayDivideandConqure(nums)));

    }

    /*  DONT go with this method****
      1. run for loop and meake squre of each array item
      2. take two pointers start and end
      3. run for loop in reverse order
      4.  if(nums[start] > nums[end]  assing arr[i] = nums[start] to new array and incrment start++
      5.    nums[start] is not greater nums[end]   --> assing arr[i] = nums[end] to new array and decrment end--;
     */
    public static int[] squaresofSortedArrayDivideandConqure(int[] nums) {

        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        int start = 0;
        int end = nums.length - 1;

        //*** VERY IMP not able to recall
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[start] > nums[end]) {
                arr[i] = nums[start];
                start++;
            } else {
                arr[i] = nums[end];
                end--;


            }
        }
        System.out.println(nums);
        return arr;
    }

}
