package LeetCode150Questions;

public class FindLargestEelmentInArray {

    public static int FindLargestEelmentInArrayBruteForce(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return arr[n - 1];
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 2};

        System.out.println(FindLargestEelmentInArrayBruteForce(arr));
        System.out.println(FindLargestEelmentInArrayOptimal(arr));
    }


    public static int FindLargestEelmentInArrayOptimal(int[] arr) {
        int n = arr.length;
        int largestElement = 0;
        for (int i = 0; i < n; i++) {

            if (arr[i] > largestElement) {
                largestElement = arr[i];
            }
        }
        return largestElement;
    }
}
