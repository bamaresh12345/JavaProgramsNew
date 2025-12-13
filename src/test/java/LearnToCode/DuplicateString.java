package LearnToCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//NOTE: use only HASMAP , with
public class DuplicateString {

    public static String uniqueString(String s) {


        Map<Character, Integer> map = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {

            if (map.containsKey(s.charAt(i))) {

                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        String uniqueString = "";
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueString = uniqueString + entry.getKey();
            }

        }

        String duplicateString = "";
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                duplicateString = duplicateString + entry.getKey();
                System.out.println("With MAP Duplicate String ->  " + entry.getKey() + " duplicate count -> " +entry.getValue() );
            }

        }

        return uniqueString;
    }

    public static boolean findDuplicatCharsInStringsets(String s) {

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (!set.add(s.charAt(i))) {
                System.out.println("duplicate char " + s.charAt(i));
              //  return true;
            }
        }

        System.out.println("With Set" + set);
        System.out.println("**************************");
        return false;
    }
  // to find the unique chars in string
    public static boolean findDuplicatCharsInStringForLoop(String s) {

        Set<Character> set = new HashSet<>();

        String unichar = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {

                } else
                {
                    unichar = s.charAt(j) + unichar;
                    set.add(s.charAt(i));
                }
            }


        }
        System.out.println( "for loop unique chars " + set);
        return false;
    }

    public static void main(String[] args) {
        String s = "aagayyaeehddj";

        System.out.println(" With Maps -> " + uniqueString(s));  // UNIQUE STRING = ghj
        findDuplicatCharsInStringsets(s);
        findDuplicatCharsInStringForLoop(s);
    }
}
