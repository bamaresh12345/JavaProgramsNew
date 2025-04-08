package ServiceCompanyInterviewQuestions;

import java.util.Arrays;

public class MoveZeroToLeftTricy {

    public static int[] moveZerosFront(int[] arr)
    {

        int counter=arr.length-1;    // ** IMP counter = arr.length-1
        for(int i=arr.length-1; i>=0;i--)
        {

            if(arr[i]!=0)
            {
                arr[counter--] =arr[i];  // ** IMP counter--
            }

        }


        for(int i=counter; counter >=0; i--)  // *** IMP
        {
            arr[counter--] = 0;    // ** IMP counter--
        }

        return arr;

    }
    public static void main(String[] args) {

        int[] arr= {-4, 1, 0, 0, 2, 21, 4};  //[0, 0, -4, 1, 2, 21, 4]

        System.out.println(Arrays.toString(moveZerosFront(arr)));


    }
}
