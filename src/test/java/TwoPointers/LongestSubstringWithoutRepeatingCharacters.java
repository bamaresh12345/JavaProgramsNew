package TwoPointer;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    /*
    lr
    abcabcbb
            ^
         ^
    {b:1,c:1}
    maxLen=3
     */
    public static int longestSubstringWithoutRepeatingCharacters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int L = 0;
        int R = 0;
        char[] chars = s.toCharArray();
        int n = chars.length;
        int maxLen = 0;
        while (R < n) {
            map.put(chars[R], map.getOrDefault(chars[R], 0) + 1);

            while (map.size() != R - L + 1) {
                map.put(chars[L], map.get(chars[L]) - 1);
                if (map.get(chars[L]) == null || map.get(chars[L]) == 0) {
                    map.remove(chars[L]);
                }
                L++;
            }

            maxLen = Math.max(maxLen, R - L + 1);

            R++;

        }

        return maxLen;


    }

    public static void main(String[] args) {
        String s = "abcabcbb";

        System.out.println(longestSubstringWithoutRepeatingCharacters(s));
    }
}
