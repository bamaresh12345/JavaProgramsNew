package ServiceCompanyInterviewQuestions;

import java.util.*;

public class MapToArrayList {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();

        //Adding elements to HashMap

        map.put("John Kevin", "Average");
        map.put("Rakesh Sharma", "Good");
        map.put("Prachi D", "Very Good");
        map.put("Ivan Jose", "Very Bad");
        map.put("Smith Jacob", "Very Good");
        map.put("Anjali N", "Bad");

        List<String> names = new ArrayList<>();
        List<String> performance = new ArrayList<>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            names.add(entry.getKey());
            performance.add(entry.getValue());
        }


        System.out.println("Names form ArrayList\n");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println("\nPerofrmance form ArrayList\n");
        for (int i = 0; i < performance.size(); i++) {
            System.out.println(performance.get(i));
        }

        System.out.println("ArrayList to Map");
        System.out.println("*************************");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " : " + performance.get(i));
        }


    }
}
