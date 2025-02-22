package SldingWindowProbelms;

import java.util.HashMap;
import java.util.Map;

/*
424. Longest Repeating Character Replacement --> Medium
You are given a string s and an integer k. You can choose any character of the string and change it
to any other uppercase English character. You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after performing
the above operations
Example 1: Input: s = "ABAB", k = 2 Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.

Example 2: Input: s = "AABABBA", k = 1 Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.


 */
public class LongestRepeatingCharacterReplacementLeetCode424Medium {

    public static int LongestRepeatingCharacterReplacement(String s, int k) {
        int left = 0; // to pointe to starting postion of array
        int right = 0; // to point to starting postion of array and move forward
        int maxLen = 0; // to store the laongestRepeating char count
        int mostFreq = 0; // to store the laongestRepeating char count
        int n = s.length(); // lenth of array
        char[] chars = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        while (right < n) {
            //Expand the window
            map.put(chars[right], map.getOrDefault(chars[right], 0) + 1);

            //to get the most frequest char length from hasMap
            mostFreq = Math.max(mostFreq, map.get(chars[right]));

            //Shrink the window if we need to replace more than k char
            if (right - left + 1 - mostFreq > k) {
                map.put(chars[left], map.get(chars[left]) - 1);
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            right++;

        }

        return maxLen;


    }

    public static void main(String[] args) {

        String str = "ABAB";
        int k = 2;

        System.out.println(LongestRepeatingCharacterReplacement(str, k));
    }
}
