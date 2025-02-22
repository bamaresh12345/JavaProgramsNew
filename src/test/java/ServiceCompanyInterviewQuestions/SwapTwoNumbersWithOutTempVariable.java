package ServiceCompanyInterviewQuestions;

import java.util.Scanner;

public class SwapTwoNumbersWithOutTempVariable {

    public static void main(String[] args) {
        int a, b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a value : ");
        a = s.nextInt();

        System.out.println("Enter b value : ");
        b = s.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Swapped and b values are " + a + " " + b);


    }
}
