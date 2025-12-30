package TlearningWorkDay;

public class LongestRepeatingCahracterReplacementLt424 {
/*
Example :
Input:  s = "AABABBA", k = 1
Output: 4
AABA --> AAAA --> 4
ABBA --> BBBB --> 4

 */


    public static int longestRepeatingCharacterReplacement(String s, int k )
    {
        int maxFreq=0;
        int[] freq = new int[26];
        int left=0;
        int maxLen=0;

        // right pointer expands the window
        for (int right=0; right < s.length(); right++)
        {
            char rch = s.charAt(right);
            freq[rch - 'A']++;   // Increases the frequency of current char

            //update the max Frequency in the current window
            maxFreq = Math.max(maxFreq ,freq[rch - 'A']);

            /*
              Window size = right - left +1
              char to repalce window size by left pinter
              for replace mant neede > k --> then shrink hte window
             */
            while(((right - left +1) - maxFreq) > k)
            {
                freq[s.charAt(left) -'A']--;   // remove elelment from the window
                left++;  // dectment the left pointer

            }
            maxLen = Math.max(maxLen, right - left +1);  // update the max window length



        }

        return maxLen;


    }
    public static void main(String[] args) {


        String  s = "ABAB";
        int k = 2;

        System.out.println(longestRepeatingCharacterReplacement(s,k));
    }
}
