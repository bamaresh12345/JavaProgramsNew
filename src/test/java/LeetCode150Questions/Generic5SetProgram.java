package LeetCode150Questions;

import java.util.*;

public class Generic5SetProgram {


    /*  IMP Set methods
      set1.add("Ram");     set.add(i)
      set.remove("Sam")
      set.contains("sdf")  --. ** IMP
      set.size()
      set.clear()

      // converting set to array
      String[] arr = new String[set1.size()];     or
      for(String s :set1)
      {   arr1[i] = s;
      }

      // converting array to set
      int[] arr2 = {3, 8, 2, 5, 6};
        Set<Integer> set3 = new HashSet<>();
        //Converting Array ot list
        for (int k : arr2) {
            set3.add(k);
        }
     */
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Ram");
        set1.add("Sham");
        set1.add("Bhem");


        set1.remove("Bhem");
        //set1.clear();
        set1.size();


        //Converting list to Array
        String[] arr = new String[set1.size()];

        int i = 0;
        for (String s : set1) { // **** IMP Memerizie  same with int  for (int s : set1)
            arr[i] = s;     // **** IMP Memerizie  assigning value is s or i *** not set.get(i)  etc..
            i++;
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(" arr.length " + arr.length); // gives length of array from 1 to 5
        System.out.println("list.size()  " + set1.size()); // gives length of set from 1 to 5


        int[] arr2 = {3, 8, 2, 5, 6};

        Set<Integer> set3 = new HashSet<>();

        //Converting Array ot list
        for (int k : arr2) {
            set3.add(k);
        }

        System.out.println(set3);


        Set<String> set23 = new HashSet<>();
        set23.add("Blore");
        set23.add("Delhi");
        set23.add("Mumbai");
        set23.add("Calcata");

        set23.remove(3);  //
        set23.remove("Blore");
        set23.add("Blore");
        set23.add("Calcata");

        set23.contains("Blore"); // return true or false  *** IMP
        set23.size(); // return size of list starts from 1 ot n
        //list.clear(); // return size of list starts from 1 ot n
        set23.isEmpty(); // return size of list starts from 1 ot n
        // Colelctions menthods --> starts with capital letter Coll*

        Collections.max(set23);
        Collections.min(set23);
        // intersectionSet.retainAll(set); --> Check

        Set<String> set11 = new TreeSet<>();  //--> retains the insertion order, helps to remove dupplicats from String
        String s = "I am am amar amar";  // Set<String> set = new TreeSet<>()  retains order
        Set<String> set12 = new LinkedHashSet<>(); //--> retains the insertion order, helps to remove dupplicats from String

        //  String val2 = set23.get(1);  cant replace values
        //  set23.set(2, "Amar");  // cant repalce index of 2 (Mumbai) with Amar

        set23.contains("Calcata"); // returns true
        set23.contains("Test"); // returns false


        System.out.println(set23);


        //Arraylist to String array
        String[] arr3 = new String[set23.size()];

        for (String s2 : set23) {
            arr3[i] = s2;
        }

        System.out.println(Arrays.toString(arr));

        //ArrayList to Array
        Set<Integer> set32 = new HashSet<>();
        set32.add(34);
        set32.add(45);
        set32.add(46);
        set32.add(85);

        System.out.println(set32);
        //Converting Set ot Array
        int[] arr4 = new int[set32.size()];

        i = 0;
        for (int m : set32) {
            arr4[i] = m; //** IMP
        }

        System.out.println(Arrays.toString(arr2));

        //=========================================================================================
        //Can Add two or more differnt lists
        Set<List<String>> listOfLists = new HashSet<>();

        List<String> names2 = new ArrayList<>(); // name2 list is added
        names2.add("test1");
        names2.add("test2");
        names2.add("test3");

        listOfLists.add(names2);     // name2 list is added

        List<String> names3 = new ArrayList<>();  // name3 list is added
        names3.add("ram1");
        names3.add("ram2");
        names3.add("ram3");


        listOfLists.add(names3);   // name3 list is added


        System.out.println("listOfLists--> " + listOfLists);
//=========================================================================================

        Set<String> set = new HashSet<>();
        set.add("Amar");
        set.add("Akbar");
        set.add("Antony");
        set.remove(2); // will not working
        System.out.println("set.size() " + set.size());
        System.out.println("set -- " + set);
        set.remove(2);  //
        set.remove("Blore");
        //set.clear();
        set.add("Blore");
        set.add("Calcata");

        for (String s1 : set) {

            if (s1.equalsIgnoreCase("Test")) {
                System.out.println("Performa weindow operation");
                System.out.println("Performa weindow operation" + s);
            }
            //driver.switchTo().window(s)
        }

        /*

            1. HashSet
                Underlying Data Structure: Hash table
                Order: Unordered
                Duplicates: Not allowed
                Null Values: Allows one null value

        . LinkedHashSet
           Order: Insertion order is preserved
            Duplicates: Not allowed
            Null Values: Allows one null value
            Performance:

          2. TreeSet
            Order: Sorted in natural order (or custom order via Comparator)
            Duplicates: Not allowed
            Null Values: Not allowed

         */

        //====================================================
        // Outer Set
        Set<Set<Integer>> outerSet = new HashSet<>();

        // Inner Set 1
        Set<Integer> innerSet1 = new HashSet<>();
        innerSet1.add(1);
        innerSet1.add(2);
        innerSet1.add(3);

        // Inner Set 2
        Set<Integer> innerSet2 = new HashSet<>();
        innerSet2.add(4);
        innerSet2.add(5);
        innerSet2.add(6);

        // Adding inner sets to outer set
        outerSet.add(innerSet1);
        outerSet.add(innerSet2);

        // Printing the structure
        System.out.println("Set within a Set: " + outerSet);
    }

}
