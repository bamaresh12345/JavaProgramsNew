package TLeanringDontCheckThisFolder;

import java.util.Arrays;

public class occurnectofString {

    public static void main(String[] args) {
        String s = "this for testing";

        int totallen = s.length();

        s= s.replace("t","");

        int replen = s.length();

        int acutallen = totallen -replen;

        System.out.println(acutallen);

        // How To Count Words in a String

        String s1 = " this for    tersing test";
        String[] arrlen = s1.split(" +");


        System.out.println("Split lenght " + arrlen.length);
        System.out.println("Split lenght " + Arrays.toString(arrlen));
               int count=0;
        for (int i = 0; i < s1.length()-1; i++) {
             char c = s.charAt(i);
            if(s.charAt(i)== ' '  && s.charAt(i+1)!=' ')  // EMPTY Char Literal

            {
               count++;
            }
        }

        System.out.println(count);
    }
}
