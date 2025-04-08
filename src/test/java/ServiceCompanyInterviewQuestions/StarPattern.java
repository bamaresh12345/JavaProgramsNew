package ServiceCompanyInterviewQuestions;
/*
if we print i
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

if we print k
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5


if wer print j

    5
   5 5
  5 5 5
 5 5 5 5
5 5 5 5 5



 */
public class StarPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Print stars or numbers with space
            for (int k = 1; k <=i; k++) {

                System.out.print(i + " ");


            }
            System.out.println();
        }
    }


}
