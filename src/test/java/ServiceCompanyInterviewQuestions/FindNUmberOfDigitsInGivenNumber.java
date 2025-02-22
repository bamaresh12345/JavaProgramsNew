package ServiceCompanyInterviewQuestions;

import java.util.Scanner;

public class FindNUmberOfDigitsInGivenNumber {

    public static int findNUmberOfDigitsInGivenNumber(int n) {
        int last = 0;
        int count = 0;
        while (n > 0) {
            last = n % 10;
            count++;
            n = n / 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int n;
        for (int i = 0; i < 5; i++) {

            Scanner s = new Scanner(System.in);
            System.out.println("Enter number to count digits :");
            n = s.nextInt();
            System.out.println(findNUmberOfDigitsInGivenNumber(n));
        }


    }
}
