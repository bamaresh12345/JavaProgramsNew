package TwoPointers;

public class MinimumSizeSubarraySumLeetCode209Medium {
/*
🟢 Problem Statement (Plain English)
You are given:
An array of positive integers nums
A positive integer target
Task:
Find the minimal length of a contiguous subarray of which the sum ≥ target.
Return 0 if no such subarray exists.
🔑 Important Notes
Contiguous subarray → elements must be next to each other.
Minimal length → smallest possible number of elements whose sum is ≥ target.
Positive integers only → allows sliding window technique.
🟢 Example 1
Input: nums = [2,3,1,2,4,3], target = 7
Output: 2

Explanation:
Subarrays with sum ≥ 7: [4,3], [2,3,1,2], [3,1,2,4]
Minimal length = 2 ([4,3])
🟢 Example 2
Input: nums = [1,4,4], target = 4
Output: 1
Explanation:
Subarrays with sum ≥ 4: [4], [4], [1,4], [4,4]
Minimal length = 1 ([4])
🟢 Approach: Sliding Window
Idea:
Use two pointers left and right to define a window
Expand the window by moving right and adding nums[right] to sum
While sum ≥ target, shrink the window from the left and update minLen
Return minLen (or 0 if no subarray found)
🔹 How It Works
Two pointers: left and right define a window.
Expand the window by moving right and adding nums[right] to sum.
Shrink the window from left while sum >= target to get minimum length.
Update minLen every time a valid window is found.

Return 0 if no subarray satisfies the condition.
✅ Key Points
Works only for positive integers (guarantees sum decreases when moving left).
Time Complexity: O(n)
Space Complexity: O(1)

 */
    public static int MinimumSizeSubarraySum(int[] nums, int target) {
        int left = 0;
        int sum = 0;

        int minLen = Integer.MAX_VALUE; // store minimum length

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right]; // expand window to the right

            // shrink window from the left while sum >= target
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        // if no valid subarray, return 0
        return minLen == Integer.MAX_VALUE ? 0 : minLen;


    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        //int[] nums = {1, 4, 4};
        //int target = 4;

        System.out.println(MinimumSizeSubarraySum(nums, target));
    }
}
