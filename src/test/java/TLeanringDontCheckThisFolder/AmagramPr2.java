package TLeanringDontCheckThisFolder;
import java.util.*;
public class AmagramPr2 {


    public static String checkAnagram(String s1, String s2)
    {
        s1 = s1.replaceAll(" ", "");
        s2 = s2.replaceAll(" ", "");

        if(s1.length()!= s2.length()) {
            return "Its not Anagram";
        }

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();


        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1,c2))
        {
            return "Its Anagram";
        } else
        {
            return "Its not Anagram";
        }


    }
    public static void main(String[] args)
    {
        String s1 = "madam";

        String s2 ="madam";

        System.out.println(checkAnagram(s1,s2));

    }
}
