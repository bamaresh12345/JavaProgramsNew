package TlearningWorkDay;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringwithAtMostKDistinctCharacters_LeetCode340 {
/*
use right and let pointers
hasmPms to store the chars
whileloop to shrink the window using left pointer
retun maxLen
 */

    public static int longestSubstringAtMostKDistinct(String s, int k)
    {
      int left=0;
      int maxLen=0;

      // hashmap  to sotre chars
        Map<Character,Integer> map = new HashMap<>();

        //expand the window using right pointer

        for (int right=0; right<s.length(); right++)
        {
            char chr = s.charAt(right);  // get the right pointer elemlent into chr
            //put in hasmap
             map.put(chr, map.getOrDefault(chr,0)+1);

            System.out.println("map size " + map.size() );
            System.out.println("right -left-->" +(right -left)  );
            while(map.size() > k)
            {
                char chl = s.charAt(left); // get the left char
                map.put(chl, map.get(chl)-1);
                //check if map having chl count=0 , the nremove it
                if(map.get(chl) == 0 )
                {
                    map.remove(chl);  // remove left element if count is 0
                }

                left++;
            }

            //calcuate maxLen
            maxLen = Math.max(maxLen , right -left+1);

        }



// reutn
        return maxLen;
    }
    public static void main(String[] args) {
        String  s = "eceba";
        int k = 2;

        System.out.println(longestSubstringAtMostKDistinct(s,k));
    }
}
