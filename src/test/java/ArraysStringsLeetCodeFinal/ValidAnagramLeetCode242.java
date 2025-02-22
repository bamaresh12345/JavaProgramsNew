package ArraysStringsLeetCodeFinal;

/*
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,typically using all the original letters exactly 1s.
Example : Input: s = "anagram", t = "nagaram"  Output: true
Example : Input: s = "rat", t = "car" Output: false
 */
public class ValidAnagramLeetCode242 {
    public static boolean CheckValidAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] chars = new int[26];

        for (int i = 0; i < s.length(); i++) {

            chars[s.charAt(i) - 'a']++;
            chars[t.charAt(i) - 'a']--;

        }

        for (int c : chars) {
            if (c != 0)
                return false;
        }

        return true;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String s = "anagram";
        String t = "nagaram";

        System.out.println(CheckValidAnagram(s, t));

    }

}
