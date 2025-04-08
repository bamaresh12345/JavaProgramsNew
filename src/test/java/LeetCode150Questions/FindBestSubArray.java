package LeetCode150Questions;

public class FindBestSubArray {

    public static int findBestSubArray(int[] arr, int k)
    {
        int sum=0;
        int maxSum=0;

        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }

        maxSum = sum;
        System.out.println(maxSum);

        for (int i = k; i < arr.length; i++) {

            sum = sum + arr[i] - arr[i-k];

            Math.max(maxSum,sum);

        }

      return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {3,-1,4,12,-8,5,6};
        int k=4;
        System.out.println(findBestSubArray(arr,k));
    }
}
