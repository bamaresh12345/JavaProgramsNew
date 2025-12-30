package TwoPointers_Final.SlidingWindow_FixedLength;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
/*✅ Maximum Number of Vowels in a Substring of Given Length

LeetCode 1456
🔹 Problem Statement (Simple)
You are given:
A string s
An integer k
Find the maximum number of vowels (a, e, i, o, u) in any substring of length k.

🧠 Key Idea
This is a Sliding Window – Fixed Size problem.
Window size = k
Slide the window across the string
Count vowels inside the window
Track the maximum count

======================================================================================================
🧪 Example 1
s = "abciiidef"
k = 3

Substrings of size 3:
"abc" → 1 vowel
"bci" → 1 vowel
"cii" → 2 vowels
"iii" → 3 vowels  ✅ max
"iid" → 2 vowels

👉 Output: 3

🧪 Example 2
s = "leetcode"
k = 3

Substrings:
"lee" → 2 vowels
"eet" → 2 vowels
"etc" → 1 vowel
👉 Output: 2

🪟 Visual Sliding Window Diagram
s = "abciiidef", k = 3
========================================================================================================================

 */
public static int maximumNumberOfVowelsInASubstringOfGivenLength(String s, int k)
{
    int count = 0;
    int max = 0;

    // count vowels in first window
    for (int i = 0; i < k; i++) {
        if (isVowel(s.charAt(i))) {
            count++;
        }
    }
    max = count;

    // slide the window
    for (int i = k; i < s.length(); i++) {

        // add right character
        if (isVowel(s.charAt(i))) {
            count++;
        }

        // remove left character
        if (isVowel(s.charAt(i - k))) {
            count--;
        }

        max = Math.max(max, count);
    }

    return max;
}

    public static boolean isVowel(char ch)
    {
     ch = Character.toLowerCase(ch);

     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
     {
         return true;
     }
     else
     {
         return false;
     }



    }

    public static void main(String[] args) {


       /* String s = "abciiidef";
        int k = 3;*/
        String s = "leetcode";
        int k = 2;

        System.out.println(maximumNumberOfVowelsInASubstringOfGivenLength(s,k));
        System.out.println(maximumNumberOfVowelsInASubstringOfGivenLengthMyMethod(s,k));
    }

    public static int maximumNumberOfVowelsInASubstringOfGivenLengthMyMethod(String s, int k)
    {
        int maxVowelCount=0;
        for (int i=0; i<s.length()-k; i++)
        {
            String ssubStr = s.substring(i,k+i);
            int countVowels = checkVowel(ssubStr);
            maxVowelCount = Math.max(maxVowelCount,countVowels);

        }

        return maxVowelCount;

    }

    public static int checkVowel(String str)
    {

        int beforeLen= str.length();
        str = str.replaceAll("[aeiouAEIOU]", "");

        int afterLen = str.length();

        int actaulOvels = beforeLen - afterLen;
        return actaulOvels;


    }
}
