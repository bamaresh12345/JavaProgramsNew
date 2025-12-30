package TwoPointers_Final.SlidingWindow_FixedLength;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

    public static  int longestSubstringWithoutRepeatingCharacters(String s)
    {

        Set<Character> set = new HashSet<>();

        int maxLen=0;
        int left=0;
        for (int right=0; right < s.length(); right++)
        {
            char ch = s.charAt(right);

            while(set.contains(ch))
            {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);
            maxLen = Math.max(maxLen , set.size());

        }

        return maxLen;
    }
    public static void main(String[] args) {
        String  s = "pwwkew";

        System.out.println(longestSubstringWithoutRepeatingCharacters(s));

    }
}
