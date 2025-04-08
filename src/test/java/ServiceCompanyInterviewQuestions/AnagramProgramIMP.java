package ServiceCompanyInterviewQuestions;

import java.util.Arrays;

public class AnagramProgramIMP {

    public static boolean checkAnagram(String s, String t)
    {

        s=  s.replace(" ", "");  // *** IMP
        t = t.replace(" ","");  // *** IMP

        if(s.length()!=t.length())
            return false;



        char[] charss = s.toLowerCase().toCharArray();
        char[] charst = t.toLowerCase().toCharArray();

        Arrays.sort(charss);
        Arrays.sort(charst);
        System.out.println(Arrays.toString(charss));
        System.out.println(Arrays.toString(charst));

        if(Arrays.equals(charss,charst))
        {
            return true;
        }
        else
        {
            return false;
        }


    }
    public static void main(String[] args) {

        String s = "Moth er In  Law"; // *** IMP
        String t = "Hitler Woman";  // *** IMP

        System.out.println(checkAnagram(s,t));
    }
}
