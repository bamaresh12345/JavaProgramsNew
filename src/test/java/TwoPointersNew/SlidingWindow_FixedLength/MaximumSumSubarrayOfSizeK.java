package TwoPointersNew.SlidingWindow_FixedLength;
/*
✅ Maximum Sum Subarray of Size K

This is a classic Sliding Window (fixed-size) problem and very common in interviews.
🔹 Problem Statement
Given an integer array arr and an integer k,
find the maximum sum of any contiguous subarray of size k.
🧠 Core Idea (Sliding Window)
Compute the sum of the first k elements
Slide the window one step at a time:
Add the next element
Remove the element leaving the window
Track the maximum sum

🧪 Example
arr = [2, 1, 5, 1, 3, 2], k = 3

Subarrays of size 3:
[2, 1, 5] → sum = 8
[1, 5, 1] → sum = 7
[5, 1, 3] → sum = 9  ✅ max
[1, 3, 2] → sum = 6

Output: 9
 */
public class MaximumSumSubarrayOfSizeK {

    public static int maxiumSumSubArrayOfSizeK(int[] arr,int k)
    {
        // Handeling edge case
        if (arr == null || arr.length < k)
            return 0;

        //find window size
        int windowSum=0;
        for (int i=0; i<k; i++)
        {
            windowSum = windowSum + arr[i];
        }
        //assing windowsum to maxsum
        int maxSum = windowSum;

        //find sum of all sub arrays

        for (int i=k; i<arr.length; i++)
        {
            windowSum = windowSum + arr[i];
            windowSum = windowSum - arr[i-k];  // arr[i-k] = 0th element will be removed
            maxSum = Math.max(windowSum, maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
         int k = 3;

        System.out.println(maxiumSumSubArrayOfSizeK(arr,k));
    }
}
