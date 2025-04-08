package ArraysLeetCodeFinalMedium;

import java.util.HashSet;

/* 3. Longest Substring Without Repeating Characters
 Given a string s, find the length of the longest substring  without repeating characters.
Example 1: Input: s = "abcabcbb"  Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2: Input: s = "bbbbb" Output: 1
Explanation: The answer is "b", with the length of 1.
 */

public class LogestSubStringWithOutRepeatingCharactersLeetCode3IMPPORTANT {
    /*  TOW POINTER APPROACH
    1. delcare a_pointer and b_pointer=0
    2. delcare Set<CHaracter> set = new HashSet<>(); to store non duplicate values
    3. run while loop till b_pointer < s.length()
    4. if not set.contains(s.charAt(b_pointer)) then
    5. add to set set.add(s.charAt(bpointer))
    6. calculate maxCount = Math.max(set.size(),maxCount)
    7. else
    8. remove elment from set --> set.remove(s.charAt(a_pointer))
    9. and incrment a_pointer++ to point to next elment
    10. finally return maxcount;


     */
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


        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";

        System.out.println(LongestSubString(s));
    }
}
