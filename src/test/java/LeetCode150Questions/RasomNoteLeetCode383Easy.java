package LeetCode150Questions;

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
        int[] freq = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            freq[magazine.charAt(i) - 'a']++;  //** magazine.charAt(i)  freq[magazine.charAt(i) - 'a']

        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (freq[ransomNote.charAt(i) - 'a'] == 0)  // freq[ransomNote.charAt(i) - 'a']
            {
                return false;
            }
            freq[ransomNote.charAt(i) - 'a']--;   // VERY IMP****
        }

        return true;

    }

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ba";

        System.out.println(rasomNote(ransomNote, magazine));
    }
}
