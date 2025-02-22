package LeetCode150Questions;

import java.util.*;

public class Generic4ListProgram {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ram");
        list.add("Sham");
        list.add("Bhem");


        //Converting list to Array
        String[] arr = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(" arr.length " + arr.length);
        System.out.println("list.size()  " + list.size());


        int[] arr2 = {3, 8, 2, 5, 6};

        ArrayList<Integer> list2 = new ArrayList<>();

        //Converting Array ot list
        for (int i : arr2) {
            list2.add(i);
        }

        System.out.println(list2);


        List<String> list23 = new ArrayList<>();
        list23.add("Blore");
        list23.add("Delhi");
        list23.add("Mumbai");
        list23.add("Calcata");

        list23.remove(3);  //
        list23.remove("Blore");
        list23.add("Blore");
        list23.add("Calcata");

        list23.contains("Blore"); // return true or false  *** IMP
        list23.size(); // return size of list starts from 1 ot n
        //list.clear(); // return size of list starts from 1 ot n
        list23.isEmpty(); // return size of list starts from 1 ot n
        // Colelctions menthods --> starts with capital letter Coll*
        Collections.sort(list23);
        Collections.reverse(list23);
        Collections.shuffle(list23);
        Collections.max(list23);
        Collections.min(list23);
        Collections.swap(list23, 1, 2);
        // Collections.copy(list1,list2);
        // Collections.frequency("test");

        //Sorting the list by ignoring the case
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);

        Collections.unmodifiableList(list23);  //Creating read only view of the originalList

        //Sorting the list in the reverse order
        Collections.sort(list, Collections.reverseOrder());

        // remove duplicates from list-->  use set and list


        String val2 = list23.get(2);
        list23.set(2, "Amar");  // repalce index of 2 (Mumbai) with Amar

        System.out.println(list23.contains("Calcata")); // returns true
        System.out.println(list23.contains("Test")); // returns false


        System.out.println(list23);

        for (int i = 0; i < list23.size(); i++) {
            System.out.println(i + ") " + list23.get(i));

        }


        //Arraylist to String array
        String[] arr3 = new String[list23.size()];

        for (int i = 0; i < list23.size(); i++) {
            arr3[i] = list23.get(i);
        }

        System.out.println(Arrays.toString(arr));

        //ArrayList to Array
        List<Integer> list32 = new ArrayList<>();
        list32.add(34);
        list32.add(45);
        list32.add(46);
        list32.add(85);

        System.out.println(list32);

        int[] arr4 = new int[list32.size()];

        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = list32.get(i); //** IMP
        }

        System.out.println(Arrays.toString(arr2));

        //=========================================================================================
        //Can Add two or more differnt lists
        List<List<String>> listOfLists = new ArrayList<>();

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


       /* Using equals() (Element-wise Comparison)
        If you want to check whether two lists have the same elements in the same order, use equals().

        2. Using containsAll() (Order-Insensitive Comparison)
            If you want to check whether two lists contain the same elements regardless of order:
        */
        // List<String> names2 = new ArrayList<>();
        List<Integer> list11 = Arrays.asList(1, 2, 3);
        List<Integer> list22 = Arrays.asList(3, 2, 1);
        boolean isEqual1 = false;
        boolean isEqual2 = false;
        //Method 1 list comparion using  containsAll() method
        isEqual1 = list11.containsAll(list22);
        isEqual2 = list22.containsAll(list11);
        System.out.println(isEqual1); // true
        System.out.println(isEqual2); // true

        //Method 2 list comparion using  equals() method
        isEqual1 = list11.equals(list22);  //false
        isEqual2 = list22.equals(list11); //false

        //Method 3 list comparion using Collections.sort() + equals() method
        Collections.sort(list11);
        Collections.sort(list22);

        System.out.println(list11.equals(list22)); // true

        //=======================================================
        /*
        Key Points to Remember for List of Lists

        Declaration: List<List<T>> nestedList = new ArrayList<>();
        Access Elements: nestedList.get(row).get(column);
        Modify Elements: nestedList.get(row).set(column, newValue);

         */
        // Creating a list of lists LIST within List
        List<List<String>> nestedList = new ArrayList<>();

        // Creating inner lists
        List<String> list21 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Mango"));
        List<String> list25 = new ArrayList<>(Arrays.asList("Carrot", "Tomato", "Potato"));

        // Adding inner lists to the outer list
        nestedList.add(list21);
        nestedList.add(list25);

        // Accessing elements
        System.out.println("Nested List: " + nestedList); //[[Apple, Banana, Mango], [Carrot, Tomato, Potato]]
        System.out.println("First List: " + nestedList.get(0)); // Accessing first inner list --> [Apple, Banana, Mango]
        System.out.println("First Element of First List: " + nestedList.get(0).get(0)); // Accessing "Apple"

        //================================================================

        //Modifying Elements in a List of Lists
        List<List<String>> nestedList2 = new ArrayList<>();

        nestedList2.add(new ArrayList<>(Arrays.asList("A", "B", "C")));
        nestedList2.add(new ArrayList<>(Arrays.asList("D", "E", "F")));

        // Modifying an element
        nestedList2.get(0).set(1, "X"); // Changing "B" to "X"

        System.out.println(nestedList2);  //[[A, X, C], [D, E, F]]

        //================================================================
        //Iterating Through a List of Lists

        List<List<Integer>> nestedList3 = new ArrayList<>();

        nestedList3.add(Arrays.asList(1, 2, 3));
        nestedList3.add(Arrays.asList(4, 5, 6));
        nestedList3.add(Arrays.asList(7, 8, 9));

        // Iterating using nested loops
        for (List<Integer> innerList : nestedList3) {
            for (Integer num : innerList) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        /*
                    1 2 3
                    4 5 6
                    7 8 9
         */
    }

}
