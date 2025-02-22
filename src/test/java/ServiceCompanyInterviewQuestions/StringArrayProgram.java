package ServiceCompanyInterviewQuestions;

import java.util.Arrays;

public class StringArrayProgram {

    public static void main(String[] args) {

        String[] arr = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday"};

        String[] arr2 = new String[arr.length]; // frsit create another array lets see later


       /* for (int i = 0; i < arr.length; i++) {  // same array works fine

            String s = arr[i].substring(0, 3);
            arr[i] = s;

        }
        System.out.println(Arrays.toString(arr));*/


        for (int i = 0; i < arr.length; i++) {

            String s = arr[i].substring(0, 3);
            arr2[i] = s;

        }

        System.out.println(Arrays.toString(arr2));  // prints [Sun, Mon, Tue, Wed, Thr, Fri, Sat]


        String[] arr3 = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {

            String s = arr[i].substring(arr[i].length() - 3, arr[i].length());
            arr3[i] = s;

        }

        System.out.println(Arrays.toString(arr3));  //[day, day, day, day, day, day, day]
    }

}
