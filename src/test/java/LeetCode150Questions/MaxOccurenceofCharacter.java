package LeetCode150Questions;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurenceofCharacter {

    public static String maxOccurenceOfString(String s) {
        // s = s.toLowerCase();
        s = s.replaceAll(" ", "");
        System.out.println(s);

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println(map);
        int largest = 1;
        char c1 = 0;  // *** INILIZATION IS VERY IMP
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > largest) {
                largest = entry.getValue();
                c1 = entry.getKey();
            }

        }

        //return Character.toString(c1); // Very IMP***
        return "" + c1; // Very IMP***


    }

    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        String s = "Java J2ee Android Hibernate JSP";


        System.out.println(maxOccurenceOfString(s));


    }
}
