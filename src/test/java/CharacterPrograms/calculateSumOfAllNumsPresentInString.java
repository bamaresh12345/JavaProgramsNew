package CharacterPrograms;

public class calculateSumOfAllNumsPresentInString {


    public static int calculateSumOfAllNumsPresentInString(String str)
    {
        int sum=0;
        String temp="0";
        str = str+"a";   // if  Last letter is Number , this will help  or always append last letter with  str = str+"a";
        char[] chars = str.toCharArray();

        for (int i=0; i<chars.length; i++)
        {
            if(Character.isDigit(chars[i]))
            {
                temp = temp + chars[i];
            }
            else
            {
                sum = sum + Integer.parseInt(temp);
                temp="0";
            }
        }

       //   sum = sum + Integer.parseInt(temp); // if  Last letter is Number , this will help  or always append last letter with  str = str+"a";

        return sum;
    }
    public static void main(String[] args) {
        String str = "1abc23";

        System.out.println(calculateSumOfAllNumsPresentInString(str));
    }
}
