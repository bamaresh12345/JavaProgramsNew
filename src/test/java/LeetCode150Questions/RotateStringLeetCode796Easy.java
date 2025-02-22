package LeetCode150Questions;

/*
796. Rotate String  Easy

Given two strings s and goal, return true if and only if s can become goal after some number of shifts
 on s.
A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.

Example 1: Input: s = "abcde", goal = "cdeab"
Output: true

Example 2:Input: s = "abcde", goal = "abced"
Output: false
 */

public class RotateStringLeetCode796Easy {
    /*

    magine we have s = "abc" and goal = "cab". We want to find out if by cyclically shifting s, we can
    obtain goal.
    First of all, we check if both s and goal have the same length. Here, both s and goal have a length of 3, so we pass this check.
    We then concatenate s with itself. So, s + s = "abcabc". Notice that this new string, "abcabc",
    contains all possible shifts of s:

    The original string "abc" (starting at index 0)
    The first shift "bca" (starting at index 1)
    The second shift "cab" (starting at index 2)
    Finally, we look for goal in this new doubled string. goal = "cab" is a substring of s + s = "abcabc",
     starting from index 2 to index 4.
    Because we found goal within s + s, we can confidently return True, which signifies that it is possible
     to get goal by shifting s two places to the right.
    Had goal not been found within the double string s + s, we would have returned False, meaning no amount
     of shifting would have matched s to goal.
     */
    public static boolean rotateString(String s, String goal) {
        String doubleS = s + s;  //abcdeabcde

        if (doubleS.contains(goal))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        // String s = "abcde";  //true
        //  String goal = "cdeab";

        String s = "abcde";  //true
        String goal = "abced";
        System.out.println(rotateString(s, goal));
    }
}
