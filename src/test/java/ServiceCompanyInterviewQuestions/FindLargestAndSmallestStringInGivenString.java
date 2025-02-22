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
        System.out.println(largestStringCollections(s));
    }


    public static String largestStringCollections(String s) {
        String[] words = s.split(" ");
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {

            list.add(words[i].length());
        }

        Collections.sort(list);
        System.out.println(list);

        //String smallestString = list.get(0);
        System.out.println("Smallest String lsit : " + list.get(0));
        System.out.println("Largest String list : " + list.get(list.size() - 1));

        String smallest = "", largest = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == list.get(0)) {
                System.out.println("Smallest String lsit : " + words[i]);
                smallest = words[i];

            } else if (words[i].length() == list.get(list.size() - 1)) {

                System.out.println("Largest String list : " + words[i]);
                largest = words[i];
            }
        }


        return "small String: " + smallest + " and large String: " + largest;

    }


}
