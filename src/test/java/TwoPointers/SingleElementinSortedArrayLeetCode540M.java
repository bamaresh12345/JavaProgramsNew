package TwoPointers;

import java.util.HashMap;
import java.util.Map;
/*
🟢 Problem Statement (Plain English)
You are given: A sorted array nums where every element appears exactly twice, except for one element which appears only once.
Task: Find the element that appears only once.
You must solve it in O(log n) time and O(1) space.
🔑 Key Points
Sorted array → all pairs are next to each other: [1,1,2,2,3,4,4]
Only one element appears once.
Goal is to find that single element efficiently.
🟢 Example 1
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
Explanation:
1 appears twice → fine
2 appears once → ✅ answer
3,4,8 appear twice
🟢 Example 2
Input: nums = [3,3,7,7,10,11,11]
Output: 10

 */
public class SingleElementinSortedArrayLeetCode540M {

    public static int SingleElementinSortedArray(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(map.get(nums[i]), 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};

        System.out.println(SingleElementinSortedArray(nums));
    }
}
