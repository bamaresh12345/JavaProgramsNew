package ServiceCompanyInterviewQuestions;

import java.util.Scanner;

public class ReverseNumber {


    public static void main(String[] args) {
        int n;

        for (int j = 0; j < 5; j++) {


            Scanner s = new Scanner(System.in);
            System.out.print("enter nubmer to reverse : ");
            n = s.nextInt();
            int last = 0;
            int rev = 0;
            while (n > 0) {
                last = n % 10;             // ** IMP 10
                rev = (rev * 10) + last;   // ** IMP 10
                n = n / 10;                // ** IMP 10
            }

            System.out.println("reversed nubmer : " + rev);

        }
    }
}
