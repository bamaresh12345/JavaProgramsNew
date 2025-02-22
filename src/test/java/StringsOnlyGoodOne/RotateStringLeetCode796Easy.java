package StringsOnlyGoodOne;

/*
796. Rotate String
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.

Example 1:
Input: s = "abcde", goal = "cdeab" Output: true

Example 2:
Input: s = "abcde", goal = "abced" Output: false
 */
public class RotateStringLeetCode796Easy {

    public static boolean rotateString(String s, String goal) {
        String doubleString = s + s;

        if (doubleString.contains(goal))
            return true;
        else
            return false;

        //return false;
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        System.out.println(rotateString(s, goal));
    }
}
