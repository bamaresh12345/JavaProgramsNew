package ArraysStringsLeetCodeFinal;

public class ReverseWordsinaString {
/*
Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words.
The returned string should only have a single space separating the words. Do not include any extra spaces.

Input: s = "the sky is blue"
Output: "blue is sky the"

 */

    public static String reverseWordsinaString(String s) {
        s = s.trim();
        String rev = "";

        String[] words = s.split(" +");  //" +" is a regular expression that matches one or more spaces.

        for (int i = 0; i < words.length; i++) {

            rev = words[i] + " " + rev;
        }

        return rev.trim();

    }

    public static void main(String[] args) {

        String s = "the sky is blue";

        System.out.println(reverseWordsinaString(s));
    }
}
