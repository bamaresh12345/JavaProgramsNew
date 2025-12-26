package TlearningWorkDay;
import java.util.*;

public class LongestSubStringTestLt {
    /*
       two pointer approach --. for this we need 2 varabiels
       left=right=0
       maxLen =0  , to store the length of array
       Set to store unique chars  , operations add and remove should be fine
       need one for loop and one while loop
       Math.max to get the max value of left and right pointers

       Example Walkthrough

        Input: "abcabcbb"

        Window	Substring	Length
        0–2	abc	3
        1–3	bca	3
        2–4	cab	3

        Output: 3

     */

    public static int findLongestSubString(String s)
    {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);   // IMP ****

            // If duplicate found, remove until unique  from the backend****
            /* Handle Duplicate Characters

            What’s happening here?
                If ch already exists in the set → duplicate found
                I will shrink the window from the left
                Remove characters until the duplicate is gone

                Why while loop?
                There may be multiple duplicates
                We keep removing until the window is valid (all unique)

             */
            while (set.contains(ch)) {
                set.remove(s.charAt(left));     // left *** IMP
                left++;
            }


            /*  Add the current character to the window
                Now the substring has unique characters
             */
            set.add(ch);  //Add the current character to the window
            maxLength = Math.max(maxLength, right - left + 1);  //right minus - left + 1
        }

        return maxLength;
    }

    public static void main(String[] args)
    {

        String s = "pwwkew";

        System.out.println(findLongestSubString(s));
    }
}
