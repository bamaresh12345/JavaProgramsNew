package LeetCode150Questions;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* 3. Longest Substring Without Repeating Characters
 Given a string s, find the length of the longest substring  without repeating characters.
Example 1: Input: s = "abcabcbb"  Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 3: Input: s = "pwwkew" Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


Example 2: Input: s = "pwwkew" Output: 3
Explanation: The answer is "b", with the length of 1.
 */

public class LogestSubStringWithOutRepeatingCharactersLeetCode3IMP {

    public static int LongestSubString(String s) {

        Set<Character> set = new HashSet<>();     //[e, w, k]  keeps order randomly, but will unique with null vlaue ..
        //TreeSet<Character> set = new TreeSet<>();     //[e, k, w]  keeps order ascending order,ireespevt od order but will unique with null vlaue
        //LinkedHashSet<Character> set = new LinkedHashSet<>();   //  [k, e, w]  //keeps order ascending order,ireespevt od order but will unique with null vlaue

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {   // FOR LOOP MUST instead of while
            char ch = s.charAt(right);

            // If duplicate found, remove until unique
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);    // no for loop or while loop
            maxLength = Math.max(maxLength, right - left + 1);
        }
        System.out.println(set);
        return maxLength;
    }



    public static void main(String[] args) {
        // String s = "abcabcbb";
        //String s = "javaconceptoftheday";
        String s = "pwwkew";

        System.out.println(LongestSubString(s));
    }
}
