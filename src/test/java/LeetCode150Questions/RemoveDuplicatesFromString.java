package LeetCode150Questions;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromString {
    public static void removeDuplicates(String s) {
        String[] words = s.split(" +");
        Set<String> set = new TreeSet<>(); // ** IMP to retains the insertion Oder also can use LinkedHashSet<>();

        for (int i = 0; i < words.length; i++) {
            set.add(words[i]);
        }

        System.out.println(set);

        String str = "";
        for (String s1 : set)    // imp to Conconicate the string
        {
            str = str + " " + s1;
        }

        System.out.println(str);
    }

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        String s = "I am am amar amar";

        removeDuplicates(s);
    }
}
