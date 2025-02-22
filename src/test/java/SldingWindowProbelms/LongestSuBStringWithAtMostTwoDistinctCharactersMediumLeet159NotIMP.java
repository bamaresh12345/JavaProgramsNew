package SldingWindowProbelms;

import java.util.HashMap;
import java.util.Map;

/* 159. Longest Substring with At Most Two Distinct Characters
https://www.youtube.com/watch?v=GhYk9bFJdYw
Given a string s , find the length of the longest substring t  that contains at most 2 distinct
characters.

Example 1:  Input: "eceba" Output: 3
Explanation: t is "ece" which its length is 3.

Example 2: Input: "ccaabbb" Output: 5
Explanation: t is "aabbb" which its length is 5.
 */
public class LongestSuBStringWithAtMostTwoDistinctCharactersMediumLeet159NotIMP {

    /* Explination
                          l,r
                            "eceba"
leftPointer                       ^
leftPointer                    ^
                            {e:2,c:1,b:1}
                            {e:1,c:1,b:1}
                            {e:0,c:1,b:1}
                            maxLen =3
       */
    public static int LongestSuBStringWithAtMostTwoDistinctCharacters(String s) {
        char[] arr = s.toCharArray();

        int n = s.length();

        //base case
        if (n < 3)
            return n;

        int Left = 0;
        int Right = 0;
        int maxLen = 0;

        Map<Character, Integer> map = new HashMap<>();

        while (Right < n) {
            map.put(arr[Right], map.getOrDefault(arr[Right], 0) + 1);

            while (map.size() > 2)  // IMP Condition K distinct or 2 distinct chars
            {
                map.put(arr[Left], map.get(arr[Left] - 1));
                if (map.get(arr[Left]) == null)  //**IMP in typing
                {
                    map.remove(arr[Left]);
                }
                Left++;
            }
            maxLen = Math.max(maxLen, Right - Left + 1);
            Right++;

        }


        return maxLen;
    }

    public static void main(String[] args) {

        // String s = "eceba"; // 3
        String s = "ccaabbb"; //5
        System.out.println(LongestSuBStringWithAtMostTwoDistinctCharacters(s));
    }
}
