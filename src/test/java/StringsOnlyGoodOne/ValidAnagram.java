package StringsOnlyGoodOne;

import java.util.*;

public class ValidAnagram {

    public static boolean validAnagram(String s, String t) {

        //base case
        if (s.length() != t.length())
            return false;

        char[] charss = s.toLowerCase().toCharArray();
        char[] charst = s.toLowerCase().toCharArray();

        Arrays.sort(charss);
        Arrays.sort(charst);

        if(Arrays.equals(charss,charst))
            return true;
        else
            return false;



    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaraM";

        System.out.println(validAnagram(s, t));
    }
}
