package ServiceCompanyInterviewQuestions;

import java.util.Scanner;

public class removeVowels {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in); // *** IMP**

        System.out.println("Enter the string...");

        // String inputString = sc.nextLine();   // *** IMP**

        String inputString = "This is for testing";

        String newstr = inputString.replaceAll("[AEIOUaeiou]", "");


        System.out.println("The string without vowels--> : " + newstr);

        //  sc.close();
    }

}

