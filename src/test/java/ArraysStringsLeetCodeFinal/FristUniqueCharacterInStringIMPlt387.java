package ArraysStringsLeetCodeFinal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* 387. find the *First Unique Character in a String
https://www.youtube.com/watch?v=tYozGI1Vd_s
Given a string s, find the first non-repeating character in it and return its index. If it does not
 exist, return -1.
Example 1:
Input: s = "leetcode" Output: 0
Explanation: The character 'l' at index 0 is the first character that does not occur at any other index.
Example 2: Input: s = "loveleetcode" Output: 2

Example 3: Input: s = "aabb" Output: -1
 */
public class FristUniqueCharacterInStringIMPlt387 {

    public static int fristUniqueCharacterInString(String s) {
        /*
        1. use ASCII value concept
        2. create integer array of 26 and
        3. store each cahrs ASCII  l-97 --> its index to +1
        4. finally run for loop and get the ch array which value =1;
         */

        int[] freq = new int[26];    // Very IMP****

        char[] chars = s.toCharArray(); // Very IMP****


        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);    // Very IMP****
            freq[c - 'a']++;     // Very IMP****

        }

        System.out.println(Arrays.toString(freq));

        for (int i = 0; i < chars.length; i++) {

            if (freq[chars[i] - 'a'] == 1)   // Very IMP**** // Very IMP****
                return i;

        }

        return -1;

    }

    public static void main(String[] args) {
        //String s = "leetcode";  //0
        String s = "loveleetcode";  //0

        System.out.println(fristUniqueCharacterInString(s));
        System.out.println(fristUniqueCharacterInStringHashMap(s));

    }

    public static int fristUniqueCharacterInStringHashMap(String s) {

        /*
          1. Use hashMap , store all the key and values
          2. run for loop with s.length() string
          3. look for s.charAt(i) in map ==1
          4. if yes then return index of s.charAt(i) --> i

         */
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (int i = 0; i < s.length(); i++) { // *** VERY IMP***
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }

        }
        return -1;
    }
}
