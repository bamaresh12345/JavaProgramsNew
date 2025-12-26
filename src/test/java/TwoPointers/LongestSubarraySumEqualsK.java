package TwoPointers;

/*
560. Subarray Sum Equals K
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:
Input: nums = [1,1,1], k = 2  Output: 2

Example 2:
Input: nums = [1,2,3], k = 3  Output: 2

 */
public class LongestSubarraySumEqualsK {

    /*      L->                       use while loop to decrment if sum > K and incrment left
            1,1,1
            R->                       use while loop to sum the array and incrment right pointer till end of array
     */
    public static int longestSubarraySumEqualsK(int[] nums, int k) {

        int left = 0, sum = 0, maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum > k) {
                sum = sum - nums[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = 3;
        System.out.println(longestSubarraySumEqualsK(nums, k));
    }
}
