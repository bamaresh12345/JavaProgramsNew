package ServiceCompanyInterviewQuestions;



import java.util.*;

public class duplicatechars {



    public static Map<Character,Integer> findDuplicatesChars(String str)
    {
        Map<Character, Integer> map = new HashMap<>();

        if(  str== null || str.trim().length()==0)
        {
            System.out.println("Invalid string");
            return map;
        }

        for (int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);

            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }

        }

        // to PRINT duplicate VLaues entry.getValue()>1
        // to PRINT Unique VLaues entry.getValue()==1
        for (Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(entry.getValue()==1)   //
            {
                System.out.println("Duplicate char : " +entry.getKey() +" --> Duplciate Count : "+ entry.getValue());
            }

        }

        // to PRINT largest duplicate value entry.getValue()> largestValue
        int largestValue=0;
        char largestChar='0';
        for (Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(entry.getValue() > largestValue)
            {
                largestValue = entry.getValue();
                largestChar = entry.getKey();

            }

        }

        System.out.println("larget char : " +largestChar +" --> higesht Count : "+ largestValue);

        return map;

    }
    public static void main(String[] args) {

       // String str = "Better Butter";
        String str = "          ";
        //String str = " ";
        //String str = "";
        //String str = null;  // *** IMP frsit check null and empty string

        System.out.println(findDuplicatesChars(str));
    }
}
