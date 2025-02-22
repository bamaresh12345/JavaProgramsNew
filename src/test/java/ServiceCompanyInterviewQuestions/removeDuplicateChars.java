package ServiceCompanyInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicateChars {

    public static String removeDuplicateChars(String s) {


        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {

            set.add(s.charAt(i));
        }

        System.out.println(set);
        String removeDuplicates = "";

        for (Character c : set) {
            removeDuplicates = removeDuplicates + c;
        }

        return removeDuplicates;
    }

    public static void main(String[] args) {

        String s = "amar";

        System.out.println(removeDuplicateChars(s));
        System.out.println(removeDuplicateCharsContains(s));
    }


    public static String removeDuplicateCharsContains(String s) {


        Set<Character> set = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {

            if (set.contains(s.charAt(i))) {
                set2.add(s.charAt(i));
            } else {
                set.add(s.charAt(i));
            }
        }

        System.out.println(set);
        System.out.println(set2);
        String removeDuplicates = "";

        for (Character c : set) {
            removeDuplicates = removeDuplicates + c;
        }

        return removeDuplicates;
    }
}
