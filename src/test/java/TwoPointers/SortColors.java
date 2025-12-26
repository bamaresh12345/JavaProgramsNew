package TwoPointers;

import java.util.Arrays;
/*
🟢 Problem Statement (Plain English)
You are given an array nums with n objects colored red, white, or blue.
Colors are represented as integers:

0 → red
1 → white
2 → blue

Task:
Sort the array in-place so that same colors are adjacent
Order should be: red (0), white (1), blue (2)
Do not use the library’s sort function
Try one-pass, constant space solution

🟢 Example 1
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2] (sorted in ascending order)

🟢 Example 2
Input: nums = [2,0,1]
Output: [0,1,2]   (sorted in ascending order)
 */
public class SortColors {

    public static int[] sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;

    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        //  System.out.println(Arrays.toString(sortColors(nums)));

        System.out.println(Arrays.toString(sortColorsArray(nums)));
    }

    public static int[] sortColorsArray(int[] nums) {

        int[] arr = new int[nums.length];
        int start = 0;
        int index = 0;
        int end = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {


            if (nums[i] == 0) {
                nums[start] = 0;
                start++;
            } else if (nums[i] == 2) {
                arr[end] = 2;
                end--;
            }


        }

        for (int i = start; i <= end; i++) {
            arr[start] = 1;
            start++;
        }

        return arr;

    }
}
