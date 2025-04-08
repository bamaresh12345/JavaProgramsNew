package ServiceCompanyInterviewQuestions;

import java.util.Arrays;

public class SecondLargestStringEelment {

    public static String findsecondLsrgestString(String s)
    {
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {

                if(words[i].length() > words[j].length()) // 2nd smallest just use words[i].length() < words[j].length()
                {
                    String temp = words[i];
                        words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(words)); // [is, for, this, testing]
        System.out.println("Smallest element : " +words[0]);  //is
        System.out.println("2nd Smallest element : " +words[1]);  //for
        System.out.println(" Largest element : " + words[words.length-1]);  // testing  *** IMP
        System.out.println("2nd Smallest element : " + words[words.length-2]);  //this

        return words[words.length-1];
    }

    public static void main(String[] args)
    {

        String s = "this is for testing";

        System.out.println(findsecondLsrgestString(s));



    }


}
