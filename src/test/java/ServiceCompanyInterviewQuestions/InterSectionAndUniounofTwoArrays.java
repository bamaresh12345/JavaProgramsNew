package ServiceCompanyInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class InterSectionAndUniounofTwoArrays {
    //NOTE: this WORKS for Number arrays String Arrays or double Arrays , Char Arrays
    public static void intersectionOfTwoArrays(String[] s1, String[] s2) {

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < s1.length; i++) {
            if (map.containsKey(s1[i])) {
                map.put(s1[i], map.get(s1[i]) + 1);
            } else {
                map.put(s1[i], 1);
            }
        }


        for (int i = 0; i < s2.length; i++) {
            if (map.containsKey(s2[i])) {
                map.put(s2[i], map.get(s2[i]) + 1);
            } else {
                map.put(s2[i], 1);
            }
        }
//  Intersection Eelments common Elements between two arrays
        System.out.println("Intersection Eelments are : ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }

        }
//  Unioun Eelments are unique Elements from two arrays
        System.out.println("Unioun Elements are : ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }

        }
    }


    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};

        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
        intersectionOfTwoArrays(s1, s2);

    }
}
