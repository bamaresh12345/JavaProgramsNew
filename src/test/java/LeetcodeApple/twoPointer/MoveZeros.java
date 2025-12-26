package LeetcodeApple.twoPointer;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {
        int[] arr = {10,2,0,8,12,0,9,5};

        System.out.println(Arrays.toString(moveZeros(arr)));
    }

    private static int[] moveZeros(int[] arr) {

        int left=0;

        for (int right = 0; right < arr.length; right++) {

            if(arr[right]!=0)
            {
                arr[left++] = arr[right];
            }
        }


        for (int i = left; i < arr.length; i++) {
            arr[left++] =0;
        }


        return arr;
    }


}
