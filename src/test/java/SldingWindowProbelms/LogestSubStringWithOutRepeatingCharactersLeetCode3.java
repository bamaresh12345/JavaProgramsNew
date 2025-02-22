package SldingWindowProbelms;

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

public class LogestSubStringWithOutRepeatingCharactersLeetCode3 {

    public static int LongestSubString(String s) {
        int max = 0;
        int a_pointer = 0;
        int b_pointer = 0;

        HashSet<Character> set = new HashSet<>();

        while (b_pointer < s.length()) {
            if (!set.contains(s.charAt(b_pointer))) {
                set.add(s.charAt(b_pointer));
                System.out.println("add from b pointer " + set);
                b_pointer++;
                max = Math.max(set.size(), max);
            } else {
                set.remove(s.charAt(a_pointer));
                System.out.println("remove from a pointer " + set);
                a_pointer++;
            }
        }


        System.out.println(set);
        return max;
    }

    public static void main(String[] args) {
        //String s = "abcabcbb";
        String s = "javaconceptoftheday";
        //String s = "pwwkew";

        System.out.println(LongestSubString(s));
    }
}
