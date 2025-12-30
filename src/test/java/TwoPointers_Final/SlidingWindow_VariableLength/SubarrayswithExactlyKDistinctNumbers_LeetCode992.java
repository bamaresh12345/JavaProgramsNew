package TwoPointers_Final.SlidingWindow_VariableLength;

import java.util.*;
/*
992. Subarrays with K Different

Given an integer array nums and an integer k, return the number of good subarrays of nums.
A good array is an array where the number of different integers in that array is exactly k.

For example, [1,2,3,1,2] has 3 different integers: 1, 2, and 3.
A subarray is a contiguous part of an array.

🧠 ONE-LINE SUMMARY :
“We count all subarrays with at most K distinct and subtract those with at most K−1 distinct to get exactly K.”

Example 1:
Input: nums = [1,2,1,2,3], k = 2
Output: 7
Explanation: Subarrays formed with exactly 2 different integers: [1,2], [2,1], [1,2], [2,3], [1,2,1],
[2,1,2], [1,2,1,2]

Example 2:
Input: nums = [1,2,1,3,4], k = 3
Output: 3
Explanation: Subarrays formed with exactly 3 different integers: [1,2,1,3], [2,1,3], [1,3,4].


🔍 3️⃣ DRY RUN EXAMPLE (VERY IMPORTANT)
Input
nums = [1, 2, 1, 2, 3]
k = 2

We compute:
Exactly 2 = AtMost(2) - AtMost(1)

▶️ AtMost(2) DRY RUN
| right | nums[right] | Window    | Map       | Added subarrays | Total |
| ----- | ----------- | --------- | --------- | --------------- | ----- |
| 0     | 1           | [1]       | {1=1}     | 1               | 1     |
| 1     | 2           | [1,2]     | {1=1,2=1} | 2               | 3     |
| 2     | 1           | [1,2,1]   | {1=2,2=1} | 3               | 6     |
| 3     | 2           | [1,2,1,2] | {1=2,2=2} | 4               | 10    |
| 4     | 3           | ❌         | {1,2,3}   | shrink          |       |
|       |             | [2,1,2,3] | {1,2,3}   | shrink          |       |
|       |             | [1,2,3]   | {1,2,3}   | shrink          |       |
|       |             | [2,3]     | {2,3}     | 2               | 12    |
✅ AtMost(2) = 12

▶️ AtMost(1) DRY RUN
| right | nums[right] | Window | Map | Added | Total |
| ----- | ----------- | ------ | --- | ----- | ----- |
| 0     | 1           | [1]    | {1} | 1     | 1     |
| 1     | 2           | [2]    | {2} | 1     | 2     |
| 2     | 1           | [1]    | {1} | 1     | 3     |
| 3     | 2           | [2]    | {2} | 1     | 4     |
| 4     | 3           | [3]    | {3} | 1     | 5     |
✅ AtMost(1) = 5

🧮 FINAL CALCULATION
Exactly 2 = 12 - 5 = 7

✅ Valid Subarrays with Exactly 2 Distinct
[1,2]
[2,1]
[1,2]
[2,1,2]
[1,2,1]
[1,2,3]
[2,3]
=====================================================================
=====================================================================
 */
public class SubarrayswithExactlyKDistinctNumbers_LeetCode992 {

    public static int subarraysWithExactlyKDistinct(int[] nums, int k) {
        // Exactly K = AtMost(K) - AtMost(K - 1)
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }

    private static int atMostK(int[] nums, int k) {

        int left = 0;               // Left pointer of sliding window
        int count = 0;              // Total valid subarrays count
        Map<Integer, Integer> map = new HashMap<>(); // Frequency map

        // Expand window using right pointer
        for (int right = 0; right < nums.length; right++) {

            // Add current number to map
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            // Shrink window until distinct count <= k
            while (map.size() > k) {
                map.put(nums[left], map.get(nums[left]) - 1);

                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }
            // Number of subarrays ending at 'right'
            count += right - left + 1;
        }

        return count;
    }


    public static void main(String[] args) {
      int[]  nums = {1, 2, 1, 2, 3};
        int k = 2;

        System.out.println(subarraysWithExactlyKDistinct(nums,k));
    }
}
