package ServiceCompanyInterviewQuestions;

import java.util.Scanner;

public class FloydsTriangle {
    /*
    Floyd's Triangle :
    1
    2   3
    4   5   6
    7   8   9   10
    11   12   13   14   15


    OR

    1	2	3	4	5
    6	7	8	9
    10	11	12
    13	14
    15

     */
    public static void main(String[] args) {
        int value = 1;
        int n = 5;
        System.out.println("Enter nubmer : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
        //for (int i = n; i >=0; i--) {  // prints reverse traingle
            for (int j = 1; j <= i; j++) {
                System.out.print(value + "\t");   // System.out.print("*" + " ");
                value++;

            }
            System.out.println();
        }
    }
}
