package extraLearnALLRepeated;

import java.util.Scanner;

public class reverseStrings {

    public static String reverseString(String s)
    {
         String rev="";

        for (int i = 0; i < s.length(); i++) {

            rev = s.charAt(i) + rev;
        }



        String[] words = rev.split(" ");
        String rev2="";
        for (int i = 0; i < words.length; i++) {

            rev2 = words[i] + " " + rev2;
        }

        if(s.equalsIgnoreCase(rev))
        {
            System.out.println("palandrome");
        }
        else
        {
            System.out.println("not palandrome");
        }
        return rev2;
    }

    public static void main(String[] args)
    {
        String s = "madam";

        Scanner sc = new Scanner(System.in);
        String s1= sc.next();

        System.out.println(reverseString(s));

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println("revers str --> " + sb.toString());

    }

}
