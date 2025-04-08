package LeetCode150Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Generic3ArrayProgram {

    public static void main(String[] args) {

        int[] arr1 = new int[2]; // index are from 0 to 5

        int[] arr2 = {5, 1, 8, 9, 8};
        int len = arr2.length;  //5

        arr2.toString();  // //[I@3b6eb2ec

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


        //How to convert an array of strings to string in Java
        String[] stringArray = {"My", "name", "is", "Gaurav", "!"};
        String string1 = Arrays.toString(stringArray);
        System.out.println("An STRING array converted to string using Arrays.toString(): " + string1); //[My, name, is, Gaurav, !]
        //How to convert an array of chars to string in Java
        char[] chars = {'H', 'E', 'L', 'L', 'L', 'O'};
        String string2 = Arrays.toString(chars);
        System.out.println("An CHAR array converted to string using Arrays.toString(): " + string2);  //[H, E, L, L, L, O]

        // 2. Using the StringBuilder.append() method

        StringBuilder strbld = new StringBuilder();

        for (int i = 0; i < stringArray.length; i++) {
            strbld.append(stringArray[i]);
        }
        System.out.println("An array converted to string using StringBuilder: " + strbld);  // MynameisGaurav!

        // 2. Using the Simple string value String strnew ="";

        String strnew ="";

        for (int i = 0; i < stringArray.length; i++) {
            strnew = stringArray[i] +" " + strnew;
        }
        System.out.println("An array converted to string using String strnew =\"\" " + strnew);  // ! Gaurav is name My

        int[] arr11 = {1, 2, 3, 4, 5};
        int[] arr22 = {5, 2, 4, 1, 4};
        Arrays.sort(arr11);
        Arrays.sort(arr22);

        Arrays.equals(arr1, arr2); // returns true or false  can use for checking values in Arrays


        //Array To ArrayList In Java  -->***  Arrays.asList(array)
        String[] array = new String[]{"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"}; // can be numbers also***

        ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));
        System.out.println(list);

        ArrayList<String> listarray = new ArrayList<String>();

        // Array To ArrayList In Java  --> by  Collections.addAll(listarray, array)
        Collections.addAll(listarray, array); //  Collections.addAll(listarray, array)
        System.out.println(listarray);

        // Array To ArrayList In Java  --> by listaar2.addAll((Arrays.asList(array));
        ArrayList<String> listarr2 = new ArrayList<String>();
        listarr2.addAll(Arrays.asList(array));
        System.out.println(listarr2);

        String[] arr44 = new String[list.size()];
        list.toArray(arr44);

        for (String str : arr44) {
            System.out.println(str);
        }


    }
}
