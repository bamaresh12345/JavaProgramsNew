package ServiceCompanyInterviewQuestions;

public class FindMissingNumber {
    /*
    Step 1 : First we find out sum of ‘n’ numbers by using formula n*(n+1)/2.
             use ARRAY +1 , if 0 is missing in Array

    Step 2 : Then we will find sum of all elements of array ‘a’.

    Step 3 : Missing_Number = (Sum of 1 to ‘n’ numbers) – (Sum of elements of array ‘a’)
     */
    public static int findMissingNumber(int[] arr) {
        int sum = 0;
        int n = arr.length + 1; // use ARRAY +1 , if 0 is missing in Array
        sum = (n * (n + 1)) / 2;

        for (int i = 0; i < arr.length; i++) {   // nums.length is very imp lest it will for array out of bondmis
            sum = sum - arr[i];
        }

        return sum;

    }

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        int[] arr = {1, 3, 4, 5, 6, 7, 8};

        System.out.println(findMissingNumber(arr));
    }
}
