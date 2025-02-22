package ServiceCompanyInterviewQuestions;

public class rightangleTriangle {


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++)  // *** IMP
            {
                System.out.print("*"); // *** IMP
            }
            System.out.println();
        }


        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print("*");  // *** IMP
            }
            System.out.println();
        }
    }
}
