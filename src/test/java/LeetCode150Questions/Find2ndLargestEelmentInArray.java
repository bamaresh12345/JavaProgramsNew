package LeetCode150Questions;

public class Find2ndLargestEelmentInArray {

    public static int find2ndLargestEelmentInArray(int[] arr) {

        int n = arr.length;

        int first = -1;    // *** IMP*** for largest assing -1 and for smallest assing arr[0]
        int second = -1; // *** IMP*** for largest assing -1 and for smallest assing arr[0]

        // Finding the first largest element
        for (int i = 0; i < n; i++) {
            if (arr[i] > first)
                first = arr[i];
        }

        // Finding the second largest element
        for (int i = 0; i < n; i++) {

            // Update second largest if the current element is greater
            // than second largest and not equal to the largest
            if (arr[i] > second && arr[i] < first) {  //!= baccase it cannot be greater
                second = arr[i];
            }


        }

        return second;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 88, 2, 36, 95};

        System.out.println(find2ndLargestEelmentInArray(arr));
    }

    public static int find2ndLargestEelmentInArraySorting(int[] arr) {

        int n = arr.length;


        for (int i = 0; i < arr.length; i++) {
            //sort and return elslemnt
        }
        return 12;
    }
}
