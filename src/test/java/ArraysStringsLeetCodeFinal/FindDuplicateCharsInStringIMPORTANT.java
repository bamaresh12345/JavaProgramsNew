package ArraysStringsLeetCodeFinal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharsInStringIMPORTANT {

    //Breute force
    public static void findDuplicateCharsInString(String s) {
        int length = s.length();
        String rm = "";
        char[] ch = s.toCharArray();  // Find duplicate chars in array

        for (int i = 0; i < ch.length; i++) {

            for (int j = i + 1; j < ch.length; j++) {

                if (ch[i] == ch[j]) {
                    System.out.println("Duplicate chars in are : " + ch[i]);
                }

            }

        }
        System.out.println("remove Duplicate chars  : " + rm);
    }

    public static void main(String[] args) {

        String s = "maheshbabu";
        System.out.println("\n******Using BrueForce**********\n");
        findDuplicateCharsInString(s);
        System.out.println("\n******Using HashMap**********\n");
        findDuplicateCharsInStringHashMap(s);
        System.out.println("\n******Using HashSet**********\n");
        findDuplicateCharsInStringSet(s);

    }


    public static void findDuplicateCharsInStringHashMap(String s) {
        {
            Map<Character, Integer> map = new HashMap<>();

            char[] ch = s.toCharArray();  // toCharArray() is IMP****

            for (int i = 0; i < ch.length; i++) {

                if (map.containsKey(ch[i])) {
                    map.put(ch[i], map.get(ch[i]) + 1);
                } else {
                    map.put(ch[i], 1);
                }
            }

            int largestValue = 0;
            char largestKey = 0;  // ** IMP char c =0  ZERO is imp***
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {

                if (entry.getValue() > largestValue) {
                    largestValue = entry.getValue();
                    largestKey = entry.getKey();   // IMP****

                    // System.out.println("duplicae key : " + largestKey + " duplicate vale : " + largestValue);
                }


            }


            System.out.println("duplicae key : " + largestKey + " duplicate vale : " + largestValue);

        }
    }


    public static void findDuplicateCharsInStringSet(String s) {

        Set<Character> set = new HashSet<>();
        char[] ch = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {

            if (!set.add(ch[i]))  // not set.add() is IMP***
            {
                System.out.println("duplicatre char : " + ch[i]);
            }


        }

    }
}
