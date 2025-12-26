package TlearningWorkDay;

import java.util.HashSet;
import  java.util.*;
public class LongestSubString {
/*
   will slove with two pointers
   left and right will point to 0th element first
   maxLen =0 , used to store the max length of the substring
   one for loop to iterat the each chars
   Math.max to find the max of two varailbes
   to store unique chars use sets data strucutres


"p w w k e w";
            l     r
 */

    public static int  longestSubString(String s)
    {
        int left=0, right=0;
        int maxLen=0;
        Set<Character> set = new HashSet<>();

        for (right=0; right<s.length(); right++)
        {
            char ch = s.charAt(right);

            while(set.contains(ch))
            {
                set.remove(s.charAt(left));
                left++;
            }

            //add to set
            set.add(ch);
            maxLen = Math.max(maxLen, right-left+1);


        }

        return maxLen;

    }

    public static void main(String[] args) {

        String s = "pwwkew";

        System.out.println(longestSubString(s));
    }
}
