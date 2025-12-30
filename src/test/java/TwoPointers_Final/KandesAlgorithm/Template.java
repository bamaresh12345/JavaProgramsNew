package TwoPointers_Final.KandesAlgorithm;

public class Template {

}
    /*
 Kadane’s Algorithm is an efficient dynamic programming technique used to find the maximum sum of a contiguous subarray
 within a one-dimensional array of numbers.

📌 Simple Definition
Kadane’s Algorithm finds the largest possible sum of any continuous subarray in an array in linear time (O(n)).

🧠 Core Idea (Intuition)
At each element, you decide:
Start a new subarray from the current element
OR extend the previous subarray
You always keep track of:
currentSum → best sum ending at current index
maxSum → best sum found so far

🧮 Key Formula
currentSum = Math.max(arr[i], currentSum + arr[i])   //Either start new subarray or extend old one
maxSum = Math.max(maxSum, currentSum)                 //Update global best

========================================================
    ✅ Kadane’s Algorithm – Java Template
    public int maxSubArray(int[] nums) {
    int currSum = nums[0];   // used for Best subarray sum ending at current index
    int maxSum = nums[0];    //Best subarray sum found so far

    for (int i = 1; i < nums.length; i++) {
        currSum = Math.max(nums[i], currSum + nums[i]);   //Either start new subarray or extend old one
        maxSum = Math.max(maxSum, currSum);            //Update global best
    }

    return maxSum;

🧠 What Each Line Means
    | Line                                        | Meaning                                             |
| ------------------------------------------- | --------------------------------------------------- |
| `currSum`                                   | Best subarray sum **ending at current index**       |
| `maxSum`                                    | Best subarray sum **found so far**                  |
| `currSum = max(nums[i], currSum + nums[i])` | Either **start new subarray** or **extend old one** |
| `maxSum = max(maxSum, currSum)`             | Update global best                                  |
===================================================================================================================
📊 Quick Dry Run Example
nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

| i | nums[i] | currSum | maxSum |
| - | ------- | ------- | ------ |
| 0 | -2      | -2      | -2     |
| 1 | 1       | 1       | 1      |
| 2 | -3      | -2      | 1      |
| 3 | 4       | 4       | 4      |    ---> currSum = Math.max(nums[i], currSum + nums[i]); // 4
| 4 | -1      | 3       | 4      |
| 5 | 2       | 5       | 5      |
| 6 | 1       | 6       | 6      |
| 7 | -5      | 1       | 6      |
| 8 | 4       | 5       | 6      |

✅ Answer = 6 → [4, -1, 2, 1]

🎯 When to Use Kadane

✔ Maximum / minimum subarray
✔ Contiguous array problems
✔ Can contain negative numbers
❌ Counting subarrays
❌ Fixed-size window problems

🔥 Kadane Variants (Very Common)
| Variant              | Change                      |
| -------------------- | --------------------------- |
| Minimum subarray sum | Replace `max` with `min`    |
| Circular subarray    | Run Kadane twice            |
| Max product subarray | Track `maxProd` & `minProd` |
| Stock profit         | Kadane on price differences |


===========================================================================
List of Kande's Java Programs
✅ Core Kadane’s Algorithm Problems (Must-Know)
| # | Problem Name                                      | LeetCode |
| - | ------------------------------------------------- | -------- |
| 1 | **Maximum Subarray**                              | LC 53    |
| 2 | **Minimum Subarray Sum**                          | Variant  |
| 3 | **Maximum Sum Circular Subarray**                 | LC 918   |
| 4 | **Best Time to Buy and Sell Stock (Kadane form)** | LC 121   |
| 5 | **Maximum Subarray Sum with One Deletion**        | LC 1186  |

🔁 Kadane Variants on Arrays
| #  | Problem                                    | Key Idea           |
| -- | ------------------------------------------ | ------------------ |
| 6  | **Maximum Product Subarray**               | Track max & min    |
| 7  | **Maximum Absolute Subarray Sum**          | Two Kadane passes  |
| 8  | **Maximum Alternating Subarray Sum**       | Sign flip + Kadane |
| 9  | **Largest Sum Contiguous Subarray**        | Classic            |
| 10 | **Maximum Subarray After K Concatenation** | Prefix + Kadane    |

🟢 Kadane on 0/1 or Binary Arrays
| #  | Problem                                               | Trick     |
| -- | ----------------------------------------------------- | --------- |
| 11 | **Max Consecutive Ones (Flip at most one 0)**         | 0 → -1    |
| 12 | **Longest Subarray of 1s After Deleting One Element** | Kadane    |
| 13 | **Maximum Difference of Zeros and Ones**              | 0→1, 1→-1 |
| 14 | **Flip Bits to Maximize 1s**                          | Kadane    |




============================================================================
}

     */

