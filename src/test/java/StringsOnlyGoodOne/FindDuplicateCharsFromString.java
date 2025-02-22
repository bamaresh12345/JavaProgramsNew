package StringsOnlyGoodOne;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharsFromString {

    public static String findDuplicateCharsFromString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        String duplicateString = "";
        for (int i = 0; i < s.length(); i++) {

            if (map.containsKey(s.charAt(i))) {

                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate char : " + entry.getKey() + " Duplicate count " + entry.getValue());
                duplicateString = duplicateString + "" + entry.getKey();
            }
        }

        return duplicateString;

    }

    public static void main(String[] args) {


        String s = "hackerearth";

        System.out.println(findDuplicateCharsFromString(s));
        System.out.println(findDuplicateCharsFromStringBruteForce(s));
    }

    // Works very well
    public static String findDuplicateCharsFromStringBruteForce(String s) {


        char[] chars = s.toCharArray();
        String duplictString = "";
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {

                if (chars[i] == chars[j]) {
                    duplictString = duplictString + chars[i];
                    System.out.print(chars[i] + " ");
                    break;
                }
            }

        }
        return duplictString;
    }
}
