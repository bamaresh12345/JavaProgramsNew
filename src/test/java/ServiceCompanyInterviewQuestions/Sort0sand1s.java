package ServiceCompanyInterviewQuestions;

import java.util.Arrays;

public class Sort0sand1s {

    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        System.out.println(arr[arr.length - 1]);
        System.out.println(arr[arr.length - 2]);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, -44, 0, 1, -3, 1, 0, 3, 30, 2, 1, 0, 2, 0,};

        System.out.println(Arrays.toString(sortArray(arr)));

    }

}
