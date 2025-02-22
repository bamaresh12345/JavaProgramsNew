package StringsOnlyGoodOne;

/*

387. First Unique Character in a String
Given a string s, find the first non-repeating character in it and return its index. If it does not exist,
 return -1.

Example 1:
Input: s = "leetcode"
Output: 0
Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.
Example 2:

Input: s = "loveleetcode"

Output: 2

Example 3:

Input: s = "aabb"

Output: -1
 */
public class FristUniqueCharacterInStringIMPlt387 {

    public static int FristUniqueCharacterInString(String s) {
        int[] chars = new int[26];
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {

            if (chars[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {

        String s = "leetcode";

        System.out.println(FristUniqueCharacterInString(s));

    }
}
