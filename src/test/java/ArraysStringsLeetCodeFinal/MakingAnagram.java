package ArraysStringsLeetCodeFinal;
/*
We consider two strings to be anagrams of each other if the first string's letters can be
rearranged to form the second string. In other words, both strings must contain the same exact
letters in the same exact frequency. For example, bacdc and dcbac are anagrams, but bacdc and dcbad
are not.
Alice is taking a cryptography class and finding anagrams to be very useful. She decides on an
encryption scheme involving two large strings where encryption is dependent on the minimum number of
character deletions required to make the two strings anagrams. Can you help her find this number?

Given two strings,  and , that may not be of the same length, determine the minimum number of character
deletions required to make  and  anagrams. Any characters can be deleted from either of the strings.

Example.
s1="abc" , s2 = "test";
The only characters that match are the 's so we have to remove  from  and  from  for a total of
deletions.
 */

public class MakingAnagram {

    public static int makingAnagram(String s1, String s2) {
        int[] ch = new int[26];

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        for (int i = 0; i < s1.length(); i++) {
            ch[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            ch[s2.charAt(i) - 'a']--;
        }

        int total = 0;
        for (int i = 0; i < ch.length; i++) {

            if (ch[i] != 0) {
                total = total + Math.abs(ch[i]); // Math.abs(ch[i])  // *** IMP , this works when 2nd string is -1 , then it will counte one
                //total = total + 1; // this also works
            }
        }


        return total;
    }

    public static void main(String[] args) {

        String s1 = "rate";
        String s2 = "tars";

        System.out.println(makingAnagram(s1, s2));
    }
}
