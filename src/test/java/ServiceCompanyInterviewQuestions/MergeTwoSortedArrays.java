package ServiceCompanyInterviewQuestions;

import java.util.Arrays;

public class MergeTwoSortedArrays {


    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {

        int i = 0, j = 0, k = 0;

        int[] arr3 = new int[arr1.length + arr2.length];

        while (i < arr1.length && j < arr2.length) {
            System.out.println(arr1[i] + " " + arr2[j]);
            if (arr1[i] > arr2[j]) {
                arr3[k] = arr1[i];
                k++;
                i++;

            } else {
                arr3[k] = arr2[j];
                k++;
                j++;

            }
        }

        System.out.println(Arrays.toString(arr3));
        while (i < arr1.length) {
            arr3[k] = arr1[i];
            i++;

            k++;
        }
        System.out.println(Arrays.toString(arr3));
        while (j < arr2.length) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(arr3));
        return arr3;


    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        int[] arr1 = {-7, 12, 17, 29, 41, 56, 79};

        int[] arr2 = {-9, -3, 0, 5, 19};

        System.out.println(Arrays.toString(mergeSortedArrays(arr1, arr2)));
    }

}
