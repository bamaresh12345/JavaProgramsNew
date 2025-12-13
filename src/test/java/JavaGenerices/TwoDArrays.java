package JavaGenerices;

import java.util.Arrays;

public class TwoDArrays {
/*
In 2D nubmer always starts with row and ends with column
colum need not defiend and it can be variable,2 4,1, etc. use size() method to get the column size()
we can run 3 for loops to iterate the 2D array  **** IMP
array name always gives the row length eg r.length  ** IMP
array name of arr[r].length always gives the column length eg r.length  ** IMP arr1[row].length

 */
    public static void main(String[] args) {


        int[][] arr1 ={
                {2,3,4},
                {6,1},
                {8,2,1,8}
        };

        int[][] arr2 = new int[3][2];  //int[r][c]
        //frist for loop
        for (int row = 0; row < arr1.length; row++) {   // arr1.length ***
            for (int col = 0; col < arr1[row].length; col++) {  // arr1[row].length **IMP
                System.out.print(arr1[row][col]+ " ");  // ***  arr1[row][col]+ " "
                //arr1[row][col]== target; return row and col   //
            }
            System.out.println();  // next line ** IMP
        }
         /* ABOVE OUTPUT
                 2 3 4
                 6 1
                 8 2 1 8
          */
        System.out.println();

        //second for loop with  Arrays.toString(arr1[row]
        for (int row = 0; row < arr1.length; row++) {   // arr1.length ***
            System.out.println(Arrays.toString(arr1[row]));  // next line ** IMP
        }

        /*  ABOVE OUTPUT  with differnt for loop
                 [2, 3, 4]
                 [6, 1]
                 [8, 2, 1, 8]
          */

        System.out.println();
        //third for loop with  Arrays.toString(arr1[row]
        for (int[] a : arr1) {   // arr1.length ***
            System.out.println(Arrays.toString(a));  // Arrays.toString(a) ** IMP
            //System.out.println(arr1[a]);  // wil not work ** IMP
        }

         /* ABOVE OUTPUT  with differnt for loop
                 [2, 3, 4]
                 [6, 1]
                 [8, 2, 1, 8]
          */



        // Search in 2D array




    }
    //Search value in 2D Array
    static int[] search(int arr1[][], int target)
    {
        //frist for loop
        for (int row = 0; row < arr1.length; row++) {   // arr1.length ***
            for (int col = 0; col < arr1[row].length; col++) {  // arr1[row].length **IMP
                System.out.print(arr1[row][col]+ " ");  // ***  arr1[row][col]+ " "
                if(arr1[row][col]== target) {
                    return new int[]{row, col};
                }
            }

        }
        return new int[]{-1, -1};   // *** IMP
    }


    //Find max or min value in 2D Array
    static int findMaxorMinValue(int arr1[][], int target)
    {
        int max=Integer.MAX_VALUE;  // *** IMP
        for (int row = 0; row < arr1.length; row++) {   // arr1.length ***
            for (int col = 0; col < arr1[row].length; col++) {  // arr1[row].length **IMP
                System.out.print(arr1[row][col]+ " ");  // ***  arr1[row][col]+ " "
                if(arr1[row][col]> max) {   // min value jsut use min
                    max = arr1[row][col];

                }
            }

        }
        return max; // *** IMP

    }

    //Find max or min value in 2D Array
    static int findMaxorMinValueEnhandedForLoop(int arr1[][], int target)
    {
        int min=Integer.MAX_VALUE;
        for (int[] ints : arr1) {   // row wise
            for (int element : ints) {  // each elemlent in row

                if(element < min) {   // check with is min vlaue
                    min = element;

                }
            }

        }
        return min; // *** IMP

    }
}
