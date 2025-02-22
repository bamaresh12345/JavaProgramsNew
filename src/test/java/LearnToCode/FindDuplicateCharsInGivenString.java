package LearnToCode;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharsInGivenString {

    public static Map<Character, Integer> findDuplicateCharsInGivenString(String str) {
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {

            if (map.containsKey(chars[i])) {
                map.put(chars[i], map.get(chars[i]) + 1);
            } else {
                map.put(chars[i], 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate key : " + entry.getKey() + " Duplicate value : " + entry.getValue());
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String str = "testisngs";

        System.out.println(findDuplicateCharsInGivenString(str));


    }
}
