package LeetCode150Questions;

/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Input: strs = ["flower","flow","flight"] Output: "fl"
Input: strs = ["dog","racecar","car"] Output: ""
Explanation: There is no common prefix among the input strings.

 */
public class LengthOfCommonPrefix {

    public static String lengthOfCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }

        }

        return prefix;

    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        //String[] strs = {"dog","racecar","car"};

        System.out.println(lengthOfCommonPrefix(strs));

    }
}
