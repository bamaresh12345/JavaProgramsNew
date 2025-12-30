package TwoPointers_Final.SlidingWindow_VariableLength;

import java.util.*;
/*
🧩 1️⃣ PROBLEM STATEMENT
Longest Substring Without Repeating Characters (LC 3)
Given a string s, find the length of the longest substring without repeating characters.

Example
Input:  s = "abcabcbb"
Output: 3
Explanation: "abc" is the longest substring without repeating characters.

❗ Key Notes (Say this in interview)
Substring → contiguous
No repeating characters
Goal → maximize window size
Use variable-size sliding window

🧠 WHY THIS WORKS
Window expands using right
Window shrinks only when duplicate appears
Set ensures O(1) lookup
Each character is added & removed once → O(n)

🔍 3️⃣ DRY RUN (STEP-BY-STEP)
Input
s = "abcabcbb"

Execution Table

| right | char | Action    | Window | Set     | maxLen |
| ----- | ---- | --------- | ------ | ------- | ------ |
| 0     | a    | add       | "a"    | {a}     | 1      |
| 1     | b    | add       | "ab"   | {a,b}   | 2      |
| 2     | c    | add       | "abc"  | {a,b,c} | 3      |
| 3     | a    | duplicate | shrink | {b,c}   | 3      |
|       |      | add       | "bca"  | {b,c,a} | 3      |
| 4     | b    | duplicate | shrink | {c,a}   | 3      |
|       |      | add       | "cab"  | {c,a,b} | 3      |
| 5     | c    | duplicate | shrink | {a,b}   | 3      |
|       |      | add       | "abc"  | {a,b,c} | 3      |
| 6     | b    | duplicate | shrink | {c}     | 3      |
|       |      | add       | "cb"   | {c,b}   | 3      |
| 7     | b    | duplicate | shrink | {b}     | 3      |

✅ Final Answer
Longest substring length = 3


Examples:
"abc"
"bca"
"cab"

⚠️ COMMON INTERVIEW MISTAKES

❌ Using if instead of while
❌ Forgetting to remove characters from set
❌ Confusing substring vs subsequence

🎯 INTERVIEW ONE-LINER
“We use a sliding window that expands until a duplicate appears,
 then shrinks until the window becomes valid again.”

⭐ RELATED PROBLEMS
Longest substring with at most K distinct characters (LC 340)
Longest repeating character replacement (LC 424)
Subarrays with exactly K distinct characters (LC 992)

 */
public class LongestSubstringWithoutRepeatingCharactersLeetCode3 {

    public static int lengthOfLongestSubstring(String s) {

        int left = 0;                // Left pointer of sliding window
        int maxLen = 0;              // Stores maximum valid window length
        Set<Character> set = new HashSet<>(); // Tracks characters in current window

        // Right pointer expands the window
        for (int right = 0; right < s.length(); right++) {

            // If current character already exists in window,
            // shrink window from left until duplicate is removed
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));  // Remove leftmost character
                left++;                      // Move left pointer
            }

            // Add current character to the window
            set.add(s.charAt(right));

            // Update maximum length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {


        String s = "abcabcbb";

        System.out.println(lengthOfLongestSubstring(s));
    }
}
