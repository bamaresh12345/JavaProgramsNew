package ServiceCompanyInterviewQuestions;

public class FibonacciSerices {

    // 0,1,1,2,3,5,8,13,21

    public static void main(String[] args) {


        int first = 0;
        int second = 1;

        int n = 10; // nubmer of febonnic serices

        for (int i = 0; i < n; i++) {

            System.out.print(first + " "); // prints from zero
            int third = first + second;
            first = second;
            second = third;

            //System.out.print(first + " ");  // prints without zero
        }

    }

}
