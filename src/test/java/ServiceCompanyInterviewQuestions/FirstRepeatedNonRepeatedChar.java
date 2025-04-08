package ServiceCompanyInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatedNonRepeatedChar {

    public static void firstRepeatedNonRepeatedChar(String s) {

        s = s.replaceAll(" ", "");
        System.out.println(s);

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char[] chars = s.toCharArray();

        //first NonRepeated Char
        for (char c : chars) {   // **** IMP
            if (map.get(c) == 1) {  // **** IMP   map.get(c)
                System.out.println("non repeat key : " + c);
                break;
            }


        }
        //first Repeated Char
        for (char c : chars) {
            if (map.get(c) > 1) {   // **** IMP   map.get(c)
                System.out.println("first repeat key : " + c);
                break;
            }

        }


    }

    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        String s = "JavaConceptOfTheDay";

        firstRepeatedNonRepeatedChar(s);

    }
}
