package TwoPointer;

import java.util.HashMap;
import java.util.Map;

public class longestSubStringWithAtMostKDistinctChars {

    /* Explination
        l,r
       "eceba"
        ^^
       maxLen =3  */

    public static int longestSubStringWithAtMostKDistinctChars(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int L = 0;
        int R = 0;
        char[] chars = s.toCharArray();
        //int n = ;
        int maxLen = 0;
        while (R < chars.length) {
            map.put(chars[R], map.getOrDefault(chars[R], 0) + 1);

            while (map.size() > k) {
                map.put(chars[L], map.get(chars[L]) - 1);
                System.out.println(map);
                if ((map.get(chars[L])) == null || (map.get(chars[L])) == 0) {
                    map.remove(chars[L]);

                }
                // incrment left pointer all the times
                L++;
            }
            //calculate max length of string
            maxLen = Math.max(maxLen, R - L + 1);
            // incrment right pointer
            R++;
        }
        return maxLen;
    }

    public static void main(String[] args) {

        String s = "eceba";
        int k = 2;
        System.out.println(longestSubStringWithAtMostKDistinctChars(s, k));
    }
}
