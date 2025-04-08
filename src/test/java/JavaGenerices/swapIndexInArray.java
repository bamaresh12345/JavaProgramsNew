package JavaGenerices;

import java.util.Arrays;

public class swapIndexInArray {

    public static void  swap(int[] arr, int index1,int index2)
    {
        int temp=0;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
    public static void main(String[] args) {

        int[] arr= {2,6,1,9,4,8,90};

        swap(arr, 1,3);
        System.out.println(Arrays.toString(arr));  //[2, 9, 1, 6, 4, 8, 90]

        swap(arr, 2,6);
        System.out.println(Arrays.toString(arr)); //[2, 9, 90, 6, 4, 8, 1]
    }
}
