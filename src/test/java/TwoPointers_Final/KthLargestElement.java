package TwoPointers_Final;

import java.util.*;

public class KthLargestElement {

    public static int kthLargetElement(int[] arr,int k)
    {

        for (int i=0; i< arr.length; i++)
        {
            for (int j=i+1; j<arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("len " +arr.length);
        return arr[arr.length - (k)];
    }
    public static void main(String[] args) {
        int[] arr = { 3,2,1,5,6,4};
        int k = 2;

        System.out.println(kthLargetElement(arr,k));
        System.out.println(kthLarsetElementMaps(arr,k));
    }


    public static int kthLarsetElementMaps(int[] arr,int k) {

        Map<Integer,Integer>map = new TreeMap<>();

        for (int i=0; i< arr.length; i++)
        {

                map.put(arr[i] , map.getOrDefault(arr[i],0) +1);

        }
        System.out.println(map);
        System.out.println(map.size());


       for(Map.Entry<Integer, Integer> entry : map.entrySet())
       {

           return (map.size()+1)-k;
       }

       return -1;
    }
}
