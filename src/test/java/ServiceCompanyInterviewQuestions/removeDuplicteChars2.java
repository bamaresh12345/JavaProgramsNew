package ServiceCompanyInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicteChars2 {

    public static void main(String[] args) {

       String s = "bcabc";

       Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {

            set.add(s.charAt(i));
        }
        String finalString="";

        for (Character c : set)
        {
            finalString = finalString + c;
        }

        System.out.println(finalString);   //abc

    }
}
