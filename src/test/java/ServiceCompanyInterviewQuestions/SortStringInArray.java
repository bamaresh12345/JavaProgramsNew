package ServiceCompanyInterviewQuestions;

import java.util.Arrays;

public class SortStringInArray {

    public static String[] sortStringInArray(String s) { // if Array given , jsut direct run for loop
        String[] words = s.split(" ");


        for (int i = 0; i < words.length; i++) {

            for (int j = i + 1; j < words.length; j++) {

                if (words[i].length() > words[j].length()) { // i , j
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }


            }

        }
        return words;

    }

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        String s = "this is for tesitng";

        System.out.println(Arrays.toString(sortStringInArray(s)));
    }
}
