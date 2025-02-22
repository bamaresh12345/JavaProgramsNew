package ArraysStringsLeetCodeFinal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RansomNote {

    public static void checkMagazine(List<String> magazine, List<String> note) {

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < magazine.size(); i++) {
            String s = magazine.get(i);
            map.put(s, map.getOrDefault(s, 0) + 1);   //** IMP or can use old style

        }

        for (int i = 0; i < note.size(); i++) {
            String s = note.get(i);

            if (map.containsKey(s) && map.get(s) != 0)  // ** Very IMP look for old map
            {
                map.put(s, map.get(s) - 1);
            } else {
                System.out.println("No");
                return;
            }

        }
        System.out.println("Yes");

    }


    public static void main(String[] args) {

        List<String> magazine = new ArrayList<>();
        magazine.add("give");
        magazine.add("me");
        magazine.add("one");
        magazine.add("grand");
        magazine.add("today");
        magazine.add("night");

        List<String> note = new ArrayList<>();
        note.add("give");
        note.add("one");
        note.add("grand");
        note.add("today");


        checkMagazine(magazine, note);
    }

}
