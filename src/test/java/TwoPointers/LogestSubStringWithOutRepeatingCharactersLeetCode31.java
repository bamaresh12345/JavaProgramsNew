package TwoPointers;

import java.util.HashSet;

/* 3. Longest Substring Without Repeating Characters
 Given a string s, find the length of the longest substring  without repeating characters.
Example 1: Input: s = "abcabcbb"  Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 3: Input: s = "pwwkew" Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


Example 2: Input: s = "bbbbb" Output: 1
Explanation: The answer is "b", with the length of 1.
 */

public class LogestSubStringWithOutRepeatingCharactersLeetCode31 {

    public static int LongestSubString(String s) {
        int max = 0;
        int left = 0;
        int right = 0;

        HashSet<Character> set = new HashSet<>();

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                max = Math.max(set.size(), max);

            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }


        System.out.println(set);
        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        //String s = "pwwkew";

        System.out.println(LongestSubString(s));
    }
}
