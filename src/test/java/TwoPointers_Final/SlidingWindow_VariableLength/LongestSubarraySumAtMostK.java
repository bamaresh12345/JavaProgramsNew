package TwoPointers_Final.SlidingWindow_VariableLength;
/*
✅ Problem
Find the length of the longest subarray whose sum is ≤ K
⚠️ Assumption: All numbers are non-negative

🧠 WHY THIS WORKS
Window expands by moving right
Window shrinks only when sum > k
Because all numbers are non-negative, shrinking reduces sum
Once valid, window size is checked

🔍 DRY RUN EXAMPLE
Input
arr = [2, 1, 5, 1, 3, 2]
k = 7
Step-by-Step

| right | arr[right] | sum | left | Window    | sum ≤ k | maxLen |
| ----- | ---------- | --- | ---- | --------- | ------- | ------ |
| 0     | 2          | 2   | 0    | [2]       | ✅       | 1      |
| 1     | 1          | 3   | 0    | [2,1]     | ✅       | 2      |
| 2     | 5          | 8   | 0    | [2,1,5]   | ❌       |        |
|       |            | 6   | 1    | [1,5]     | ✅       | 2      |
| 3     | 1          | 7   | 1    | [1,5,1]   | ✅       | 3      |
| 4     | 3          | 10  | 1    | [1,5,1,3] | ❌       |        |
|       |            | 8   | 2    | [5,1,3]   | ❌       |        |
|       |            | 4   | 3    | [1,3]     | ✅       | 3      |
| 5     | 2          | 6   | 3    | [1,3,2]   | ✅       | 3      |

✅ Final Answer
Longest subarray length = 3

Examples:
[1,5,1]
[1,3,2]
===============================================================================
 */
public class LongestSubarraySumAtMostK {

    public static int longestSubarraySumAtMostK(int[] arr, int k) { // ** IMP Kis SUM not size

        int left = 0;          // Left boundary of the sliding window
        int sum = 0;           // Current window sum
        int maxLen = 0;        // Stores maximum window length found

        // Right pointer expands the window
        for (int right = 0; right < arr.length; right++) {

            // Add current element to the window
            sum = sum + arr[right];

            // If sum exceeds k, shrink window from the left
            while (sum > k) {
                sum = sum - arr[left];   // Remove element at left
                left++;             // Move left pointer forward
            }

            // At this point, sum <= k, so window is valid
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr= {2, 1, 5, 1, 3, 2};
        int k=7;  // ** IMP Kis SUM not size of array

        System.out.println(longestSubarraySumAtMostK(arr,k));
    }
}
