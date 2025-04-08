package JavaGenerices;

import java.util.ArrayList;
import java.util.List;

public class TwoDArrayList {

    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();

        //subArray initlization , adding 3 sub lists
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());   // *** IMP  list.add(new ArrayList<>());
        }

        // printing empty list --> it will create 3 new arraylist under main list
        System.out.println(list);  // [] if not above code , if above array is initlized --> [[], [], []]

        //Adding values to ArrayList of list or ArrayIndexOutBound ERROR when above subarry is not initlized
        for (int i = 0; i < list.size(); i++) {   // ** IMP i < list.size()
            for (int j = 0; j < list.size(); j++) {  // ** IMP i < list.size()
                list.get(i).add("test->" + i);       // ** IMP  list.get(i).add("test->" + i)
            }
        }
        System.out.println(list);  // 3 [[test->0, test->0, test->0], [test->1, test->1, test->1], [test->2, test->2, test->2]]
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list2.add("test");
        }

        list.add(list2); // this works
        // add elements
        System.out.println(list);  //[[test->0, test->0, test->0], [test->1, test->1, test->1], [test->2, test->2, test->2], [test, test, test]]
    }
}
