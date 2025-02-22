package ServiceCompanyInterviewQuestions;

import java.util.Arrays;

public class checkArraysareEqualwithStrings {

    public static boolean checkArraysareEqual(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        Arrays.sort(arr1);
        Arrays.sort(arr1);

        if (Arrays.equals(arr1, arr2)) {
            return true;
        } else {
            return false;
        }


    }

    public static void main(String args[]) {

        String[] arr1 = {"java", "swings", "j2ee", "struts", "jsp", "hibernate"};

        String[] arr2 = {"java", "struts", "j2ee", "hibernate", "swings", "jsp"};

        System.out.println(checkArraysareEqual(arr1, arr2));
    }
}
