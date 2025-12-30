package JavaGenerices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Generic3ArrayProgram {

    public static void main(String[] args) {

        int[] arr1 = new int[2]; // index are from 0 to 5

        int[] arr2 = {5, 1, 8, 9, 8};
        int len = arr2.length;  //5

        arr2.toString();  // //[I@3b6eb2ec  DONT USE**
        Arrays.toString(arr2); // [5, 1, 8, 9, 8]  , use this

        // arr2.equals(new int[]{5, 1, 8, 9, 8});   //true
        arr2.equals(arr1);   //false
        Arrays.equals(arr1, arr2);// false


        // System.out.println(arr2.toString());

        int[] arr3 = new int[]{5, 1, 8, 9, 8};
        String[] names = {"ram", "sham", "bhem"};

        int[] arr4 = new int[5];
        System.out.println(arr2.equals(arr3));

        Arrays.sort(arr1); // 1,5,8,8,9
        Arrays.toString(names);     // print names  [bhem, ram, sham]
        Arrays.fill(arr4, 5);  //  [5, 5, 5, 5, 5]

        boolean[] b = new boolean[5];
        Arrays.fill(b, false); // [false,false,false,false,false]

        String[] names1 = new String[5];
        Arrays.fill(names1, "test");  //// [test,test,test,test,test]


        System.out.println(Arrays.toString(arr4));

        int[] arr = {0, 1, 0, 3, 12};
        // System.out.println(Arrays.toString(moveZerostoRigth(nums)));
        //   System.out.println(Arrays.toString(moveZerostoLeft(nums)));

        int  minuslen =  arr.length-1;
        System.out.println("nums.length" + arr.length);
        System.out.println("nums.length-1" +" " + minuslen);
        for (int i=0; i<arr.length; i++)
        {
            System.out.println("nums--> " + arr[i]);
        }

        for (int i=0; i<arr.length; i++) // Works fine ***IMP but for(int i=0h; i<=arr.lengt0; i++) give Array Index 5 out of bounds
        {
            System.out.println("nums--> " + arr[i]);
        }
        /*
        for(int i=0; i<=arr.length; i++)  -->> EXCEPTION  WHY   becsaue of i<=arr.length ,index is pointing at 5th element, which is not thier
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	    at TwoPointers.moveZeros.main(moveZeros.java:38)
         */

        for (int i=arr.length-1; i>=0; i--)// Works fine ***IMP but for(int i=arr.length; i>=0; i--) give Array Index 5 out of bounds
        {
            System.out.println("Reverse loop nums--> " + arr[i]);
        }

        /*
         for(int i=arr.length; i>=0; i--)  -->> EXCEPTION  WHY   becsaue of i=arr.length,index is pointing at 5th element, which is not thier
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	at TwoPointers.moveZeros.main(moveZeros.java:52)
         */

        //s.trim() --> it trims spaces in both left and right very imp, in removing spaces
        //System.exit(0); --> exist from the method 0 is IMP

        //How to convert an strArr of strings to string in Java
        String[] stringArray = {"My", "name", "is", "Gaurav", "!"};
        String string1 = Arrays.toString(stringArray);
        System.out.println("An STRING strArr converted to string using Arrays.toString(): " + string1); //[My, name, is, Gaurav, !]
        //How to convert an strArr of chars to string in Java
        char[] chars = {'H', 'E', 'L', 'L', 'L', 'O'};
        String string2 = Arrays.toString(chars);
        System.out.println("An CHAR strArr converted to string using Arrays.toString(): " + string2);  //[H, E, L, L, L, O]

        // 2. Using the StringBuilder.append() method

        StringBuilder strbld = new StringBuilder();

        for (int i = 0; i < stringArray.length; i++) {
            strbld.append(stringArray[i] + " ");
        }
        System.out.println("An strArr converted to string using StringBuilder: " + strbld);  // MynameisGaurav!

        int[] arr11 = {1, 2, 3, 4, 5};
        int[] arr22 = {5, 2, 4, 1, 4};
        Arrays.sort(arr11);
        Arrays.sort(arr22);

        Arrays.equals(arr1, arr2); // returns true or false  can use for checking values in Arrays

        /*
        🧠 Golden Rule
        If an if block ends with return, break, or continue → else is optional.
         */
        //Array To ArrayList In Java  -->***  Arrays.asList(strArr)
        String[] strArr = new String[]{"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"}; // can be numbers also***

        List<String> list = new ArrayList<String>(Arrays.asList(strArr));
        System.out.println(list);

       List<String> listarray = new ArrayList<String>();

        // Array To ArrayList In Java  --> by  Collections.addAll(listarray, strArr)
        Collections.addAll(listarray, strArr); //  Collections.addAll(listarray, strArr)
        System.out.println(listarray);

        // Array To ArrayList In Java  --> by listaar2.addAll((Arrays.asList(strArr));
        ArrayList<String> listarr2 = new ArrayList<String>();
        listarr2.addAll(Arrays.asList(strArr));
        System.out.println(listarr2);

        String[] arr44 = new String[list.size()];
        list.toArray(arr44);

        for (String str : arr44) {
            System.out.println(str);
        }


    }
}
