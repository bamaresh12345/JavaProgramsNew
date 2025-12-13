package JavaGenerices;

import java.util.*;
/*
 Map<String, Integer> map = new HashMap<>();
  Map<Character, Integer> map = new HashMap<>();
  Map<Integer, Integer> map = new HashMap<>();

 map.put(names[i], 1)
 map.put(c, map.getOrDefault(c, 0) +1 );
 map.containsKey(c);
  map.remove();
  map.size();
  map.equals();
  map.clear();
  map.keySet();                  --> for (String/Integer s : map.keySet())
  map.values();                  --> for (String/Integer s : map.values())
  map.putIfAbsent();

    for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            if (entry.getValue() == 1) {  //(entry.getValue() > 1)  (Intersection >1 , Union ==1)
                (entry.getValue() > 1)     str =  entry.getKey() + entry.getValue();  //AAAABBBCCCddd--> A4B3c2
                System.out.println("duplicate int -> " + entry.getKey() + "  duplicate count " + entry.getValue());

            }

            //=============================================================
            if (entry.getValue() > largest2) {
                largest2 = entry.getValue();
                largest22 = entry.getKey();

            }
        }


  for (String s : map32.keySet()) {
  System.out.println("map.keySet() : " + s);  // get all keysets
  System.out.println("map.keySet() Value : " + map32.get(s));   /// get values of each key
        }

// to get only values --> will get only values
  for (int s1 : map32.values()) {
       System.out.println("map.values() " + s1);     // get all keysets
        }



 */
public class Generic6SMapsProgram {

    public static void main(String[] args) {

        // map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);


        String[] names = {"ram", "sham", "Bhem"};
        String[] names2 = {"ram", "sham", "Bhem"};
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < names.length; i++) {


            if (map.containsKey(names[i])) {  // ** map.containsKey(names[i]) NOT means cant append+1
                map.put(names[i], map.get(names[i]) + 1);
                //  map.put(names[i],map.getOrDefault(names[i],0)+1 );
            } else {
                map.put(names[i], 1); // 1 or i based on requirement
                //  map.put(names[i], i); // i based on requirement
            }
        }
        int largest = 0;
        String largestString = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {   // if (entry.getValue() == 1) {
                System.out.println("duplicate string " + entry.getKey() + "duplicate count " + entry.getValue());
            }

            //=============================================================
            if (entry.getValue() > largest) {
                largest = entry.getValue();
                largestString = entry.getKey();

            }

           // System.out.println(map.remove());
            System.out.println(map.size());
          //  System.out.println(map.equals());
           // System.out.println(map.clear());
            System.out.println("map.keySet()--> " + map.keySet());  //map.keySet()--> [Bhem, sham, ram]
            System.out.println("map.values()--> " + map.values());  //map.values()--> [1, 1, 1]
         //   System.out.println(map.putIfAbsent());
        }


        //return entry.getKey()  or entry.getValue()

        //==========================================================
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {4, 5, 6, 7, 8, 9};
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            if (map2.containsKey(arr1[i])) {
                map2.put(arr1[i], map2.get(arr1[i]) + 1);
            } else {
                map2.put(arr1[i], 1); // 1 or i based on requirement
            }
        }

        System.out.println(map2);
        for (int j = 0; j < arr2.length; j++) {
            if (map2.containsKey(arr2[j])) {

                map2.put(arr2[j], map2.get(arr1[j]) + 1);
            } else {
                map2.put(arr2[j], 1); // 1 or i based on requirement
            }


        }


        int largest2 = 0;
        int largest22 = 0;
        for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            if (entry.getValue() == 1) {  //(entry.getValue() > 1)
                System.out.println("duplicate int -> " + entry.getKey() + "  duplicate count " + entry.getValue());
            }

            //=============================================================
            if (entry.getValue() > largest2) {
                largest2 = entry.getValue();
                largest22 = entry.getKey();

            }
        }

        //==========================================
        //1. Creating HashMap with default initial capacity and load factor
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();

        //2. Creating HashMap with 30 as initial capacity

        HashMap<String, Integer> map21 = new HashMap<String, Integer>(30);
        //3. Creating HashMap with 30 as initial capacity and 0.5 as load factor

        HashMap<String, Integer> map3 = new HashMap<String, Integer>(30, 0.5f);

        //4. Creating HashMap by copying another HashMap
        HashMap<String, Integer> map4 = new HashMap<String, Integer>(map1);

        //=========================================================

        HashMap<String, Integer> map23 = new HashMap<String, Integer>();

        //Adding key-value pairs
        map23.put("ONE", 1);
        map23.put("TWO", 2);
        map23.put("THREE", 3);
        map23.put("FOUR", 4);

        //Adds key-value pair 'ONE-111' only if it is not present in map
        map23.putIfAbsent("ONE", 111); // will not add as ONE is already presnt

        //Adds key-value pair 'FIVE-5' only if it is not present in map

        map23.putIfAbsent("FIVE", 5);  // will be added

        //Retrieving a value associated with key 'TWO'
        int value = map23.get("TWO");
        System.out.println(value);       //Output : 2

        //Checking whether key '3' exist in map
        System.out.println(map23.containsKey("ONE"));      //Output : true

        //Checking whether value '3.3' exist in map
        System.out.println(map23.containsValue(3));   //Output : true

        //Retrieving the number of key-value pairs present in map
        System.out.println(map23.size());      //Output : 5

        //Clearing the map
        map23.clear();
        //Checking the number of key-value pairs after clearing the map
        System.out.println(map23.size());      //Output : 0

        //Retrieving a value associated with key 'TWO'
        int val = map.get("TWO");
        System.out.println(value);       //Output : 2


        //Retrieving the Key Set
        Set<String> keySet = map23.keySet(); // since map has all unique keys so stored in Set<String> or Set<Integer>
        for (String key : keySet) {
            System.out.println(key);
        }

        //Retrieving the Collection view of values present in map
        Collection<Integer> values = map23.values();
        for (Integer i : values) {
            System.out.println(i);
        }

        // LinkedHashMap<> () maintains the insertion order   **IMP

        //Removing the mapping for the key 'ONE'
        map23.remove("ONE");

        //Removes the mapping for the key 'ONE' only if it is currently mapped to 'CCC'
        map23.remove("ONE", 3);  // NOT removed becase ONE is mapped to 1

        //Removes the mapping for the key 'FIVE' only if it is currently mapped to 'EEE'
        map23.remove("FIVE", "EEE"); // removed if FIVE is mapped to "EEE"

        //Replacing the value associated with 'THREE' to '333'
        map23.replace("THREE", 333); // repalces value of THREE to new value

        //Replacing the value associated with 'FOUR' to '444' only if it is currently mapped to 'DDD'
        map23.replace("FOUR", 444, 555);

        Map<String, Integer> map32 = new HashMap<>();

        map32.put("Amar", 1);
        map32.put("Sham", 2);
        map32.put("Ram", 3);


        // 1st for loop to get key and value
        for (Map.Entry<String, Integer> entry : map32.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
        System.out.println("***********************");
        // to get only keys and get values from keys using map.get(s)
        for (String s : map32.keySet()) {
            System.out.println("map.keySet() : " + s);
            System.out.println("map.keySet() Value : " + map32.get(s));
        }
        System.out.println("***********************");
        // to get only values --> will get only values

        for (int s1 : map32.values()) {
            System.out.println("map.values() " + s1);
        }
        System.out.println("***********************");
        //stram
        map32.forEach((k, v) -> {
            if (v >= 2) {
                System.out.println("Key : " + k + " value : " + v);
            }
        });


        Map<String, Integer> studentMap = new HashMap<String, Integer>();

        studentMap.put("Jyous", 87);
        studentMap.put("Klusener", 82);
        studentMap.put("Xiangh", 91);
        studentMap.put("Lisa", 89);
        studentMap.put("Narayan", 95);
        studentMap.put("Arunkumar", 86);

        //Use Tree map TreeMap<>(studentMap) to sort the array
        Map<String, Integer> sortedStudentMap = new TreeMap<>(studentMap);

        System.out.println(sortedStudentMap);

        //Use TreeMap<>(Collections.reverseOrder()) to sort the array
        Map<String, Integer> sortedStudentMap1 = new TreeMap<>(Collections.reverseOrder());

        sortedStudentMap1.putAll(studentMap);

        System.out.println("Before Sorting : ");
        System.out.println(studentMap);
        System.out.println("After Sorting : ");
        System.out.println(sortedStudentMap1);


        // Creating a Map with String as the key and List of Integers as the value
        Map<String, List<Integer>> map56 = new HashMap<>();

        // Adding some lists to the map
        map56.put("A", new ArrayList<>(Arrays.asList(1, 2, 3)));
        map56.put("B", new ArrayList<>(Arrays.asList(4, 5, 6)));
        map56.put("C", new ArrayList<>(Arrays.asList(7, 8, 9)));

        // Printing the map
        System.out.println("Map with Lists: " + map56);  //Map with Lists: {A=[1, 2, 3], B=[4, 5, 6], C=[7, 8, 9]}

        // Accessing a List from the map
        List<Integer> listA = map56.get("A");
        System.out.println("List associated with key 'A': " + listA);  //List associated with key 'A': [1, 2, 3]

        // Iterating through the map
        for (Map.Entry<String, List<Integer>> entry : map56.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Values: " + entry.getValue());
        }
            /*
            Key: A, Values: [1, 2, 3]
            Key: B, Values: [4, 5, 6]
            Key: C, Values: [7, 8, 9]
             */


        // Creating a Map with String as the key and List of Strings (students) as the value
        Map<String, List<String>> classMap = new HashMap<>();

        // Adding lists of student names to the map
        classMap.put("Math", new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie")));
        classMap.put("Science", new ArrayList<>(Arrays.asList("David", "Eve", "Frank")));
        classMap.put("History", new ArrayList<>(Arrays.asList("Grace", "Hannah", "Ian")));

        // Printing the entire map
        System.out.println("Classes with Students: " + classMap);
        //Classes with Students: {Math=[Alice, Bob, Charlie], Science=[David, Eve, Frank], History=[Grace, Hannah, Ian]}

        // Accessing a list of students from the map
        List<String> mathStudents = classMap.get("Math");
        System.out.println("Students in Math class: " + mathStudents);  //Students in Math class: [Alice, Bob, Charlie]

        // Adding a new student to an existing class
        classMap.get("Math").add("Jack");
        System.out.println("Updated Math class: " + classMap.get("Math"));  // Updated Math class: [Alice, Bob, Charlie, Jack]

        // Iterating through the map to print each class and its students
        for (Map.Entry<String, List<String>> entry : classMap.entrySet()) {
            System.out.println("Class: " + entry.getKey() + ", Students: " + entry.getValue());
        }


        // myHashMap has integers for both keys and values
        Map<Integer,Integer> myHashMap= new HashMap<>();
        myHashMap.put(4, 83);
        System.out.println(myHashMap.get(4)); // Prints 83
        System.out.println(myHashMap.containsKey(4)); // Prints true
        System.out.println(myHashMap.containsKey(854)); // Prints false
    }


}
