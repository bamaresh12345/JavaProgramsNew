package LeetCode150Questions;

import java.util.Arrays;

/*
242. Valid Anagram Easy
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1: Input: s = "anagram", t = "nagaram"
Output: true

Example 2: Input: s = "rat", t = "car"
Output: false

 */
public class ValidAnagramIMPORTANT {
    /*
    1. create array with 26 intgers to store  value based on ASCII
    2. run for loop till end of string s length
    3. based on each char of s and its ASCII value incrment the int array with 1
    4. based of each char of t String and its ASCII value , decrment the int array with 1
    5. finally run the for loop on int array which has 26 length
    6. if the any of array int is not set to 0 , return false
    7. else return true
     */


    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }


        char[] chars = s.toLowerCase().toCharArray(); // add --> import java.util.*
        char[] chart = t.toLowerCase().toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chart);

        return Arrays.equals(chars, chart);


    }

    public static boolean DontUseThisvalidAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
//        String s = "anagram";
//        String t = "nagaram";
        String s = "rat";
        String t = "car";


        System.out.println(DontUseThisvalidAnagram(s, t));
        System.out.println(isAnagram(s, t));
    }
}
