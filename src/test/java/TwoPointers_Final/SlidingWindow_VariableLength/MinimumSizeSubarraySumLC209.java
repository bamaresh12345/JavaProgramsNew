package TwoPointers_Final.SlidingWindow_VariableLength;
/*
🧩 1️⃣ PROBLEM STATEMENT
MinimumSizeSubarraySumLC209 --> SlidingWindow _VARIABLE_LENGTH Logic, finding Len of Array **** IMP
MaximumSumSubarrayOfSizeK  --> uses the SlidingWindow _FIXED_LENGTH Logic, finding SUM**  **** IMP

Smallest Subarray with Sum ≥ Target
Given an array of positive integers nums and an integer target, return the minimum length of a contiguous subarray
 whose sum is greater than or equal to target.
If there is no such subarray, return 0.

Example
Input:  nums = [2,3,1,2,4,3] , target = 7
Output: 2
Explanation: The subarray [4,3] has the minimum length.

❗ Key Observations (Say this in interview)
Subarray → continuous
Numbers are positive → sliding window works
Goal → minimize window size
Use expand + shrink technique
=====================================================================
🔍 3️⃣ DRY RUN (STEP-BY-STEP)
Input : nums = [2, 3, 1, 2, 4, 3]  , target = 7

Execution Table
| right | nums[right] | sum | left | Window    | sum ≥ 7 | minLen |
| ----- | ----------- | --- | ---- | --------- | ------- | ------ |
| 0     | 2           | 2   | 0    | [2]       | ❌       | ∞      |
| 1     | 3           | 5   | 0    | [2,3]     | ❌       | ∞      |
| 2     | 1           | 6   | 0    | [2,3,1]   | ❌       | ∞      |
| 3     | 2           | 8   | 0    | [2,3,1,2] | ✅       | 4      |
|       |             | 6   | 1    | [3,1,2]   | ❌       | 4      |
| 4     | 4           | 10  | 1    | [3,1,2,4] | ✅       | 4      |
|       |             | 7   | 2    | [1,2,4]   | ✅       | 3      |
|       |             | 6   | 3    | [2,4]     | ❌       | 3      |
| 5     | 3           | 9   | 3    | [2,4,3]   | ✅       | 3      |
|       |             | 7   | 4    | [4,3]     | ✅       | 2      |
|       |             | 3   | 5    | [3]       | ❌       | 2      |


✅ Final Answer
Minimum subarray length = 2

Subarray: [4, 3]
🧠 WHY THIS WORKS
Expand window until sum ≥ target
Shrink window to minimize size
Positive numbers guarantee correctness
Each element enters & exits window once → O(n)

🎯 INTERVIEW ONE-LINER

“We expand the window to reach the target sum, then shrink it greedily to find the minimum size.”

⭐ RELATED PROBLEMS
Longest subarray ≤ K
Maximum sum subarray of size K
Minimum window substring (advanced)
 */
public class MinimumSizeSubarraySumLC209 { // or Smallest Subarray with Sum ≥ Target

    public static int minSubArrayLen(int[] nums, int target ) {

        int left = 0;                     // Left pointer of sliding window
        int sum = 0;                      // Current window sum
        int minLen = Integer.MAX_VALUE;   // Minimum length found so far

        // Right pointer expands the window
        for (int right = 0; right < nums.length; right++) {

            // Add current element to the window
            sum = sum + nums[right];

            // Shrink window while sum is >= target
            while (sum >= target) {

                // Update minimum length
                minLen = Math.min(minLen, right - left + 1);

                // Remove element at left and shrink window
                sum =sum - nums[left];
                left++;
            }
        }

        // If no valid subarray found, return 0
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
       int[] arr= {2,4,1,6,3,2};
       int k=3;

        System.out.println(minSubArrayLen(arr,k));
    }
}
