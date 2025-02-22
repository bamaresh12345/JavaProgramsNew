package StringsOnlyGoodOne;

import java.util.HashSet;
import java.util.Set;

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
public class LongestSubStringWithoutRepeatingCharacters {

    public static int longestSubStringWithoutRepeatingCharacters(String s) {
        //two pinter concept  "abcabcbb";

        int a_pointer = 0;
        int b_pointer = 0;
        int maxLen = 0;
        Set<Character> set = new HashSet<>();

        while (b_pointer < s.length()) {

            if (!set.contains(s.charAt(b_pointer))) {
                set.add(s.charAt(b_pointer));
                maxLen = Math.max(maxLen, set.size());
                b_pointer++;

            } else {
                set.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";

        System.out.println(longestSubStringWithoutRepeatingCharacters(s));

    }
}
