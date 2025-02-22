package LeetCode150Questions;

public class Find2ndSmallestEelmentInArray {
    public static int find2ndSmallestEelmentInArray(int[] arr) {
        int first = arr[0]; // *** IMP*** for largest assing -1 and for smallest assing arr[0]
        int second = arr[0]; // *** IMP*** for largest assing -1 and for smallest assing arr[0]


        // Finding the first smallest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < first) {            //*** IMP Less Than
                first = arr[i];
            }

        }

        System.out.println(first);

        // Finding the second smallest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < second && arr[i] > first) {      //*** IMP Less Than and NOT Equals   if (arr[i] < second && arr[i] != first) {
                second = arr[i];
            }

        }

        return second;
    }


    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");

        int[] arr = {5, 6, 88, 2, 36, 95};

        System.out.println(find2ndSmallestEelmentInArray(arr));
    }

}
