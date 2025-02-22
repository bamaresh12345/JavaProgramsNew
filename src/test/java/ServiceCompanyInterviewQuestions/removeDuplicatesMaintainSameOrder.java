package ServiceCompanyInterviewQuestions;

import java.util.*;

public class removeDuplicatesMaintainSameOrder {

    /*
    [2, 6, 3, 12, 17, 8, 6, 3, 22, 12, 12, 14]
    [17, 2, 3, 6, 22, 8, 12, 14]  --> HashSet<>() , no insertion order, only unique values
    [2, 3, 6, 8, 12, 14, 17, 22]  -->TreeSet<>() , no insertion order, only unique values & sorted in Assnding order
    [2, 6, 3, 12, 17, 8, 22, 14] -->LinkedHashSet<>() , no insertion order, only unique values & sorted in insertion order
    //LinkedHashSet<>() , no insertion order, only unique values & sorted in insertion order by companigng jsut previous elelment
     */
    public static void main(String[] args) {

        int arr[] = {2, 6, 3, 12, 17, 8, 6, 3, 22, 12, 12, 14};
        System.out.println(Arrays.toString(arr));

        //Set<Integer> set = new HashSet<>() --> ** IMP does not maintain any insertion oder
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            set.add(arr[i]);
        }

        System.out.println(set);  //[17, 2, 3, 6, 22, 8, 12, 14]


        //Set<Integer> tset = new TreeSet<>() --> ** IMP does not maintain any insertion oder. but will be sorted in Asending order
        Set<Integer> tset = new TreeSet<>();

        for (int i = 0; i < arr.length; i++) {

            tset.add(arr[i]);
        }

        System.out.println(tset);   //[2, 3, 6, 8, 12, 14, 17, 22]


        //Set<Integer> tset = new reeSet<>() --> ** IMP does not maintain any insertion oder. but will be sorted in Asending order
        Set<Integer> lset = new LinkedHashSet<>();

        for (int i = 0; i < arr.length; i++) {

            lset.add(arr[i]);
        }

        System.out.println(lset);  //[2, 6, 3, 12, 17, 8, 22, 14]

    }
}
