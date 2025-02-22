package LeetCode150Questions;

import java.util.HashSet;
import java.util.Set;

/*
Input: s = "bcabc"
Output: "abc"
 */
public class RemovingDuplicatesLettersIMPORTANT {

    public static String removeDuplicateLetters(String s) {
        String result = "";
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {

            if (set.add(s.charAt(i))) {
                result = result + s.charAt(i);
            }

        }

        return result;
    }


    public static String removeDuplicateLetters2(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            String ch = "" + s.charAt(i);

            if (!result.contains(ch)) {
                result = result + ch;
            }


        }

        return result;
    }

    public static void main(String[] args) {

        // String s =  "bcabc";  //abc
        String s = "cbacdcbc";  //abc

        System.out.println(removeDuplicateLetters(s));

    }
}
