package TLeanringDontCheckThisFolder;

import java.util.Arrays;

public class AnagramPr {


    public static void validAmagram(String s1, String s2)
    {
        s1 = s1.replaceAll(" ", "");
        s2 = s2.replaceAll(" ", "");

        if(s1.length() != s2.length())
        {
            System.out.println("Not Valid Anagram");
        }
        else
        {
           char[] ss1 = s1.toCharArray();
           char[] ss2 = s2.toCharArray();


           Arrays.sort(ss1);
           Arrays.sort(ss2);

           if(Arrays.equals(ss1,ss2))
           {
               System.out.println("Valid Anagram");
           } else
           {
               System.out.println(" Not Valid Anagram");
           }
        }


    }
    public static void main(String[] args) {

        String s1 = "madam";

        String s2 ="madam";

        validAmagram(s1,s2);
    }
}
