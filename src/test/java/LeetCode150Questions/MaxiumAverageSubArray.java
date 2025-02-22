package LeetCode150Questions;

/* 643. Maximum Average Subarray I
Easy
You are given an integer array nums consisting of n elements, and an integer k.
Find a contiguous subarray whose length is equal to k that has the maximum average value and return
this value. Any answer with a calculation error less than 10-5 will be accepted.

Example 1: Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

Example 2: Input: nums = [5], k = 1
Output: 5.00000

 */
public class MaxiumAverageSubArray {

    public static double maxiumAverageSubArray(int[] nums, int k) {
        int maxSum = 0;
        int currSum = 0;
        for (int i = 0; i < k; i++) {

            currSum = currSum + nums[i];

        }
        maxSum = currSum;

        int start = 0;
        int end = k;

        while (end < nums.length) {
            currSum = currSum - nums[start];
            currSum = currSum + nums[end];
            start++;
            end++;

            maxSum = Math.max(currSum, maxSum);
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(maxiumAverageSubArray(nums, k));
    }
}
