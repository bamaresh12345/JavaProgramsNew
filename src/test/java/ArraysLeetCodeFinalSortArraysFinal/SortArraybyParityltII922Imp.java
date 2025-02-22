package ArraysLeetCodeFinalSortArraysFinal;

import java.util.Arrays;

/* 922 Sort Array by Parity II  (even numbers at even Index and odd numbers @ oddIndex)
Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
Return any answer array that satisfies this condition.

Input: nums = [4,2,5,7]
Output: [4,5,2,7] ***Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.

 */
public class SortArraybyParityltII922Imp {

    public static int[] sortArraybyParityBruteForce(int[] nums) {
       /*
         0. Inilitize counter pinter as 0
          1. create new array with same lenght of given array
          2. declare 2 variables evenIndex=0, oddIndex=1
          2. run for loop and do array[i] % 2==0, will give the even number
          3. store even nubmers in array (use evenIndex as pointer)
          4. increament evenIndex = evenIndex +2;
          2. run for loop and do array[i] % 2==1, will give the odd number
           3. store odd nubmers in array  (use oddIndex as pointer)
           5. incrment oddIndex = oddIndex+2;
           6. return new array arr;
        */

        int[] arr = new int[nums.length];  // ** VERY IMP

        int evenIndex = 0, oddIndex = 1; // ** VERY IMP
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                arr[evenIndex] = nums[i];
                evenIndex = evenIndex + 2;  // **VERY IMP

            } else {
                arr[oddIndex] = nums[i];
                oddIndex = oddIndex + 2;   // **VERY IMP

            }

        }


        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};

        System.out.println(Arrays.toString(sortArraybyParityBruteForce(nums)));
    }

}
