package JavaGenerices;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLengthIndex {

    public static void main(String[] args) {


        // *** ARRAY index always starts with 0 and ends with i < arr.length not i<= arr.length
        //for (int i = 0; i < arr1.length; i++)  // ** IMP --> i = 0; i < arr1.length , NOT LESS THAN EQUAL TOO VERY IMP******

        int[] arrt2 = new int[10]; //  int arrt1[] = new int[10]; this also works fine

        int arr[] = {6, 2, 7, 8, 3, 9, 4, 5};

        // Create an array of 5 integers
        int[] arr11 = new int[5];

        // Fill the entire array with the value 2

        // arr.length ---> length start with 1  but prints 1 to n *** BE CAAREFUL
        // arr.length-1 ---> use arr.length-1  in for loops or while loops eg: below *** BE CAAREFUL
        for(int i= arr.length-1; i >=0; i--)  // WHY arr.length-1  , if array has 3 elements it gives arr.length=3  else it will give
            //Array INDEX OUT Bond
            // for(int i=0; i < arr.length; i++)  // FOR this, it starts from 0 and ends before   i < arr.length it passed
            // if you give  i <= arr.length  it shows Array INDEX OUT Bond  --> BE CAREFUL
        //*****CARFUL below
        System.out.println("Array Length : " + arr.length);  // length start with 1  but prints 1 to n *** BE CAAREFUL
        System.out.println("Array index : " + arr[0]);  // index starts with 0
       // System.out.println("Array index : " + arr[-1]);  // index out of bound
       // System.out.println("Array index : " + arr[10]);  // index out of bound

        // create different integers arrays
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {1, 2, 4, 3};

        Arrays.sort(arr);
        Arrays.equals(arr1, arr2); //true
        Arrays.equals(arr1, arr3); //false
        Arrays.toString(arr);
        Arrays.fill(arr11, 2);
        //Arrays.min(arr); // NO not there   Collections.min(list)  have it
        //Arrays.max(arr); // NO not there


        //print array in reverse order
        for (int i = arr1.length-1; i >=0; i--) {  //  i = 4-1 ; i>=0; i--***
            System.out.println(" Just for loop number : " + arr[i]);  // print in reverse order
        }

        //s.trim() --> it trims spaces in both left and right very imp, in removing spaces

        //************************Delete 1st elelment of array *************** IMP
        //Delete 1st elelment of array at index 0 means i=1,
        // delete elemlent at index1 means i=2 *************** IMP continues and last ELMELNT will be repeated***
        // delete elemlent at index2 means i=3 *************** IMP  last ELMELNT will be repeated***[2, 3, 4, 4]
        // delete elemlent at index3 means i=4 *************** IMP  continues and last ELMELNT will be repeated***
        for (int i = 1; i < arr1.length; i++) {   //  i = 1;
            arr1[i-1] = arr1[i];   // *** arr1[i-1] = arr1[i]
        }
        System.out.println(Arrays.toString(arr1));  //[2, 3, 4, 4]  DELETE ARRAY
        //************************Delete element val OR 1st elelment of array OR MOVE ZEROS *************** IMP
        /*  int count=0;  //Remove Element***
           if(nums[i]!=val)
          nums[count]=nums[i];
                count++;    else continue;  return count;
         */


        /*  //Remove dupliate Elements***
        if (right < nums.length - 1 && nums[right] == nums[right + 1]) {
                continue;
            } else {
                nums[left++] = nums[right];
            }
         */


        System.out.println(Arrays.toString(arr)); // to pint the array


        System.out.println("Array fill " + Arrays.toString(arr11));

        //
        // ========================================
        int[] arr12 = {1, 6, 4, 2, 9, 3};

        int[] arr22 = new int[arr1.length];

        for (int i = 0; i < arr12.length; i++) {  // *** ARRAY index always starts with 0 and ends with i < arr.length not i<= arr.length
            arr22[i] = arr12[i];
        }

        System.out.println(Arrays.toString(arr22));


        ArrayList<String> list = new ArrayList<>();
        list.add("Ram");
        list.add("Sham");
        list.add("Bhem");


        String[] arr4 = new String[list.size()];
        //Converting list to Array
        for (int i = 0; i < list.size(); i++) {
            arr4[i] = list.get(i);
            System.out.println(arr4[i].contains("Ram")); // ture
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(" arr.length " + arr.length);
        System.out.println("list.size()  " + list.size());


        int[] arr32 = {3, 8, 2, 5, 6};

        ArrayList<Integer> list2 = new ArrayList<>();

        //Converting Array ot list
        for (int i : arr2) {
            list2.add(i);
        }

        System.out.println(list2);
    }



}
