package ServiceCompanyInterviewQuestions;

import java.util.Scanner;

public class FindPrimeNumber2 {

    public static void main(String[] args) {
        int n = 0;
        System.out.println("Enter nubmer : ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        if (n <= 1)
            System.out.println("Not a prime");

        boolean prime = false;
        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                prime = true;
                break;
            }

        }

        if (prime)
            System.out.println(n + " :Not a prime nubmer");
        else
            System.out.println(n + " : is prime nubmer");


    }
}
