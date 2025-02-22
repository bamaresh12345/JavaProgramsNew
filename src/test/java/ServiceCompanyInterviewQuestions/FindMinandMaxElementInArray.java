package ServiceCompanyInterviewQuestions;

public class FindMinandMaxElementInArray {

    public static void main(String[] args) {

        int[] arr = {10, 5, 350, 100, 45, 95, 560, 101};
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max)
                max = arr[i];

            if (arr[i] < min)
                min = arr[i];

        }

        System.out.println("Max nubmer form array : " + max);
        System.out.println("Min nubmer form array : " + min);
    }
}
