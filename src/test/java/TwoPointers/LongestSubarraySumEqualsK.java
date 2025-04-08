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
        int left = 0;
        int right = 0;
        int n = nums.length;
        int sum = 0;
        int maxLen = 0;
        while (right < n) {


            sum = sum + nums[right];

            while (sum > k) {
                sum = sum - nums[left];
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1); // comes out for maxsum array or longest subarray
            right++;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = 3;
        System.out.println(longestSubarraySumEqualsK(nums, k));
    }
}
