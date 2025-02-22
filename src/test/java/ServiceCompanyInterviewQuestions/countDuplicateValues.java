package ServiceCompanyInterviewQuestions2Learn;

import java.util.HashMap;
import java.util.Map;

public class countDuplicateValues {

    public static void countDuplicateValues(String s) {
        //Map<Character,Integer> map = new HashMap<>();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }


        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            // if (entry.getValue() > 1) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate Key : " + entry.getKey() + "  Duplicate  count :  " + entry.getValue());
            }
        }

    }

    public static void main(String[] args) {
        //  System.out.println("Try programiz.pro");

        String s = "tests";

        countDuplicateValues(s);


    }
}
