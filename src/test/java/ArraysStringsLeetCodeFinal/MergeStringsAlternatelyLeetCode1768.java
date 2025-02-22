package ArraysStringsLeetCodeFinal;

/* 1768. Merge Strings Alternately
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1.
 If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.

Example 1: Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r

 */
public class MergeStringsAlternatelyLeetCode1768 {

    public static String mergeAlternately(String word1, String word2) {

        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }

            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }

        //String s = "" + result;
        //return s;

        return result.toString();   //OR


    }

    public static void main(String[] args) {

        String word1 = "abcd";
        String workd2 = "ABCDE";

        System.out.println(mergeAlternately(word1, workd2));


    }

}
