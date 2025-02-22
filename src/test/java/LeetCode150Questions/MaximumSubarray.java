package LeetCode150Questions;

/* 53. Maximum Subarray
Given an integer array nums, find the  subarray  with the largest sum, and return its sum.
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 */

public class MaximumSubarray {

    public static int maximumSubarray(int[] nums) {

        int sum = 0;
        int maxSum = nums[0];

        for (int i = 0; i < nums.length; i++) {

            sum = sum + nums[i];

            if (sum < 0)
                sum = 0;

            if (sum > maxSum)
                maxSum = sum;

        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maximumSubarray(nums));

    }
}
