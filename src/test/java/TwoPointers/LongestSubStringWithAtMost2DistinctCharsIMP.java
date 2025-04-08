package TwoPointer;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithAtMost2DistinctCharsIMP {

    public static int longestSubstringWithMostKdistinctcharacters(String s)
    {
        //base case
        char[] arr = s.toCharArray();
        int n = s.length()-1;

        if(s.length()==0)
            return -1;

        if(s.length() <=3)
            return n;

        //dfine pointers
        int left=0;
        int maxLen=0;

        Map<Character,Integer> map= new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char rc = s.charAt(right);
            map.put(rc, map.getOrDefault(rc,0)+1);

            while(map.size() > 2)
            {   char lc = s.charAt(left);
                map.put(lc,map.get(lc)-1);

                if(map.get(lc)==0)
                {
                    map.remove(lc);
                }

                left++;

            }

            maxLen = Math.max(maxLen, right-left+1);
        }

        return maxLen;

    }

    public static void main(String[] args) {

        String s= "eceba";
        System.out.println(longestSubstringWithMostKdistinctcharacters(s));

    }
}
