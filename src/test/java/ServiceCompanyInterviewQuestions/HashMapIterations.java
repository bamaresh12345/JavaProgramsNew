package ServiceCompanyInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterations {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Amar", 1);
        map.put("Sham", 2);
        map.put("Ram", 3);


        // 1st for loop to get key and value
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
        System.out.println("***********************");
        // to get only keys and get values from keys using map.get(s)
        for (String s : map.keySet()) {
            System.out.println("map.keySet() : " + s);
            System.out.println("map.keySet() Value : " + map.get(s));
        }
        System.out.println("***********************");
        // to get only values --> will get only values

        for (int s1 : map.values()) {
            System.out.println("map.values() " + s1);
        }
        System.out.println("***********************");
        //stram
        map.forEach((k, v) -> {
            if (v >= 2) {
                System.out.println("Key : " + k + " value : " + v);
            }
        });

    }


}
