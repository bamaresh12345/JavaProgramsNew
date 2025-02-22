package ServiceCompanyInterviewQuestions;

import java.util.Scanner;

public class FindPrimeNuber {

    public static void main(String[] args) {
        int n;

        for (int j = 0; j < 20; j++) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a number : ");
            n = s.nextInt();

            if (n < 2)
                System.out.println("its a prime " + n);

            boolean b = false;
            for (int i = 3; i < n; i++) {

                if (n % i == 0) {

                    b = true;

                }
            }

            if (b == true) {
                System.out.println("not a prime " + n);
            } else {
                System.out.println("its a prime " + n);
            }
        }
    }
}
