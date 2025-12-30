package LeetCode150Questions;

import java.util.*;

public class ContainsDuplicateII {
/*
✅ LeetCode 219 – Contains Duplicate II
🔹 Problem Statement (Simple Words)
You are given:
An integer array nums
An integer k
Your task is to check whether the same number appears at least twice in the array AND
the distance between their indices is at most k.
👉 Return:
true → if such a pair exists
false → otherwise

❗ Important Points
The duplicate values must be equal
The index difference must be ≤ k
k is about distance between indices, NOT values
values
=====================================================================
🔹 Example 1 (Returns true)
nums = [1, 2, 3, 1]
k = 3

Explanation:
nums[0] = 1
nums[3] = 1
Same value ✅

Index difference = |0 - 3| = 3 ≤ k ✅

👉 Output: true
================================================================================

nums[i] == nums[j]
|i - j| ≤ k
Otherwise, return false.
🧠 Key Idea
We only care about duplicates that are at most k distance apart.
Two optimal approaches:
HashSet + Sliding Window (BEST)
HashMap (store last index)

nums = [1, 2, 3, 1], k = 3
Index 0 and 3 → same value
|0 - 3| = 3 ≤ k → TRUE

✅ Approach 1: HashSet + Sliding Window (O(n))
💡 Intuition
Maintain a window of size k
Keep elements in a HashSet
If an element already exists → duplicate found
Remove element that goes out of window

✅ Approach 2: HashMap (Last Seen Index)
💡 Intuition

Store last index of each number
If same number appears again:
Check index difference ≤ k

 */
    public static boolean containsNearbyDuplicate(int[] nums, int k)
    {
        // HashSet to store elements in the current window, no other than current Window elements*** IMP***
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            // Step 1: Check if element already exists in set
            if (set.contains(nums[i])) {
                // duplicate found within k distance
                return true;
            }

            // Step 2: Add current element to set
            set.add(nums[i]);

            // Step 3: Maintain window size k
            if (set.size() > k) {
                // remove element that is out of the window
                set.remove(nums[i - k]);
            }
        }

        // No nearby duplicates found
        return false;

    }
    public static void main(String[] args) {

        int[] nums={1, 2, 3, 1};
        int k=3;
        System.out.println(containsNearbyDuplicate(nums,k));
    }

    public static boolean containsNearbyDuplicateHashMaps(int[] nums, int k)
    {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++)
        {
          if(map.containsKey(nums[i]))
          {
              if(i - map.get(nums[i]) <=k)
              {
                  return true;
              }
          }

        }
        return false;
    }
}
