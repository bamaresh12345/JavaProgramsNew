package JavaGenerices;

import java.util.Arrays;

/*

maxItem , MaxReverse
MinItem , MinRange
Reverse  ,ReverseRange
swap , swap all

 */
public class SearchBMaxItemMaxReverseRangeReverseRange {
  // Find Max Nubmer in array  or  Find Min Nubmer in array
    private static int maxNumber(int[] arr) {
        int max=0;   // *** IMP assuming array is notempty else use -1 or INTEGER.MAXVALUE
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    // Find Max Nubmer in array in a range   or Find Min Nubmer in array in a range
    private static int maxRange(int[] arr, int start, int end) {
        int max=arr[start];  // *** IMP assuming array is notempty else use -1 or INTEGER.MAXVALUE

        if(start > end)  // ** Edge cse
            return -1;

        if(arr.length == 0 || arr == null) // ** Edge cse
            return -1;

        for (int i = start; i <= end; i++) {

            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    // reverse of an Array without start and end parameters
    public static int[] reverse(int[] arr )
    {
        int start=0;
        int end = arr.length-1;

        while(start < end)
        { // call swap
            int temp=0;
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        return arr;
    }

    // reverse of an Array with range
    public static int[] reverseRange(int[] arr,int start1, int end1 )
    {
        int start=start1;
        int end = end1;

        while(start < end)
        { // call swap
            int temp=0;
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        return arr;
    }
    public static void main(String[] args) {

        int[] arr= {34,6,12,78,6,3,10};  //78
        System.out.println(maxNumber(arr));
        System.out.println(maxRange(arr,2,6));
        System.out.println(Arrays.toString(reverse(arr)));
    }


}
