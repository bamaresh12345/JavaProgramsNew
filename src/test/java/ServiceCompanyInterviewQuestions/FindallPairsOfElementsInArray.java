package ServiceCompanyInterviewQuestions;

public class FindallPairsOfElementsInArray {

    public static void findallPairsOfElementsInArray(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }


    }

    public static void main(String[] args) {


        int[] arr = {-10, 4, 6, 5, 5, 8, 20};
        int target = 10;

        findallPairsOfElementsInArray(arr, target);
        System.out.println("*******************************");
        int[] arr1 = {4, 6, 5, -10, 8, 5, 20};
        int target1 = 10;
        findallPairsOfElementsInArraySorting(arr, target);
    }

    public static void findallPairsOfElementsInArraySorting(int[] arr1, int target1) {
        int sum = 0;
        int start = 0;
        int end = arr1.length - 1;

        while (start < end) {
            sum = arr1[start] + arr1[end];

            if (sum == target1) {
                System.out.println(arr1[start] + " " + arr1[end]);
                start++;
                end--;
            } else if (sum < target1) {
                start++;
            } else {
                end--;
            }

        }

    }


}

