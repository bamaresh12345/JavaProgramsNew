package ArraysStringsLeetCodeFinal;

public class ReverseVowelsofaStringLT349 {
    /* 345. Reverse Vowels of a String
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases,
 more than once.
 Input: s = "IceCreAm" Output: "AceCreIm"

Example 2:
Input: s = "leetcode" Output: "leotcede"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
     */

    public static String reverseVowels(String s) {

        /*
          1. Convert chars into to CharArray() , not wile return use new Streing(chars)
          2. initilize 2 variables start=0, end=lenght of string -1
          3. run while loop till start less than end
          4. check is CHaracter if start is not vowel , then increment start++
          5. check id Character of end is not vowel , then decrment end value
          6. if if both are start and end are vowels then ,swap them and incrment start adn decrment end
          7. finally return char array as new String(ch)

        */

        int start = 0;
        int end = s.length() - 1;
        char[] chars = s.toCharArray();

        while (start < end) {
            if (!isVowel(chars[start])) {
                start++;
            } else if (!isVowel(chars[end])) {
                end--;
            } else {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }

        return new String(chars); // **IMP***
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);   // **IMP***

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            return true;
        else
            return false;
    }

    public static void main(String[] args) {


        String s = "IceCreAm"; //  Output: "AceCreIm"

        System.out.println(reverseVowels(s));

    }
}
