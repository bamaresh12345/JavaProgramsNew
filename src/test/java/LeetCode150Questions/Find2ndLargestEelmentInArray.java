package LeetCode150Questions;

import java.util.Arrays;

public class Find2ndLargestEelmentInArray {

    public static int find2ndLargestEelmentInArray(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        return arr[arr.length-2];
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 88, 2, 36, 95};

        System.out.println(find2ndLargestEelmentInArray(arr));
        System.out.println(find2ndLargestEelmentInArraySorting(arr));
    }

    public static int find2ndLargestEelmentInArraySorting(int[] arr) {

        int n = arr.length;


        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            //sort and return elslemnt
        }
        return arr[arr.length-2];
    }
}
