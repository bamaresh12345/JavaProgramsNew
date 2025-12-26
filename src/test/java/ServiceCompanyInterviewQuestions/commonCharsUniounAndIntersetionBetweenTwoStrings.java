package ServiceCompanyInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class commonCharsUniounAndIntersetionBetweenTwoStrings {
    public static void CommonCharsBetweenTowStrings(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        {
            for (int i = 0; i < chars1.length; i++) {
                if (map.containsKey(chars1[i])) {
                    map.put(chars1[i], map.get(chars1[i]) + 1);
                } else {
                    map.put(chars1[i], 1);
                }
            }


            for (int i = 0; i < chars2.length; i++) {
                if (map.containsKey(chars2[i])) {
                    map.put(chars2[i], map.get(chars2[i]) + 1);
                } else {
                    map.put(chars2[i], 1);
                }
            }
        }

        // Print intersetion  Characters
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }

        }

        // Print Unioun  Characters
        System.out.println();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }

        }

    }


    public static void main(String[] args) {

        String s1 = "thin sticks";
        String s2 = "thick bricks";

        CommonCharsBetweenTowStrings(s1, s2);
    }
}
