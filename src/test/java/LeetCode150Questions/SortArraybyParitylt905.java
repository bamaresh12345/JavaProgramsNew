package LeetCode150Questions;

import java.util.Arrays;

/* 905 Sort Array by Parity  (even numbers 1st and odd numbers 2nd)
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
Input: nums = [3,1,2,4] Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 */
public class SortArraybyParitylt905 {

    public static int[] sortArraybyParityBruteForce(int[] nums) {
       /*
         0. Inilitize counter pinter as 0
          1. create new array with same lenght of given array
          2. run for loop and do array[i] % 2==0, will give the even number
          3. store even nubmers in array (use counter as pointer)
          2. run for loop and do array[i] % 2==1, will give the odd number
           3. store odd nubmers in array  (use counter as pointer)
        */

        int[] arr = new int[nums.length];
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                arr[counter] = nums[i];
                counter++;
            }

        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                arr[counter] = nums[i];
                counter++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};

        System.out.println(Arrays.toString(sortArraybyParityBruteForce(nums)));
    }

}
