package ServiceCompanyInterviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElementsInArrayIMP3WAYS {

    public static void main(String[] args) {

        String[] arr = {"java","c","paython","java","c","java"};
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if(arr[i].equals(arr[j]))
                {
                    System.out.println("duplicate element -> : " +arr[i]);
                   flag = true;
                }
            }
        }

        if(flag == false)
        {
            System.out.println("duplicate eellments not found ");
        }


        System.out.println("******************************* ");
        // Find duplicate elements using sets
        Set<String> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if (set.add(arr[i]) == false)
            {   System.out.println(" set duplicate elements -> : " +arr[i]);
            }


        }

        System.out.println("******************************* ");
        findDuplicatechars(arr);




    }


    public static void findDuplicatechars(String[] str){



        Map<String,Integer> map = new HashMap<>();

        for(int i=0; i<str.length; i++)
        {
            String s = str[i];
            if(map.containsKey(s))
            {
                map.put(s, map.get(s)+1);
            }
            else
            {
                map.put(s,1);
            }
        }

        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            if(entry.getValue() > 1) {
                System.out.println("Map Dup char--> " + entry.getKey()+ " | Map Dup count :  " + entry.getValue());
            }
        }

    }
}
