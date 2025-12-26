package TwoPointersNew.SlidingWindow_FixedLength;
/*
Contains Duplicate II
Minimum Size Subarray Sum
First Negative Number in Every Window of Size K
Maximum Number of Vowels in a Substring

 */
public class MaximumAverageSubarrayILeetCode643 {
/*
✅ LeetCode 643: Maximum Average Subarray I   // **** IMP jsut giving back Average subarray maxSum/k with double datatype
Problem Summary
You are given an integer array nums and an integer k.
Find the maximum average value of any contiguous subarray of length k.

🔹 Key Idea: Sliding Window
Instead of calculating the sum for every subarray (which is slow), we:
Calculate the sum of the first k elements
Slide the window:
Add the next element
Remove the element going out of the window
Track the maximum sum
Divide by k to get the maximum average
🧠 Why Sliding Window?
Brute force: O(n × k) ❌
Sliding window: O(n) ✅
Space: O(1)

🧪 Example
nums = [1,12,-5,-6,50,3], k = 4
Subarrays:
[1,12,-5,-6] → sum = 2
[12,-5,-6,50] → sum = 51  ✅ max
[-5,-6,50,3] → sum = 42
Max average = 51 / 4 = 12.75

 */
    public static double maxAvgSubArray(int[] nums, int k)
    {
        // Handeling edge case
        if (nums == null || nums.length < k)
            return 0;

        int windowSum=0;

        //find window size
        for (int i=0; i<k; i++)
        {
            windowSum = windowSum + nums[i];
        }

       int maxSum = windowSum;

        //find sum of all sub arrays
        for (int i=k; i< nums.length; i++)
        {
            windowSum = windowSum + nums[i];  //add element to window
            windowSum = windowSum - nums[i-k];   // // arr[i-k] = 0th element will be removed
            maxSum = Math.max(maxSum,windowSum);  // find maxSum
        }

        return (double) maxSum/k;

    }
    public static void main(String[] args) {

        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;

        System.out.println(maxAvgSubArray(nums,k));
    }
}
