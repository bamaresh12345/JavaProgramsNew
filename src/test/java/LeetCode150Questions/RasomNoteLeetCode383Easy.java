package LeetCode150Questions;

import java.util.HashMap;

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
    /*
     1. delcare freq array with 26 length
     2. run for loop till end if mazaine length
     3. jsut add all chars of magazine with ASCII value with plus One  freq[magazine.charAt(i) - 'a']++;
     4. run one more for loop for rasomNOte till end of length of string
     5. check if freq of array -'a' ASCII is = zero, if (freq[ransomNote.charAt(i) - 'a'] == 0)
     6. if yes return false
     7. no else jsut decrment [rasmonNOte.charAt(i) -'a'] --
     8. finally return true if all goes well.


     */


        public static boolean rasomNote(String ransomNote, String magazine) {
            // Create a HashMap to store the frequency of characters in the magazine
            HashMap<Character, Integer> map = new HashMap<>();

            // Count frequencies of characters in the magazine
            for (char ch : magazine.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            // Check if we can form the ransomNote
            for (char ch : ransomNote.toCharArray()) {
                if (!map.containsKey(ch) || map.get(ch) == 0) {  //First, check if the character exists in the magazine using containsKey().hen ensure there are enough instances by checking if the frequency is greater than zero.
                    return false; // Not enough characters to form ransomNote
                }
                map.put(ch, map.get(ch) - 1); // Use one character and Decrease the count by 1 to mark that letter as used.
            }

            return true; // ransomNote can be constructed
        }




    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ba";

        System.out.println(rasomNote(ransomNote, magazine)); //false
        System.out.println(rasomNote("a", "b")); // Output: false
        System.out.println(rasomNote("aa", "ab")); // Output: false
        System.out.println(rasomNote("aa", "aab")); // Output: true
    }
}
