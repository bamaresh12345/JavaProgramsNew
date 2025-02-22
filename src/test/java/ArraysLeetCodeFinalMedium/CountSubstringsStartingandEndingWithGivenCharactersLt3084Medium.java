package ArraysLeetCodeFinalMedium;
//https://www.youtube.com/watch?v=6WyvVPm3ioY&list=PLoDervMHdCDIeZCycNfumh8PmhSIBcG0k&index=95

/* 3084 Count Substrings Starting and Ending With Given Characters

You are given a string s and a character c. Return the total number of substrings  of s that start and
end with c.

Example 1: Input: s = "abada", c = "a" Output: 6
Explanation: Substrings starting and ending with "a" are: "abada", "abada", "abada", "abada", "abada",
"abada".

Example 2: Input: s = "zzz", c = "z" Output: 6
Explanation: There are a total of 6 substrings in s and all start and end with "z".
Constraints:

1 <= s.length <= 105
 */
public class CountSubstringsStartingandEndingWithGivenCharactersLt3084Medium {

    /*
    1. create array with count to get the ASCII converted to store value
    2. run for loop and store all ASCII chars values count in array
    3. get the duplicate cha count and store in long value as k
    4. we have formula to find substrings  n = (n*(n+1))/2
    5. return result;
     */

    public static long countSubstringsStartingandEndingWithGivenCharacters(String s, char c) {

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        long n = count[c - 'a']; // ** Char c -'a'  returns the duplicate char count, delcare as LONG***
        long result = (n * (n + 1)) / 2;  // store result in LONG***

        return result;
    }

    public static void main(String[] args) {
        //String s = "abada";
        //char c = 'a';
        String s = "zzz";
        char c = 'a';


        System.out.println(countSubstringsStartingandEndingWithGivenCharacters(s, c));
    }
}
