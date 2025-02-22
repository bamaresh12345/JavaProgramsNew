package ServiceCompanyInterviewQuestions;

import java.util.Scanner;

public class FindFactorialOnNumber {

    public static void main(String[] args) {

        int n;

        for (int j = 0; j < 5; j++) {

            Scanner s = new Scanner(System.in);
            n = s.nextInt();
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }

            System.out.println("factorail value: " + fact);

        }

    }
}
