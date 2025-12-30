package TwoPointers_Final.SlidingWindow_VariableLength;

import java.util.*;
/*
🧩 1️⃣ PROBLEM STATEMENT
Longest Substring with At Most K Distinct Characters
Given a string s and an integer k, return the length of the longest substring that contains at most k distinct
characters.

Example
Input:  s = "eceba", k = 2
Output: 3
Explanation: "ece" has at most 2 distinct characters.
==========================
🔍 3️⃣ DRY RUN (STEP-BY-STEP)
Input
s = "eceba"
k = 2

Execution Table
===============================================================
| right | char | Window | Map           | map.size() | maxLen |
| ----- | ---- | ------ | ------------- | ---------- | ------ |
| 0     | e    | "e"    | {e=1}         | 1          | 1      |
| 1     | c    | "ec"   | {e=1, c=1}    | 2          | 2      |
| 2     | e    | "ece"  | {e=2, c=1}    | 2          | 3      |
| 3     | b    | "eceb" | {e=2,c=1,b=1} | ❌ 3        |        |
|       |      | "ceb"  | {e=1,c=1,b=1} | ❌          |        |
|       |      | "eb"   | {e=1,b=1}     | ✅          | 3      |
| 4     | a    | "eba"  | {e=1,b=1,a=1} | ❌          |        |
|       |      | "ba"   | {b=1,a=1}     | ✅          | 3      |
====================================================================
✅ Final Answer
Longest substring length = 3


Substring: "ece"

🧠 WHY THIS WORKS
Expand window using right
Shrink window when distinct > k
Frequency map ensures correctness
Each character is added & removed once → O(n)

🎯 INTERVIEW ONE-LINER

“This is a variable-size sliding window where we expand until distinct characters exceed K, then shrink until
the condition is restored.”

⭐ RELATED PROBLEMS
Exactly K distinct → LC 992
No repeating characters → LC 3
More than K distinct → derived from LC 340
====================================================================================

 */
public class LongestSubstringwithAtMostKDistinctCharacters_LeetCode340 {

    public static int longestSubstringAtMostKDistinct(String s, int k) {

        int left = 0;                 // Left pointer of sliding window
        int maxLen = 0;               // Stores maximum length found
        Map<Character, Integer> map = new HashMap<>(); // Char frequency map

        // Right pointer expands the window
        for (int right = 0; right < s.length(); right++) {

            // Add current character to the map
            char rightChar = s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);

            // If distinct characters exceed k, shrink window
            while (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);

                // Remove character if its frequency becomes zero
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;  // Shrink window from left
            }

            // Update max length when window is valid
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }


    public static void main(String[] args) {
       String  s = "eceba";
       int k = 2;

        System.out.println(longestSubstringAtMostKDistinct(s,k));
    }
}
