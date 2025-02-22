package StringsOnlyGoodOne;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsInString {

    public static void findDuplicatCharsInString(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);

        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1)
                System.out.println("Duplicate char: " + entry.getKey() + " Duplicate count: " + entry.getValue());
        }


    }

    public static void main(String[] args) {
        String s = "test";

        findDuplicatCharsInString(s);
        findDuplicatCharsInStringsets(s);
        findDuplicatCharsInStringForLoop(s);
    }


    public static void findDuplicatCharsInStringsets(String s) {

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (!set.add(s.charAt(i))) {
                System.out.println("duplicate char " + s.charAt(i));
            }
        }

        System.out.println("**************************");
    }

    public static void findDuplicatCharsInStringForLoop(String s) {

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    System.out.println("duplicate char " + s.charAt(j));
                }
            }

        }
    }
}
