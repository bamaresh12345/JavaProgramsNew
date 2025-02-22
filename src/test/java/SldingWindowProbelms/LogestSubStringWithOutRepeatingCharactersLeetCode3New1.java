package SldingWindowProbelms;

import java.util.HashMap;
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

public class LogestSubStringWithOutRepeatingCharactersLeetCode3New1 {

    public static int LongestSubString(String s) {

        /*
        1. detail hashMap to store Character and Integer
        2. run while loop till end of arr
        3. check if map.put getordefrault to 0+1
        4. check if the size() of map ! right -L +1
        5. then check for map.get value eaul to zero
        6. the nremove the element
        7. keep checking maxLenth
        8. return the maxLength

         */
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int L = 0;
        int R = 0;
        int maxLen = 0;
        int n = arr.length;

        while (R < n) {
            //
            map.put(arr[R], map.getOrDefault(arr[R], 0) + 1);
            //map.put(nums[i], map.get(nums[i]) + 1);

            while (map.size() != R - L + 1) {
                map.put(arr[L], map.get(arr[L] - 1));
                if (map.get(arr[L]) == null) { // null or 0
                    map.remove(arr[L]);
                }
                L++;
            }

            maxLen = Math.max(maxLen, R - L + 1);
            R++;


        }


        return maxLen;
    }

    public static void main(String[] args) {
        // String s = "abcabcbb";
        String s = "pwwkew";

        System.out.println(LongestSubString(s));
    }


}


