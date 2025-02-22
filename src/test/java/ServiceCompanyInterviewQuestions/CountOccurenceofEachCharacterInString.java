package ServiceCompanyInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceofEachCharacterInString {

    public static void countOccurenceofEachCharacterInString(String s) {

        Map<Character, Integer> map = new HashMap<>();
        s = s.replace(" ", "");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);

        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate char: " + entry.getKey() + " Duplicate count : " + entry.getValue());
            }
        }


    }

    public static void main(String[] args) {
        String s = "All is Well";

        countOccurenceofEachCharacterInString(s);

    }
}
