package LearnToCode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    /*
    user TWO Pointer approach
    1. initilize 2 pointers a_pointer=0, b_pointer=0; and maxCount=0
    2. initilize set to store uniquw characters
    3. run while loop till end of b_pointer < s.length
    4. check if set does not contains s string char of bpointer
    5. then add it to set
    6. get the max size() of the set by comparing with maxCount
    7. if char of String already contains in set
    8. then remove the char with the help of a_pointer and incrment a_pointer++
    9. continue till end of while loop
    10, finally retun maxCount --> gives the unique chars from given string
     */
    public static int longestSubstringWithoutRepeatingCharacters(String s) {
        int a_pointer = 0;
        int b_pointer = 0;
        int maxCount = 0;
        Set<Character> set = new HashSet<>();
        while (b_pointer < s.length()) { // VERY IMP b-pointer < s.length
            if (!set.contains(s.charAt(b_pointer))) {
                set.add(s.charAt(b_pointer));
                maxCount = Math.max(set.size(), maxCount);
                b_pointer++;  // VERY IMP
            } else {
                set.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }

        return maxCount;


    }

    public static void main(String[] args) {
        String s = "abcabcbb";

        System.out.println(longestSubstringWithoutRepeatingCharacters(s));
    }
}
