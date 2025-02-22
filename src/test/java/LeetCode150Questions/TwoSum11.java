package LeetCode150Questions;

/*
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they
 add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1
 < index2 <= numbers.length.
Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
Input: numbers = [2,7,11,15], target = 9 Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].

Example 2:
Input: numbers = [2,3,4], target = 6  Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
 */

import java.util.Arrays;

public class TwoSum11 {

    public static int[] twoSum11(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        int sum = 0;
        while (start < end) {
            sum = numbers[start] + numbers[end];
            if (sum < target) {
                start++;   // if we use end--,it will incrase the add which is always invalid and array is sorting order
            } else if (sum > target) {
                end--;  // if we use start++, it will incrase the add which is always invalid and array is sorting order
            } else {
                return new int[]{start + 1, end + 1};

            }
        }
        return new int[]{-1, -1};


    }

    public static void main(String[] args) {

        int[] numbers = {2, 3, 4};
        int target = 6;

        System.out.println(Arrays.toString(twoSum11(numbers, target)));
    }
}
