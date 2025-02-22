package ArraysStringsLeetCodeFinal;

import java.util.Arrays;

public class charsTestGenerices {

    public static void main(String[] args) {

        String s = "test";
        int[] freq = new int[26];    // Very IMP****

        char[] chars = s.toCharArray(); // Very IMP****


        for (int i = 0; i < chars.length; i++) {

            char c = chars[i];
            // Very IMP****
            freq[c - 'a']++;     // Very IMP****
            int x = (int) 'a';
            int y = (int) chars[i];

            System.out.println("chars[i] of Value --> " + chars[i]);
            System.out.println("chars[i] of Value --> " + 'a'); //a
            System.out.println("chars[i] of Value --> " + 'a' + 1); //a1
            System.out.println("chars[i] of Value --> " + (int) chars[i]);
            System.out.println(" (int)-'a' of Value --> " + (int) -'a');
            System.out.println("(int)-'A' of Value --> " + (int) -'A');
            System.out.println("(int)-'A' of Value --> " + (chars[i] - 'a'));
            System.out.println("(int)-'A' of Value --> " + (y - x));
            System.out.println("(int)-'A' of Value --> " + Arrays.toString(freq));
        }


    }
}
