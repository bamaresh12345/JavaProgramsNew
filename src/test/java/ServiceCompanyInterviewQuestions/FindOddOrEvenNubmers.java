package ServiceCompanyInterviewQuestions;

import java.util.Scanner;

public class FindOddOrEvenNubmers {

    public static void main(String[] args) {
        int n;

        for (int i = 0; i < 5; i++) {


            Scanner s = new Scanner(System.in);

            System.out.println("Enter any nubmer");
            n = s.nextInt();
            if (n % 2 == 0) {
                System.out.println("Even nubmer");
            } else {
                System.out.println("Odd nubmer");
            }
        }

    }
}
