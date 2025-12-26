package TlearningWorkDay;

import java.util.Arrays;

public class Anagram {

    public static String checkAnagram(String s, String t)
    {

        if(s==null || t==null ||  s.length()==0 || t.length()==0)
            return "*** S & T Strings are NOT Anagrams has Invalid Strings ****";

        if(s.length() != t.length())
            return "*** S & T Strings are NOT Anagrams has Invalid counts ****";

        s = s.replace(" ", "");
        t = t.replace(" ", "");
        char[] charss = s.toLowerCase().toCharArray();
        char[] charst = t.toLowerCase().toCharArray();

        System.out.println(Arrays.toString(charss));
        System.out.println(Arrays.toString(charst));


        Arrays.sort(charss);
        Arrays.sort(charst);

        if(Arrays.equals(charss,charst))
            return "*** S & T Strings are Anagrams ****";
        else
            return "*** S & T Strings are NOT Anagrams ****";



    }
    public static void main(String[] args) {
       // String s = "Moth er In  Law"; // *** IMP
        String s = "h er In  Lawsdfsdfsdf"; // *** IMP
        String t = "Hitler Woman";  // *** IMP

        System.out.println(checkAnagram(s,t));
    }
}
