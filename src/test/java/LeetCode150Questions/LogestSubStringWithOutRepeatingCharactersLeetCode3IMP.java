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
        int max = 0;
        int left = 0;
        int right = 0;
        int maxLen=0;
        String substr="";

        Set<Character> set = new HashSet<>();

        while (right < s.length()) {  // ** IMP
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                max = Math.max(set.size(), max);

                if(set.size()> maxLen)  // **IMP
                {  substr="";            // **IMP
                    maxLen = set.size();  // **IMP
                    for(char c : set)  // **IMP
                    {
                        substr = substr + c;  // **IMP
                    }
                }
                right++;

            } else {
                set.remove(s.charAt(left));
                System.out.println("remove from a pointer " + set);
                left++;
            }
        }

        System.out.println("final");
        System.out.println(maxLen);
        System.out.println(substr);


        return max;
    }

    public static void main(String[] args) {
        // String s = "abcabcbb";
        //String s = "javaconceptoftheday";
        String s = "pwwkew";

        System.out.println(LongestSubString(s));
    }
}
