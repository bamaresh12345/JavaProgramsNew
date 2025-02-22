package StringsOnlyGoodOne;

import java.util.HashMap;
import java.util.Map;

/*
383. Ransom Note Easy
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the
letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.
Example 1: Input: ransomNote = "a", magazine = "b"
Output: false

Example 2: Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:Input: ransomNote = "aa", magazine = "aab"
Output: true
 */
public class RasomNoteLeetCode383Easy {

    public static boolean rasomNote(String ransomNote, String magazine) {

        int[] freq = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            freq[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (freq[ransomNote.charAt(i) - 'a'] == 0) {
                return false;
            } else {
                freq[ransomNote.charAt(i) - 'a']--;
            }
        }
        return true;
    }

    public static boolean rasomNote2(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = ransomNote.toCharArray();
        for (int i = 0; i < chars.length; i++) {

            if (map.containsKey(chars[i])) {
                map.put(chars[i], map.get(chars[i]) + 1);
            } else {
                map.put(chars[i], 1);

            }

        }
        int count = 0;
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if (map.containsKey(c) && map.get(c) > 0) {
                map.put(c, map.get(c) - 1);
                count++;
            } else {
                break;
            }
        }

        if (count == ransomNote.length())
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";

        System.out.println(rasomNote(ransomNote, magazine));
    }
}
