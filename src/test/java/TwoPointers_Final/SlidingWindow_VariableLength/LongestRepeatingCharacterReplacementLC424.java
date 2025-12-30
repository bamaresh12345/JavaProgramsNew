package TwoPointers_Final.SlidingWindow_VariableLength;
/*
🧩 1️⃣ PROBLEM STATEMENT
Longest Repeating Character Replacement (LC 424)
You are given a string s consisting of uppercase English letters and an integer k.
You can replace at most k characters in the string with any other uppercase letter.
Return the length of the longest substring containing the same character after performing at most k replacements.

Example :
Input:  s = "AABABBA", k = 1
Output: 4
Explanation: Replace the single 'B' in "AABA" to get "AAAA".

❗ Key Observations (Say this in interview)
Substring → contiguous
Replacements allowed → sliding window
Goal → maximize window size
Track most frequent character in the window
================================================
🧠 WHY WE DON’T DECREASE maxFreq
📌 This is VERY IMPORTANT for interviews.
maxFreq may become slightly outdated
But window size always stays valid
Recalculating every time would make it O(26 × n) (still okay, but unnecessary)
👉 Keeping maxFreq monotonic keeps the solution O(n)
================================================================================
🔍 3️⃣ DRY RUN (STEP-BY-STEP)
Input
s = "AABABBA"
k = 1

Execution Table

| right | char | freq(A,B) | maxFreq | Window  | Replacements | maxLen |
| ----- | ---- | --------- | ------- | ------- | ------------ | ------ |
| 0     | A    | A=1       | 1       | "A"     | 0            | 1      |
| 1     | A    | A=2       | 2       | "AA"    | 0            | 2      |
| 2     | B    | A=2,B=1   | 2       | "AAB"   | 1            | 3      |
| 3     | A    | A=3,B=1   | 3       | "AABA"  | 1            | 4      |
| 4     | B    | A=3,B=2   | 3       | "AABAB" | 2 ❌          | shrink |
|       |      | A=2,B=2   | 3       | "ABAB"  | 2 ❌          | shrink |
|       |      | A=1,B=2   | 3       | "BAB"   | 1            | 4      |
| 5     | B    | A=1,B=3   | 3       | "BABB"  | 1            | 4      |
| 6     | A    | A=2,B=3   | 3       | "BABBA" | 2 ❌          | shrink |

✅ Final Answer
Longest valid substring length = 4


Examples:

"AABA" → replace B → "AAAA"

"ABBA" → replace A → "BBBB"

🎯 INTERVIEW ONE-LINER
“We maintain a sliding window where the number of characters to replace is the window size minus the frequency of
 the most common character.”

⚠️ COMMON INTERVIEW MISTAKES
❌ Shrinking when window size > k
❌ Recalculating max frequency every time
❌ Using HashMap instead of array for uppercase letters

⭐ RELATED PROBLEMS
Longest substring with at most K distinct characters (LC 340)
Longest substring without repeating characters (LC 3)
Exactly K distinct characters (LC 992)

🧠 WHY map.size() works in OTHER problems but NOT here
Problem	Formula
Longest substring without repeating chars	map.size()  *** IMP
At most K distinct characters	map.size() > k    *** IMP
Character Replacement (LC 424)	windowSize - maxFr   *** IMP

 */
public class LongestRepeatingCharacterReplacementLC424 {

    public static int longestRepeatingCharacterReplacement(String s, int k) {

        int left = 0;        // Left pointer of sliding window
        int maxLen = 0;      // Stores maximum valid window length
        int maxFreq = 0;     // Frequency of most common character in window

        // Frequency array for characters A-Z
        int[] freq = new int[26];

        // Right pointer expands the window
        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // Increase frequency of current character
            freq[ch - 'A']++;

            // Update max frequency in the current window
            maxFreq = Math.max(maxFreq, freq[ch - 'A']);

            /*
             * Window size = right - left + 1
             * Characters to replace = window size - maxFreq
             * If replacements needed > k → shrink window
             */
            while ((right - left + 1) - maxFreq > k) {

                // Remove left character from window
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            // Update maximum window length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String  s = "ABAB";
         int k = 2;

        System.out.println(longestRepeatingCharacterReplacement(s,k));
    }
}
