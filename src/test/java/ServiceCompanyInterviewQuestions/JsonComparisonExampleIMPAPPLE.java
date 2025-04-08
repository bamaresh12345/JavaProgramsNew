package ServiceCompanyInterviewQuestions;

import java.util.*;

public class JsonComparisonExampleIMPAPPLE {

    public static void main(String[] args) {
        String json1 = "{\"name\":\"John\",\"age\":30, \"city\":\"New York\"}";
        String json2 = "{\"age\":30, \"city\":\"New York\", \"name\":\"John\"}";

       // Map<String, String> map1 = parseJsonToMap(json1);
       // Map<String, String> map2 = parseJsonToMap(json2);

        //boolean isEqual = map1.equals(map2);
        //System.out.println("Are JSONs equal? " + isEqual);

        System.out.println(parseJsonToMap(json1,json2));
    }

    public static boolean parseJsonToMap(String json1,String json2) {
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        // repalce {} and space with nothing ""
          json1 = json1.replaceAll("[{} ]","");
          json2 = json2.replaceAll("[{} ]","");

        // split the jsonString with comma ","
         String[] pairs1  = json1.split(",");
         String[] pairs2  = json2.split(",");


        // run for loop  to split into key pair value for pair1
         for (String pair : pairs1)
         {
             String[] keyValue = pair.split(":");
             String key = keyValue[0].trim();
             String value = keyValue[1].trim();
             map1.put(key,value);
         }

        // run for loop  to split into key pair value for pair2
        for (String pair : pairs2)
        {
            String[] keyValue = pair.split(":");
            String key = keyValue[0].trim();
            String value = keyValue[1].trim();
            map2.put(key,value);
        }

        if(map1.equals(map2))
        {

            return true;
        }
        else
        {
            System.out.println("map1.keySet()  " + map1.keySet());
            System.out.println("map2.keySet()  " + map2.keySet());
            System.out.println("map1.values() " + map1.values());
            System.out.println("map1.values() " +map2.values());

            return false;
        }

    }
}
