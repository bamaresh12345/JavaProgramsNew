package JavaGenerices;

import java.util.Arrays;
/*
1.  start looping from i=0;
2. move i forward only when i is at the correct index
3. 3 steps check , swap,  move

elelment = index (from 0 to N)
elelment = index-1 (from 1 to N)
elelment = index-2 (from 2 to N)

 */
public class cyclicSort {

    public static void main(String[] args) {
        int[] arr= {7,8,6,3,2,1,5, 4 };
        //int[] arr= {0,1,5,3,4,2 };

        sort(arr);
        System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(sort3(arr)));

    }

    public static void sort(int[] arr)
    {   int i=0;

        while(i < arr.length)
        {
            int correct =arr[i]-1; // irrespective waht arr[i]  has , it will check for arry value = arry of index -1


            if(arr[i]!=arr[correct]) // if arr[i] not equal with arr[correct] , may be neibhoubr or fra elment
            {

                  swap(arr,i,correct);
            }
            else
            {
                i++;
            }
        }



    }
/*
elelment = index (from 0 to N)
elelment = index-1 (from 1 to N)
elelment = index-2 (from 2 to N)
 */
    public static int[] sort2(int[] arr)
    {
        int n= arr.length;
        int Arrayindex=0;
        while(Arrayindex < n)
        {
            int element = arr[Arrayindex];
            int actulPostion = element-1;
           // System.out.println("element " + element);
            //System.out.println("actulPostion " + actulPostion);
            if(arr[Arrayindex]< n &&  arr[Arrayindex] != arr[actulPostion])

            {
                //  System.out.println("before swap " + Arrays.toString(arr));
                swap(arr,Arrayindex,actulPostion);
                //swap(arr,Arrayindex,element);
                //System.out.println("After swap " + Arrays.toString(arr));
            }
            else
            {
                Arrayindex++;
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int first, int last) {
        int temp =arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    public static int[] sort3(int[] arr)
    {
        int n = arr.length-1;
        int i=0;
        while(i< n)
        {
            int currentElemlent = arr[i];

            if(arr[i]!=arr[currentElemlent])
            {
                swap1(arr, i,currentElemlent);
            }
            else
            {
                i++;
            }

        }

        return arr;
    }

    private static void swap1(int[] arr, int first, int last) {

        int temp = arr[first];
        arr[first] = arr[last];
        arr[last]=temp;
    }
}
