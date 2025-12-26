package CharacterPrograms;

public class longestCommonPrefixTest {

    public static String longestCommonPrefix(String[] str)
    {

        String prefix = str[0];

        for (int i=1; i<str.length; i++)
        {
            while(str[i].indexOf(prefix) !=0)
            {
                prefix = prefix.substring(0,prefix.length()-1);
            }

            if(prefix.equals(""))
                return "";
        }

        return prefix;

    }
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(strs));
    }
}
