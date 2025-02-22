package LearnToCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//NOTE: use only HASMAP , with
public class DuplicateString {

    public static String uniqueString(String s) {


        Map<Character, Integer> map = new HashMap<>();
        char c = 0;
        char d = 0;
        char e = 0;
        char z = 0;

        System.out.println("c value with char " + c);
        System.out.println("c value with char " + d);
        System.out.println("c value with char " + e);
        System.out.println("c value with char " + z);

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

        return uniqueString;
    }


    public static void main(String[] args) {
        String s = "aagayyaeehddj";

        System.out.println(uniqueString(s));
    }
}
