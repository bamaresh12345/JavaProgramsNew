package ServiceCompanyInterviewQuestions;

import java.util.*;

public class removeDuplicatesMaintainSameOrder {

    /*
    [2, 6, 3, 12, 17, 8, 6, 3, 22, 12, 12, 14]
    [17, 2, 3, 6, 22, 8, 12, 14]  --> HashSet<>() , no insertion order, only unique values
    [2, 3, 6, 8, 12, 14, 17, 22]  -->TreeSet<>() , no insertion order, only unique values & sorted in Assnding order
    [2, 6, 3, 12, 17, 8, 22, 14] -->LinkedHashSet<>() ,no insertion order, only unique values & sorted in insertion order by companigng jsut previous elelment
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
        //Converting set to Array
        int[] arr1 = new int[set.size()];
         for(int i : set)
         {
            arr1[i] = i;   // *** IMP***
         }
        //printing array
        System.out.println(Arrays.toString(arr1));



        //Set<Integer> tset = new TreeSet<>() --> ** IMP does not maintain any insertion oder. but will be sorted in Asending order
        Set<Integer> tset = new TreeSet<>();

        for (int i = 0; i < arr.length; i++) {

            tset.add(arr[i]);
        }

        System.out.println(tset);   //[2, 3, 6, 8, 12, 14, 17, 22]

        //Converting set to Array
        int[] arr2 = new int[tset.size()];
        for(int i : tset)
        {
            arr2[i] = i;   // *** IMP***
        }
        //printing array
        System.out.println(Arrays.toString(arr2));


        //Set<Integer> tset = new TreeSet<>() --> ** IMP maintains insertion oder. but will be sorted in Asending order
        Set<Integer> lset = new LinkedHashSet<>();

        for (int i = 0; i < arr.length; i++) {

            lset.add(arr[i]);
        }

        System.out.println(lset);  //[2, 6, 3, 12, 17, 8, 22, 14]

        //Converting set to Array
        int[] arr3 = new int[lset.size()];
        for(int i : lset)
        {
            arr3[i] = i;   // *** IMP***
        }
        //printing array
        System.out.println(Arrays.toString(arr3));

    }
}
