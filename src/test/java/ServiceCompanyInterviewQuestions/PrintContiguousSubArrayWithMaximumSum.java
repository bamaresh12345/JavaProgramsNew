package ServiceCompanyInterviewQuestions;

public class PrintContiguousSubArrayWithMaximumSum {

    public static void maxSumsSubArray(int[] arr)
    {
        int sum=0;
        int maxSum=0;
        int currentStart=0;
        int bestStart=0;
        int bestEnd=0;
        for (int i = 0; i < arr.length; i++) {

            //Adding current element to Sum
            sum = sum + arr[i];

            //If currentSum becomes negative, clearing currentSum and
            //setting currentStart to next element
            if(sum <0)
            {
                sum=0;
                currentStart=i+1;
            }

            // If Sum exceeds maxSum, assigning Sum to maxSum and
            //updating bestStart and bestEnd
            if(sum > maxSum)
            {
                maxSum = sum;
                bestStart=currentStart;
                bestEnd=i;


            }
        }

        //Printing sub array with maxSum
            for (int j = bestStart; j <= bestEnd; j++) {
                System.out.print(arr[bestStart++] + " ");
            }




        System.out.println("MaxSum : " + maxSum);
    }

    public static void main(String[] args) {
       int[] arr = {2, -3, 7, -4, 2, 5, -8, 6, -1};

       maxSumsSubArray(arr);
    }

}
