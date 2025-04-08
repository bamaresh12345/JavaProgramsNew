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
        int n=0;
        boolean bol= false;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==0)
            {
            // n = n+1;
             bol=true;
             break;
            }
        }

        if(bol==true)
        {
            n = arr.length;
        }
        else
        {
            n = arr.length +1;

        }
       // int n = arr.length; // use ARRAY +1 , if 0 is missing in Array
        sum = (n * (n + 1)) / 2;

        for (int i = 0; i < arr.length; i++) {   // nums.length is very imp lest it will for array out of bondmis
            sum = sum - arr[i];
        }

        return sum;

    }

    public static int findMissingNumber2(int[] arr) {
        int sum1 = 0;
        int sum2 = 0;
        int finalsum=0;


        for (int i = 0; i <arr.length; i++) {

            sum1 = sum1 + arr[i];
        }

        for (int i = 0; i <=8; i++) {
            sum2 = sum2 + i;
        }

        finalsum = sum2 -sum1;

        return finalsum;

    }
    public static void main(String[] args) {


        int[] arr = {0,1,2};

        System.out.println(findMissingNumber(arr));
        System.out.println(findMissingNumber2(arr));
    }
}
