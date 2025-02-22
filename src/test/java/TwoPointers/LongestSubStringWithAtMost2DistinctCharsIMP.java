package TwoPointer;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithAtMost2DistinctCharsIMP {

    public static int longestSubStringWithAtMost2DistinctChars(String s) {

        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        int R = 0;
        int L = 0;
        int maxLen = 0;

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
        while (R < chars.length) {
            //expand the window
            map.put(chars[R], map.getOrDefault(chars[R], 0) + 1);

            //shrink the window
            if (map.size() > 2) {
                map.put(chars[L], map.get(chars[L]) - 1);
                if ((map.get(chars[L])) == null || (map.get(chars[L])) == 0) {

                    System.out.println("map.get(chars[L])---> " + map.get(chars[L]));

                    map.remove(chars[L]);
                }
                L++;  // VERY IMP**** icrment left irrespswective of removel or not
            }

            maxLen = Math.max(maxLen, R - L + 1);
            R++;
        }

        return maxLen;


    }

    public static void main(String[] args) {
        String s = "eceba";
        System.out.println(longestSubStringWithAtMost2DistinctChars(s));
    }
}
