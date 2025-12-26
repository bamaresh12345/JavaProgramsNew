package ServiceCompanyInterviewQuestions;

public class PyramidTrianglesAllKunal2 {

    public static void main(String[] args) {
        int n = 5;

        /* SQUARE PATTERN *** IMP
        2 for loops,
       1)1 for loop row,
       2) 2nd for loop for column print * and space *IMP
       */
        System.out.println("**** SQUARE ****");
        for (int i = 0; i <=n; i++) {    //2 Sqaure,  2for loops rows and columns loops i <=n with spaces
            for (int j = 0; j <=n; j++) {

                System.out.print("*" + " ");
            }

            System.out.println();
        }


         /* Increasing Rgiht angle Triangle *** IMP
          2 for loops,
          1)1 for loop row, j = 0; j < i  *** IMP
          2) 2nd for loop for column print * and space
       */
        System.out.println("\nIncreasing Rgiht 1st angle Triangle");
        for (int i = 0; i <=n; i++) {   //increasing Rgiht angle Triangle,2 for loops rows and columns loops j <=i with spaces
            for (int j = 0; j <= i; j++) {

                System.out.print("*" + " ");
            }
            System.out.println();
        }
        //System.out.println();



         /* Decreasing Rgiht angle Triangle *** IMP
          2 for loops,
          1) 1 for loop row, j=i, j <=n  *** IMP
          2) 2nd for loop for column print * and space
       */
        System.out.println("\nDecreasing Rgiht 1st angle Triangle");
        for (int i = 0; i <=n; i++) {
            for (int j = i; j <= n; j++) {

                System.out.print("*" + " ");  // *** VERY IMP two spaces

            }
            System.out.println();
        }


        System.out.println();
        /// Decreasing Rgiht angle Triangle

         /* Increasing Rgiht angle 2nd Triangle *** IMP
          3 for loops,
          1)1 for loop row,   only for rows
          2)2 for loop row,      j = i; j < n   print only with "spaces + spaces "*** IMP
          3)3 for loop row,      j = i; j < i   print * and space , "*" + spaces "*** IMP

       */

        System.out.println("\n increasing Rgiht 2nd angle Triangle");
        for (int i = 0; i <=n; i++) {//Decreasing Rgiht angle Triangle,2 for loops rows and columns loops j=i, j <=n with spaces
            for (int j = i; j <=n; j++) {

                System.out.print(" " + " ");  // *** VERY IMP two spaces

            }
            for (int j = 0; j <=i; j++) {

                System.out.print("*" + " ");  // *** VERY IMP two spaces

            }

            System.out.println();
        }

        System.out.println();


//=========================================================================

        /// Decreasing Rgiht angle Triangle


          /* Decreasing/Increasing Rgiht angle 2nd Triangle *** IMP
            3 for loops,
          1)1 for loop row,   only for rows
          2)2 for loop row,      j = i; j < i   print only with "spaces + spaces "*** IMP
          3)2 for loop row,      j = i; j < n   print * and space , "*" + spaces "*** IMP

       */

        System.out.println("Decreasing 2nd Rgiht angle Triangle**");
        for (int i = 0; i <=n; i++) {//Decreasing Rgiht angle Triangle,2 for loops rows and columns loops j=i, j <=n with spaces
            for (int j = 0; j <=i; j++) {

                System.out.print(" " + " ");  // *** VERY IMP two spaces

            }
            for (int j = i; j <= n; j++) {

                System.out.print("*" + " ");  // *** VERY IMP two spaces

            }

            System.out.println();

        }



     /* TRAIANGLE PATTERN *** IMP
       Triangle pattern , 3 for loops,
       1)1 for loop row,
       2) 2nd for loop for column only one space,no extraspace,
       3) 3rd for loop for column i or * print */
        System.out.println("FULL TRAIANGLE PATTERN");
        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = i; j < n; j++) {   // Decreasng Triangle with no Spaces
                System.out.print(" ");
            }

            // Print stars or numbers with space
            for (int j = 1; j <= i; j++) {   // Increasing Triangle with * or number and Spaces

                System.out.print(i + " ");


            }
            System.out.println();
        }


        System.out.println();
        /// Decreasing Rgiht angle Triangle from botton
        /* TRAIANGLE PATTERN REVERSE *** IMP
       Triangle pattern , 3 for loops,
       1)1 for loop row,
       2) 2nd for loop for column space,no extraspace,
       3) 3rd for loop for column i or * print */
        System.out.println("REVERSE FULL TRAIANGLE PATTERN");
        for (int i = 1; i <=n; i++) {
            // Print spaces
            for (int j = 1; j <= i; j++) {

                System.out.print(" ");
            }

            for (int j = i; j < n; j++) {

                System.out.print(i + " ");
            }
            System.out.println();

        }


    }

}
