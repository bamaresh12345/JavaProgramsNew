package TwoPointersNew.SlidingWindow_VariableLength;
/*
🔑 WHAT ARE WE REALLY CHECKING?
For any group of blocks:
Pick the color that appears most
Repaint all other colors
If repaint count ≤ k, that group is VALID


📋 STEP-BY-STEP TABLE
left	right	Window	A,B count	maxFreq	Window size	Replacements	Valid?	maxLen
0	        0	  A	A=1 B=0	1	1	0	✅	1
0	        1	AA	A=2 B=0	2	2	0	✅	2
0	        2	AAB	A=2 B=1	2	3	1	✅	3
0	        3	AABA	A=3 B=1	3	4	1	✅	4
0	        4	AABAB	A=3 B=2	3	5	2	❌	4

 */
public class LongestRepeatingCharacterReplacementLC424 {

    public static int longestRepeatingCharacterReplacement(String s ,int k)
    {
        int left=0;
        int maxLen=0;
        int maxFreq = 0;
        int[] freq = new int[26];  //➡️ Stores frequency of characters in the current window eg : freq[0] → A , freq[1] → B

        for (int right=0; right < s.length(); right++)
        {

          char ch = s.charAt(right);    // ch= 'A'
           freq[ch - 'A']++;   //freq[A] = 1

            // track most frequent character in window
            maxFreq = Math.max(maxFreq , freq[ch - 'A']);

            // if replacements needed > k, shrink window
            while((right - left + 1) - maxFreq > k)
            {
                freq[s.charAt(left) - 'A']--;    // remove 'A'  from freq[]  array
                left++;
            }

            maxLen = Math.max(maxLen , right - left +1);
        }

  return maxLen;

    }
    public static void main(String[] args) {
        String  s = "ABAB";
         int k = 2;

        System.out.println(longestRepeatingCharacterReplacement(s,k));
    }
}
