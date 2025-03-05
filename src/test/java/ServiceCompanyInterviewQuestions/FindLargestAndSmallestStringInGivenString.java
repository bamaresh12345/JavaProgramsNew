package ServiceCompanyInterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindLargestAndSmallestStringInGivenString {

    public static String largestString(String s) {
        String[] words = s.split(" ");
        String largestString = words[0];   //*** IMP***
        String smallestString = words[0];  //*** IMP***

        for (int i = 0; i < words.length; i++) {


            if (words[i].length() > largestString.length()) {  //***  largestString.length()

                largestString = words[i];

            } else if (words[i].length() < smallestString.length()) { //*** smallestString.length()

                smallestString = words[i];
            }
        }

        System.out.println("Smallest String : " + smallestString);
        System.out.println("Largest String : " + largestString);
        //return largestString;

        return "small String: " + smallestString + " and large String: " + largestString;

    }


    public static void main(String[] args) {

        String s = "this is for tesitng";


        System.out.println(largestString(s));


    }


}
