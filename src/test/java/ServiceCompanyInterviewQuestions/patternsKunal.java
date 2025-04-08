package ServiceCompanyInterviewQuestions;

public class patternsKunal {

    public static void main(String[] args) {

        SquareorRectangle(4);
        IncreasingTriangle( 4);
        DecreasingTriangle( 4);
        patteren4( 4);
        patteren5( 4);
        Triangle( 4);
        ReverseTriangle( 4);
        patteren8( 4);


    }

    /*
     * * * *
     * * * *
     * * * *
     * * * *
     */
    static void SquareorRectangle(int n)
    {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
    /*

     *
     * *
     * * *
     * * * *
     * * * * *

     */
    static void IncreasingTriangle(int n)
    {     System.out.println();

        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }

    /*
     * * * * *
     * * * *
     * * *
     * *
     *
     */
    static void DecreasingTriangle(int n)
    {     System.out.println();

        for (int i = 0; i <=n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    // printng row number
    /*
         *
         * *
         * * *
         * * * *
         * * * * *

         3 for loops
         1. for rows
         2. for columns with space
         3. with coluns with *

     */
    static void patteren4(int n)
    {    System.out.println();
        for (int i = 0; i <=n ; i++) {

            for (int j = i; j <=n; j++) {
                System.out.print(" " + " ");
            }

            for (int j = 0; j <=i; j++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }

    }

    // printng row number
    /*
         * * * * *
         * * * *
         * * *
         * *
         *

         3 for loops
         1. for rows
         2. for columns with space
         3. with coluns with *
     */
    static void patteren5(int n)
    {    System.out.println();
        for (int i = 0; i <=n; i++) {

            for (int j = i; j <=n; j++) {
                System.out.print("*" + " ");
            }

            for (int j = 0; j <=i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

    }
/*

                    *
                  * * *
                * * * * *
               * * * * * * *
             * * * * * * * * *

             5 for loops --> 4 blocks --> 5 for loops** copy paste 2 blocks , it should work fine
 */

    static void Triangle(int n) {
        System.out.println();

        for (int i = 0; i <= n; i++) {

            for (int j = i; j <= n; j++) {
                System.out.print(" " + " ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }

            for (int j = 0; j < i; j++) {   // *** IMP only here remove equal to sign j <i  , above code copy paste
                System.out.print("*" + " ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print(" " + " ");
            }

            System.out.println();
        }
    }

    /*

     * * * * * * * * *
        * * * * * * *
          * * * * *
            * * *
              *

      four blocks --> copy paste 2 blocks , it should work fine

     */
        static void ReverseTriangle(int n)
    {
        System.out.println();

        for (int i = 0; i <=n ; i++) {

            for (int j = 0; j <=i ; j++) {
                System.out.print(" " + " ");
            }

            for (int j = i; j<=n; j++) {
                System.out.print("*" + " ");
            }

            for (int j = i; j<n; j++) {  // *** IMP only here remove equal to sign j <i  , above code copy paste
                System.out.print("*" + " ");
            }

            for (int j = 0; j <=i ; j++) {  // Copy paste smart way
                System.out.print(" " + " ");
            }

            System.out.println();
        }


    }

    static void patteren8(int n) {
        System.out.println();

        for (int i = 0; i <=n; i++) {


            for (int j = 0; j <=n ; j++) {
                System.out.print(" " + " ");
            }

            for (int j = 0; j <=i ; j++) {
                System.out.print("*"+ " ");
            }


            System.out.println();
        }

    }



    }


