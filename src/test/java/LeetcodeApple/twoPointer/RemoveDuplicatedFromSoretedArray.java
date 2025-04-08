package LeetcodeApple.twoPointer;

import java.util.Arrays;

public class RemoveDuplicatedFromSoretedArray {

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(Arrays.toString(removeDuplicatedFromSoretedArray(arr)));
    }

    private static int[] removeDuplicatedFromSoretedArray(int[] arr) {

        int counter=0;
        for (int i = 0; i < arr.length; i++) {


            if( i<arr.length-1 && arr[i]==arr[i+1])
            {
                continue;
            }
            else
            {
                arr[counter++] = arr[i];
            }

        }

        return arr;
    }
}
