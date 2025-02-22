package ServiceCompanyInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListIteration {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(20);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("**************");

        for (Object obj : list) {
            System.out.println(obj);
        }

        System.out.println("**************");

        for (int i : list) {
            System.out.println(i);
        }

        System.out.println("**************");
        list.add(1, 32);

        for (int i : list) {
            System.out.println(i);
        }

        // converting Arralist to Array
        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        System.out.println(Arrays.toString(arr));


    }
}
