package SldingWindowProbelms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

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

public class LogestSubStringWithOutRepeatingCharactersLeetCode3New {


    public static void main(String[] args) {
        // String s = "abcabcbb";
        String s = "pwwkew";

        System.out.println(LongestSubString(s));
    }

    public static int LongestSubString(String s) {
        char arr[] = s.toCharArray();
        int n = arr.length;
        if (n < 2) return n;

// define pointers //

        int L = 0, R = 0;

// DEFINE TABLE //

        Map<Character, Integer> hm = new HashMap<>();

// define max len //
        int maxLen = 0;

// find longest substring //
        while (R < n) {
// add current element
            hm.put(arr[R], hm.getOrDefault(arr[R], 0) + 1);

//check if we meet the condition //
            while (hm.size() != R - L + 1) {
                hm.put(arr[L], hm.get(arr[L]) - 1);

                if (hm.get(arr[L]) == 0) {
                    hm.remove(arr[L]);
                }
                L++;

            }
// update the maxlen //
            maxLen = Math.max(maxLen, R - L + 1);

// move the R one to the right //

            R++;

        }
// return maxlen //

        return maxLen;
    }
}


