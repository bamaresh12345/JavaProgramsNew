package StringsOnlyGoodOne;

/* 151
Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words.
The returned string should only have a single space separating the words. Do not include any extra spaces.

Input: s = "the sky is blue"
Output: "blue is sky the"

 */
public class ReverseEachWordInString151 {

    public static String reverseEachWordInString(String s) {
        String[] words = s.split(" ");
        String revString2 = "";
        String revString1 = "";


        for (int i = 0; i < words.length; i++) {

            String revWord = "";   // Very IMP***


            for (int j = 0; j < words[i].length(); j++) {

                revWord = words[i].charAt(j) + revWord;    // Very IMP***  langugage  prgrgramming good is JAVA

            }
            revString1 = revString1 + " " + revWord;  // Very IMP***
            //  revString2 = revWord + " " + revString2;  // Very IMP***

        }

        System.out.println("Reversed string : " + revString1);
        //System.out.println("Reversed string : " + revString2);


        return revString1;
    }

    public static void main(String[] args) {
        String s = "Java is good prgrgramming langugage";

        System.out.println(reverseEachWordInString(s));
    }
}
