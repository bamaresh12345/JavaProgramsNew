package LeetCode150Questions;

/*
917. Reverse Only Letters Easy
Given a string s, reverse the string according to the following rules:

All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.

Example 1: Input: s = "ab-cd"  Output: "dc-ba"

Example 2: Input: s = "a-bC-dEf-ghIj" Output: "j-Ih-gfE-dCba"

 */
public class ReverseOnlyLettersleetCode917Easy {

    public static String reverseOnyLetters(String s) {

        int start = 0;
        int end = s.length() - 1;
        char[] chars = s.toCharArray();

        while (start < end) {
            if (!Character.isLetter(chars[start])) {
                start++;
            } else if (!Character.isLetter(chars[end])) {
                end--;
            } else {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }

        }

        return String.valueOf(chars); // update later accordingly
    }

    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";

        System.out.println(reverseOnyLetters(s));
    }
}
