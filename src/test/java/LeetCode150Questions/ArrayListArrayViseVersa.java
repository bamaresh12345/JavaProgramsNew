package LeetCode150Questions;

import java.util.*;

public class ArrayListArrayViseVersa {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Blore");
        list.add("Delhi");
        list.add("Mumbai");
        list.add("Calcata");

        list.remove(3);  //
        list.remove("Blore");
        list.add("Blore");
        list.add("Calcata");

        list.contains("Blore"); // return true or false  *** IMP
        list.size(); // return size of list starts from 1 ot n
        //list.clear(); // return size of list starts from 1 ot n
        list.isEmpty(); // return size of list starts from 1 ot n
        // Colelctions menthods --> starts with capital letter Coll*
        Collections.sort(list);
        Collections.reverse(list);
        Collections.shuffle(list);
        Collections.max(list);
        Collections.min(list);
        Collections.swap(list, 1, 2);


        String val2 = list.get(1);
        list.set(2, "Amar");  // repalce index of 2 (Mumbai) with Amar

        System.out.println(list.contains("Calcata")); // returns true
        System.out.println(list.contains("Test")); // returns false


        System.out.println(list);


        //Arraylist to String array
        String[] arr = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        System.out.println(Arrays.toString(arr));

        //ArrayList to Array
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(34);
        list2.add(45);
        list2.add(46);
        list2.add(85);

        System.out.println(list2);

        int[] arr2 = new int[list2.size()];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = list2.get(i); //** IMP
        }

        System.out.println(Arrays.toString(arr2));


        Set<String> set = new HashSet<>();
        set.add("Amar");
        set.add("Akbar");
        set.add("Antony");
        set.remove(2); // will not working
        System.out.println("set.size() " + set.size());
        System.out.println("set -- " + set);
        set.remove(2);  //
        set.remove("Blore");
        set.add("Blore");
        set.add("Calcata");

        for (String s : set) {

            if (s.equalsIgnoreCase("Test")) {
                System.out.println("Performa weindow operation");
                System.out.println("Performa weindow operation" + s);
            }
            //driver.switchTo().window(s)
        }

    }

}
