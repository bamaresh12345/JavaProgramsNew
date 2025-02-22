package LeetCode150Questions;

public class LastWordofString {

/*
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring  consisting of non-space characters only.
Input: s = "   fly me   to   the moon  " Output: 4
Explanation: The last word is "moon" with length 4.
*/

    public static int LastWordofString(String s) {

        s = s.trim();
        int counter = 0;
        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) != ' ') {
                counter++;
            } else {
                break;
            }

        }
        return counter;
    }

    public static void main(String[] args) {


        String s = "   fly me   to   the moon  ";

        System.out.println(LastWordofString(s));

    }
}
