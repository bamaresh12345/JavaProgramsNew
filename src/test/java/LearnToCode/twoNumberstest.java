package LearnToCode;

public class twoNumberstest {

    public static void printSumOfPairs(int[] arr,int sum)
    {
        int i=0;
        int j= arr.length-1;

        while(i<j)
        {
            int actualsum=0;
            actualsum = arr[i] + arr[j];
            if(actualsum == sum)
            {
                System.out.println(arr[i] +" + " + arr[j] +" = " + sum);
                i++;
                j--;
            }

            else if(actualsum < sum)
            {
                i++;
            }
            else
            {
                j--;
            }


        }



    }

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        int[] arr = {1, 2,4, 6, 5, 8, 9, 20};
        int sum=10;
        printSumOfPairs(arr,sum);
    }
}
