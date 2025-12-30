package TwoPointers_Final.SlidingWindow_VariableLength;
/*

🧩 1️⃣ PROBLEM STATEMENT
Subarray Product Less Than K (LeetCode 713)
Given an array of positive integers nums and an integer k, return the number of contiguous subarrays where the
product of all elements is strictly less than k.

Example
Input:  nums = [10, 5, 2, 6], k = 100
Output: 8

Explanation --> Valid subarrays:
[10], [5], [2], [6],
[10,5], [5,2], [2,6],
[5,2,6]
==========================================================================
🔍 3️⃣ DRY RUN (STEP-BY-STEP)
Input
nums = [10, 5, 2, 6]  , k = 100

Execution table
| right | nums[right] | product | left | Window  | Added  | Total |
| ----- | ----------- | ------- | ---- | ------- | ------ | ----- |
| 0     | 10          | 10      | 0    | [10]    | 1      | 1     |
| 1     | 5           | 50      | 0    | [10,5]  | 2      | 3     |
| 2     | 2           | 100     | 0    | ❌       | shrink |       |
|       |             | 10      | 1    | [5,2]   | 2      | 5     |
| 3     | 6           | 60      | 1    | [5,2,6] | 3      | 8     |

Final Answer
Total subarrays = 8

⚠️ COMMON INTERVIEW PITFALLS
❌ Forgetting k <= 1 edge case
❌ Using sum logic instead of product
❌ Trying brute force O(n²)

🎯 INTERVIEW ONE-LINER

“We expand the window to grow the product and shrink it when the product exceeds K, counting all valid subarrays ending at each position.”

⭐ RELATED PROBLEMS
Longest subarray with sum ≤ K
Smallest subarray with sum ≥ K
Maximum product subarray (different!)

 */
public class SubarrayProductLessThanKLC713 {

    public static int numSubarrayProductLessThanK(int[] nums, int k) {

        // If k <= 1, no positive product can be < k
        if (k <= 1) return 0;

        int left = 0;        // Left pointer of sliding window
        int product = 1;     // Product of current window
        int count = 0;       // Total valid subarrays

        // Right pointer expands the window
        for (int right = 0; right < nums.length; right++) {

            // Include current element in the product
            product = product * nums[right];

            // Shrink window until product < k
            while (product >= k) {
                product = product / nums[left];  // *** IMP for PRODCUT (*) we need to use DEVIDE (/)
                left++;
            }

            // All subarrays ending at 'right' are valid
            count += right - left + 1;
        }

        return count;
    }


    public static void main(String[] args) {

        int[] nums = {10, 5, 2, 6};
        int k = 100;

        System.out.println(numSubarrayProductLessThanK(nums,k));
    }

}
