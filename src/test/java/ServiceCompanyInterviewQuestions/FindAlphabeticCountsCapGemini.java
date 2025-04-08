package ServiceCompanyInterviewQuestions;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;

public class FindAlphabeticCountsCapGemini {

    public static void main(String[] args) {


        String s = "AABBBCCCCaaaaa";
        findAlphabeticCounts(s);
    }

    public static void findAlphabeticCounts(String s)
    {
        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0) + 1);  //map.getOrDefault *** IMP

        }

        String s2 ="";
        for (Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(entry.getValue() >=1)   // **** IMP****
            {
                s2 = s2+ entry.getKey()+entry.getValue();    // **** IMP****
            }
        }
        System.out.println("maps value --> " +s2);
        }

    }

