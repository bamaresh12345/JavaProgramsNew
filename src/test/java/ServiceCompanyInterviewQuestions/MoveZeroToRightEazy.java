package ServiceCompanyInterviewQuestions;

import java.util.Arrays;

public class MoveZeroToRightEazy {

    public static int[] moveZeros(int[] arr)
    {

        int counter=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]!=0)
            {
                arr[counter++] = arr[i];
            }

        }

        for(int i=counter; i<arr.length; i++)
        {
            arr[counter++] = 0;
        }

        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Hello World");

        int[] arr = {-4, 1, 0, 0, 2, 21, 4};

        System.out.println(Arrays.toString(moveZeros(arr)));


    }
}
